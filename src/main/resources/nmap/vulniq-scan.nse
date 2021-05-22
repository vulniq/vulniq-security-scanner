-- HEAD --

description = [[
This script lists vulnerabilities affecting a discovered service based on product name and version only.
]]
---
-- @usage
-- nmap -F -sV --script vulniq-scan --script-args "vulniq.url='<vulniq-base-url>', vulniq.token='<access-token>'" <host>
-- You can also provide the full path to the script, if you don't want to deploy it into nmap scripts folder
-- for example:
-- nmap -sV --script=/Users/john/vulniq/vulniq-scan.nse --script-args "vulniq.url='<vulniq-base-url>', vulniq.token='<access-token>'" scanme.nmap.org
-- where
--   vulniq-base-url is the base url for a VulnIQ engine, e.g https://your-private-vulniq.example.com
--   access-token is an access token obtained from the VulnIQ instance

categories = { "default", "safe", "vuln" }
license = "GPLv3"

-- RULE --
local http = require("http")
local stdnse = require("stdnse")
local json = require("json")
local nsedebug = require("nsedebug")


portrule = function(host, port)
	return port.state == "open"
end

local char2hex = function(c)
  return string.format("%%%02X", string.byte(c))
end

local function urlencode(str)
  if str == nil then
    return
  end
  str = str:gsub("\n", "\r\n")
  str = str:gsub("([^%w ])", char2hex)
  str = str:gsub(" ", "+")
  return str
end

-- ACTION --

action = function(host, port)
    local product = port.version['product']
    local version = port.version['version']
    local cpe = ''
    local findings = stdnse.output_table()

    if port.version['cpe'] then
        if port.version['cpe'][1] then
            cpe = port.version['cpe'][1]
        end
    end
    stdnse.debug(2, nsedebug.tostr(port, 1))

    if version == nil then
        findings['info']='Version information is not available, unable to scan service'
        return findings
    end

    stdnse.debug(9, "------Product:" .. product)
    stdnse.debug(9, "------Version:" .. version)
    stdnse.debug(9, "------CPE:" .. cpe)

    local apiPath = '/api/vulnerability/list-by-vpv?resultsPerPage=20&productNamingType=nmap&productName='..urlencode(product)..'&versionName='..urlencode(version)
    if not (cpe == nil or version == nil)  then
        apiPath =  '/api/vulnerability/list-by-cpe?resultsPerPage=20&cpe='..urlencode(cpe)
    end
    local options = {header={}}
    stdnse.debug(1, "VulnIQ apiPath=" .. apiPath)
   
    local outPort = 443
    
    local baseurl, token = stdnse.get_script_args("vulniq.url","vulniq.token")
    local apiurl= baseurl .. apiPath
    options['header']['Authorization'] = "Bearer ".. token
    response = http.get_url(apiurl, options)
    local parseStatus, parsedObj = json.parse(response.body)

    stdnse.debug(9, nsedebug.tostr(response, 1))

    exploited={ ["1"]="Yes", ["0"]="No"}
    if(response.status==200) then
    	for k, v in pairs(parsedObj) do
    		if	(k == "results") then
    			for i, j in pairs(v) do
    			    findings[i] = { j['guid'], j['description'], 'Exploit: ' .. exploited[j['hasExploit']]}
    			end
    		break
    		end
        end
    end
    if not (response.status==200) then
        findings['error']={status='Error from VulnIQ API: status=' .. response.status, error=parsedObj['errors']['error_description']}
    end

    return findings
end