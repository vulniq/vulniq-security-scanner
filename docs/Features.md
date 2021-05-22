# Features

Terzi is an authenticated scanner, meaning that you have to run it on the system that you want to scan.
You cannot scan remote systems (yet).

## System Information

Terzi can collect basic system information from operating systems. This information can be used to create 
software and system inventories.

## Vulnerability scanning

Terzi can report vulnerabilities affecting operating systems or installed software packages.
Terzi does not have a vulnerability database itself, this feature utilizes VulnIQ APIs to report vulnerabilities 
and won't work unless a valid VulnIQ access token is configured in terzi.properties.

**Do NOT use free.vulniq.com for production systems as all operating system and installed software information will be 
sent to free.vulniq.com. VulnIQ does not want to process any sensitive data!**
<br>
Visit https://www.vulniq.com to get your own private VulnIQ instance for 
a very low total cost of ownership.

## Docker 

Terzi can scan running docker containers. Please note, 'running containers', not 'images'. This is different from 
docker image scanners.

Terzi uses operating system commands to collect data and when scanning docker containers it just executes commands using
`docker exec`. 

## OVAL Support

Terzi contains an Open Vulnerability and Assessment Language, OVAL, definition evaluator/interpreter. 
OVAL evaluator supports a limited number of OVAL objects and tests. It is primarily intended for running OVAL definitions published by Linux vendors. 
Windows support is still under development. 

# Known Issues

  - Windows support is still under development and may be considered experimental
  - Finding files using regular expressions, i.e OVAL Unix File Objects, does not generate accurate results when dealing with symbolic links.
  - OVAL variable support is limited. Some object type implementations do not support resolving OVAL variable references, yet.
  - Do NOT run OVAL definitions from untrusted sources. Since Terzi uses operating system commands, 
    just in case malicious OVAL definitions might be used as an attack vector. Terzi takes necessary precautions against such attacks but 
    it's better not to run OVAL definitios from untrusted sources just in case. 
