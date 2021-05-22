
/*
 *     VulnIQ Security Scanner, Terzi
 *     Copyright (C) 2021  SBOSoft A.S. and its affiliates
 *     Contact : info@vulniq.com www.vulniq.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.windows;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PowerShellRegistrySearchUtils extends PowerShellSearchUtilsBase
{
    private Logger logger = LoggerFactory.getLogger(PowerShellRegistrySearchUtils.class);
    RegistryObject objectDefinition;

    boolean isRegex;
    boolean isRecursive;

    public PowerShellRegistrySearchUtils(DataCollectionTarget target, RegistryObject objectDefinition)
    {
        super(target);
        this.objectDefinition = objectDefinition;
    }

    @Override
    public String getId()
    {
        return objectDefinition.getId();
    }

    @Override
    protected void setClassProperties()
    {
        if (objectDefinition.getKey() == null || objectDefinition.getKey().getValue() == null)
        {
            isRegex = false;
        }
        else
        {
            isRegex = checkRegexSearchIsOn(objectDefinition.getKey().getValue().getOperation());
        }

        if (objectDefinition.getBehaviors() == null)
        {
            isRecursive = false;
        }
        else
        {
            isRecursive = checkRecursiveSearchIsOn(objectDefinition.getBehaviors().getRecurseDirection());
        }
        logger.debug("setClassProperties isRecursive=" + isRecursive + " isRegex=" + isRegex);
    }

    public String[] getRegistryPath()
    {
        setClassProperties();
        if (objectDefinition.getBehaviors() != null && isWindowsOS64Bit(target))
        {
            if (objectDefinition.getBehaviors().getWindowsView().equals("32_bit"))
            {
                String initialKey = objectDefinition.getKey().getValue().getValue().toString();
                int startIndex = initialKey.toLowerCase().indexOf("SOFTWARE".toLowerCase());
                if (isRegex)
                {
                    int endIndex = startIndex + "SOFTWARE".length() + 1;

                    String key32Bit = initialKey.substring(0, endIndex + 1)
                            + "WOW6432Node\\\\"
                            + initialKey.substring(endIndex + 1);
                    objectDefinition.getKey().getValue().setValue(key32Bit);
                }
                else
                {
                    int endIndex = startIndex + "SOFTWARE".length();

                    String key32Bit = initialKey.substring(0, endIndex + 1)
                            + "WOW6432Node\\"
                            + initialKey.substring(endIndex + 1);
                    objectDefinition.getKey().getValue().setValue(key32Bit);
                }
            }
        }

        if (isRegex)
        {
            String[] pathArray = getRegistryPathRegex();
            return pathArray;
        }
        else if (isRecursive)
        {
            if (objectDefinition.getBehaviors().getRecurseDirection().equals("up"))
            {
                String[] pathArray = getRegistryPathRecurseParent();
                return pathArray;
            }
            else if (objectDefinition.getBehaviors().getRecurseDirection().equals("down"))
            {
                String[] pathArray = getRegistryPathRecurseChild();
                return pathArray;
            }
            else
            {
                String path = getRegistryPathSimple();
                String[] pathArray =
                {
                    path
                };
                return pathArray;
            }
        }
        else
        {
            String path = getRegistryPathSimple();
            String[] pathArray =
            {
                path
            };
            return pathArray;
        }
    }

    private String convertHiveToPath(String hive)
    {
        return "Microsoft.PowerShell.Core\\Registry::" + hive;
    }

    private String stripRegexFromAnchors(String regex)
    {
        if (regex.startsWith("^") || regex.startsWith("\\A"))
        {
            regex = regex.substring(1, regex.length());
        }
        if (regex.endsWith("$") || regex.endsWith("\\Z") || regex.endsWith("\\z"))
        {
            regex = regex.substring(0, regex.length() - 1);
        }
        logger.debug("stripRegexFromAnchors regex=" + regex);
        return regex;
    }

    private String[] splitKeyToPathArray(String hive, String key)
    {
        String splitRegex;
        if (isRegex)
        {
            splitRegex = "\\\\\\\\";
        }
        else
        {
            splitRegex = "\\\\";
        }
        String[] splittedArray = key.split(splitRegex);

        String[] pathArray = new String[splittedArray.length + 1];
        pathArray[0] = hive;
        System.arraycopy(splittedArray, 0, pathArray, 1, splittedArray.length);
        if(logger.isDebugEnabled())
        {
            logger.debug("splitKeyToPathArray pathArray=" + Arrays.asList(pathArray));
        }
        return pathArray;
    }

    private String[] getRegistryPathRegex()
    {
        String hive = convertHiveToPath(objectDefinition.getHive().getValue().toString());
        String key = stripRegexFromAnchors(objectDefinition.getKey().getValue().getValue().toString());
        String[] pathArray = splitKeyToPathArray(hive, key);

        ArrayList<String> matchingPaths = new ArrayList<>();
        matchingPaths.add(hive);

        for (int index = 0; index < pathArray.length; index++)
        {
            ArrayList<String> concatLists = new ArrayList<>();
            for (String matchingPath : matchingPaths)
            {
                ArrayList<String> tempMatchingPaths = new ArrayList<>();
                OSCommandOutput cmdOut;

                if (target.getTargetType() == DataCollectionTargetType.Host)
                {
                    String[] argumentArray =
                    {
                        //TODO escape matchingPath
                        "Get-ChildItem", "'" + matchingPath + "'", "-name"
                    };
                    cmdOut = OSCommandUtils.runCommand(timeout, "powershell", argumentArray);
                }
                else
                {
                    String[] argumentArray =
                    {
                        //TODO escape matchingPath
                        "exec", target.getTargetName(), "powershell", "Get-ChildItem", "'" + matchingPath + "'", "-name"
                    };
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), argumentArray);
                }

                tempMatchingPaths.addAll(matchPath(cmdOut.getStdOut().trim(), pathArray[index + 1]));
                concatLists.addAll(concatMatchingPathsToOriginal(tempMatchingPaths, matchingPath));
            }
            matchingPaths = concatLists;

            if (index == pathArray.length - 2)
            {
                break;
            }
        }
        logger.debug("getRegistryPathRegex matchingPaths=" + matchingPaths);
        return matchingPaths.toArray(new String[matchingPaths.size()]);
    }

    private ArrayList<String> concatMatchingPathsToOriginal(ArrayList<String> tempMatchingPaths, String originalString)
    {
        ArrayList<String> returnList = new ArrayList<>();
        for (String tempString : tempMatchingPaths)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(originalString);
            sb.append("\\");
            sb.append(tempString);
            returnList.add(sb.toString());
        }
        logger.debug("concatMatchingPathsToOriginal returnList=" + returnList);
        return returnList;
    }

    private ArrayList<String> matchPath(String cmdOut, String pathToBeMatched)
    {
        String lines[] = cmdOut.trim().split("\\r?\\n");
        ArrayList<String> matchingList = new ArrayList<>();

        Pattern pattern = Pattern.compile(pathToBeMatched, Pattern.CASE_INSENSITIVE);
        for (String line : lines)
        {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches())
            {
                matchingList.add(line);
            }
        }
        logger.debug("matchPath matchingList=" + matchingList);
        return matchingList;
    }

    private String[] getRegistryPathRecurseParent()
    {
        String hive = convertHiveToPath(objectDefinition.getHive().getValue().toString());
        hive = hive + "\\";

        String key = objectDefinition.getKey().getValue().getValue().toString();

        ArrayList<String> argumentList = new ArrayList<>();
        String command = "powershell";

        int maxDepth = objectDefinition.getBehaviors().getMaxDepth().intValue();
        ArrayList<String> pathList = new ArrayList<>();

        int depthIndex = 0;
        String tempPath;
        while (true)
        {
            tempPath = "'" + hive + key + "'";
            pathList.add(tempPath);

            if (depthIndex == maxDepth || !key.contains("\\"))
            {
                break;
            }
            else
            {
                int lastIndexOf = key.lastIndexOf("\\");
                key = key.substring(0, lastIndexOf);
                depthIndex++;
                pathList.add(",");
            }
        }

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add("exec");
            argumentList.add("terzi-windows");
            argumentList.add("powershell");
        }
        argumentList.add("(Get-Item");
        argumentList.add("-ErrorAction");
        argumentList.add("SilentlyContinue");
        argumentList.add("-path");

        if (objectDefinition.getName().isNil())
        {
            pathList.set(pathList.size() - 1, pathList.get(pathList.size() - 1) + "').PSPath");
            argumentList.addAll(pathList);
        }
        else
        {
            String name = objectDefinition.getName().getValue().getValue().toString();
            argumentList.addAll(pathList);
            argumentList.add("|");
            argumentList.add("Where-Object");
            argumentList.add("{$_.Property");
            argumentList.add(getOperationParameter(objectDefinition.getName().getValue().getOperation()));
            //TODO escape name
            argumentList.add("'" + name + "'}).PSPath");
        }
        logger.debug("getRegistryPathRecurseParent argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String cmdOutContent = handleCmdOutContent(cmdOut);
            List<String> matchedPathList = splitCmdOutToSeparatePaths(cmdOutContent);
            return matchedPathList.toArray(new String[matchedPathList.size()]);
        }
        catch (Exception ex)
        {
            String[] emptyArray =
            {
                ""
            };
            return emptyArray;
        }
    }

    private String[] getRegistryPathRecurseChild()
    {
        String hive = convertHiveToPath(objectDefinition.getHive().getValue().toString());
        hive = hive + "\\";
        String key = objectDefinition.getKey().getValue().getValue().toString();
        ArrayList<String> argumentList = new ArrayList<>();
        String command = "powershell";

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add("exec");
            argumentList.add("terzi-windows");
            argumentList.add("powershell");
        }
        argumentList.add("(Get-ChildItem");
        argumentList.add("-ErrorAction");
        argumentList.add("SilentlyContinue");

        if (objectDefinition.getBehaviors().getMaxDepth().intValue() < 0)
        {
            argumentList.add("-recurse");
        }
        else
        {
            argumentList.add("-depth");
            argumentList.add(String.valueOf(objectDefinition.getBehaviors().getMaxDepth().intValue()-1));
        }

        argumentList.add("-path");

        if (objectDefinition.getName().isNil())
        {
            argumentList.add("'" + hive + key + "').PSPath");
        }
        else
        {
            String name = objectDefinition.getName().getValue().getValue().toString();
            //TODO escape
            argumentList.add("'" + hive + key + "'");
            argumentList.add("|");
            argumentList.add("Where-Object");
            argumentList.add("{$_.Property");
            argumentList.add(getOperationParameter(objectDefinition.getName().getValue().getOperation()));
            //TODO escape name
            argumentList.add("'" + name + "'}).PSPath");
        }
        logger.debug("getRegistryPathRecurseChild argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            String cmdOutContent = handleCmdOutContent(cmdOut);
            List<String> pathList = new ArrayList<>();
            pathList.addAll(splitCmdOutToSeparatePaths(cmdOutContent));

            String simplePath = getRegistryPathSimple();
            if(!"".equals(simplePath))
            {
            pathList.add(simplePath);
            }
            return pathList.toArray(new String[0]);
            
        }
        catch (Exception exceptionFromRecursive)
        {
            try
            {
                String simplePath = getRegistryPathSimple();
                String[] pathArray =
                {
                    simplePath
                };
                return pathArray;
            }
            catch (Exception ExceptionFromSimple)
            {
                String[] emptyArray =
                {
                    ""
                };
                return emptyArray;
            }
        }
    }

    private List<String> splitCmdOutToSeparatePaths(String cmdOutContent)
    {
        String pathSplitRegex = "\\r?\\n";
        String[] splittedArray = cmdOutContent.trim().split(pathSplitRegex);
        return Arrays.asList(splittedArray);
    }

    private String getRegistryPathSimple()
    {
        String hive = convertHiveToPath(objectDefinition.getHive().getValue().toString());
        hive = hive + "\\";
        String key;

        if (objectDefinition.getKey().isNil())
        {
            getRegistryPathSimple(hive);
            return getRegistryPathSimple(hive);
        }
        else if (objectDefinition.getName().isNil())
        {
            key = objectDefinition.getKey().getValue().getValue().toString();
            return getRegistryPathSimple(hive, key);
        }
        else
        {
            key = objectDefinition.getKey().getValue().getValue().toString();
            String name = objectDefinition.getName().getValue().getValue().toString();
            return getRegistryPathSimple(hive, key, name);
        }
    }

    private String getRegistryPathSimple(String hive)
    {
        return getRegistryPathSimple(hive, "");
    }

    private String getRegistryPathSimple(String hive, String key)
    {
        return getRegistryPathSimple(hive, key, "");
    }

    private String getRegistryPathSimple(String hive, String key, String name)
    {
        ArrayList<String> argumentList = new ArrayList<>();
        String command = "powershell";

        if (target.getTargetType() == DataCollectionTargetType.Docker)
        {
            command = TerziConfiguration.getDockerCommand();
            argumentList.add("exec");
            argumentList.add("terzi-windows");
            argumentList.add("powershell");
        }
        argumentList.add("(Get-Item");
        argumentList.add("-ErrorAction");
        argumentList.add("SilentlyContinue");

        argumentList.add("-path");

        if (name.equals(""))
        {
            //TODO escape
            argumentList.add("'" + hive + key + "').PSPath");
        }
        else
        {
            //TODO escape
            argumentList.add("'" + hive + key + "'");
            argumentList.add("|");
            argumentList.add("Where-Object");
            argumentList.add("{$_.Property");
            argumentList.add(getOperationParameter(objectDefinition.getName().getValue().getOperation()));
            argumentList.add("'" + name + "'}).PSPath");
        }
        logger.debug("getRegistryPathSimple argumentList=" + argumentList);
        try
        {
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, command, argumentList.toArray(new String[argumentList.size()]));
            return handleCmdOutContent(cmdOut);
        }
        catch (Exception ex)
        {
            return "";
        }
    }

}
