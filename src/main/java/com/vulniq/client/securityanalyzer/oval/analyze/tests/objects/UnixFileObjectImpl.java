

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

package com.vulniq.client.securityanalyzer.oval.analyze.tests.objects;

import com.vulniq.client.securityanalyzer.config.TerziConfiguration;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.datacollection.unix.CollectedUnixFileInfo;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.filesearch.UnixFileSearcher;
import com.vulniq.client.securityanalyzer.oval.error.OSCommandTimedOutError;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.functions.ComponentGroup;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * TODO add variable support
 */
public class UnixFileObjectImpl extends OVALObjectImplBase
{
    private Logger logger = LoggerFactory.getLogger(UnixFileObjectImpl.class);

    private FileObject fileObject;
    
    private String[] foundFilesOrDirectories;

    public UnixFileObjectImpl(OVALInterpreter interpreter, FileObject fileObject)
    {
        super(interpreter);
        this.fileObject = fileObject;
        this.timeout = 240000;
    }


    @Override
    public StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        try
        {
            //String filePath = getFilePath();
            UnixFileSearcher searcher = new UnixFileSearcher(ovalInterpreter,fileObject);
            foundFilesOrDirectories = searcher.findFilesOrDirectories();
            if(searcher.isRegex())
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, getId(),
                        "Potentially incorrect result! Current implementation for regex file searches has some limitations when processing " +
                                "symbolic links. Results of this object and test should be manually verified", null);
                logger.warn("Finding files with regex becomes troublesome with symlinks, please make sure that the results for file search is correct. OVAL Object Id: " +fileObject.getId());
            }
            if(foundFilesOrDirectories == null || foundFilesOrDirectories.length == 0)
            {
                logger.debug("checkExistence foundFilesOrDirectories is null or empty");
                return StatusEnumeration.ERROR;
            }
            return StatusEnumeration.EXISTS;
        }
        catch (FileNotFoundException e)
        {
            logger.error("checkExistence file not found", e);
            return StatusEnumeration.DOES_NOT_EXIST;
        }
        catch (OSCommandTimedOutError  | UnexpectedOVALEvaluationError e)
        {
            logger.error("checkExistence timeout or unexpected error", e);
            return StatusEnumeration.ERROR;
        }
    }

    @Override
    public ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();

        for (String filePath : foundFilesOrDirectories)
        {
            switch (dataCollectionTarget.getTargetType())
            {
                case Docker:
                    OSCommandOutput cmdOut = null;
                    cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), "exec",
                                                       dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                                                       "stat -t --printf='%A\\n%F\\n%g\\n%G\\n%n\\n%s\\n%u\\n%U\\n%W\\n%X\\n%Y\\n%Z' " +
                                                               OSCommandUtils.escapeShellArg(filePath, ovalInterpreter.getOsInfo()));
                    if (cmdOut.isErrorOccured())
                    {
                        addFailedLog(cmdOut.getError());
                        rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                        return rv;
                    }
                    else if (cmdOut.isTimedOut())
                    {
                        addTimedOutLog(timeout);
                        rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                        return rv;
                    }
                    else
                    {
                        CollectedUnixFileInfo fileInfo = new CollectedUnixFileInfo(cmdOut.getStdOut());
                        if (fileInfo.isExists())
                        {
                            rv.addCollectedValue(fileInfo, StatusEnumeration.EXISTS);
                        }
                        else
                        {
                            logger.debug("collectValues file does not exist");
                            rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                        }
                    }
                    break;
                case Host:
                default:
                    File fileOnHost = new File(filePath);
                    if (fileOnHost.exists() && fileOnHost.isFile())
                    {
                        logger.debug("collectValues " + filePath + " exists and is a file");
                        try
                        {
                            PosixFileAttributes fileAttributes = Files.getFileAttributeView(fileOnHost.toPath(),
                                                                                            PosixFileAttributeView.class).readAttributes();
                            CollectedUnixFileInfo fileInfo = new CollectedUnixFileInfo(fileOnHost, fileAttributes);
                            rv.addCollectedValue(fileInfo, StatusEnumeration.EXISTS);
                        }
                        catch (Exception ex)
                        {
                            logger.error("collectValues failed to get file attributes for: " + filePath, ex);
                            addFailedLog(ex);
                            rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                            return rv;
                        }
                    }
                    else
                    {
                        logger.debug("collectValues " + filePath + " does not exist or is not a file");
                        rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                    }
                    break;
            }
        }
        return rv;
    }

    @Override
    public String getId()
    {
        return this.fileObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        return fileObject.getSet();
    }

    public String[] getFoundFilesOrDirectories()
    {
        return foundFilesOrDirectories;
    }
    
    /**
     *
     * @param individualCollectedValue is a FileInfo
     * @param stateType is a FileState (unix)
     * @return
     * @throws Exception
     */
    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType stateType) throws Exception
    {
        FileState state = (FileState) stateType;
        CollectedUnixFileInfo fileInfo = (CollectedUnixFileInfo) individualCollectedValue;
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();
        if(state.getATime()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getATime().getOperation(), state.getATime().getDatatype(), state.getATime().getValue(), fileInfo.getLastAccessTimestamp());
            resultsToBeCombined.add(result);
        }
        if(state.getCTime()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getCTime().getOperation(), state.getCTime().getDatatype(), state.getCTime().getValue(), fileInfo.getCreatedTimestamp());
            resultsToBeCombined.add(result);
        }
        if(state.getFilename()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getFilename().getOperation(),state.getFilename().getDatatype(),state.getFilename().getValue(), fileInfo.getFilename());
            resultsToBeCombined.add(result);
        }
        if(state.getGexec()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getGexec().getOperation(), state.getGexec().getDatatype(), state.getGexec().getValue(), fileInfo.getGroupExec());
            resultsToBeCombined.add(result);
        }
        if(state.getGread()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getGread().getOperation(), state.getGread().getDatatype(), state.getGread().getValue(), fileInfo.getGroupRead());
            resultsToBeCombined.add(result);
        }
        if(state.getGroupId()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getGroupId().getOperation(), state.getGroupId().getDatatype(), state.getGroupId().getValue(), fileInfo.getOwnerGroupId());
            resultsToBeCombined.add(result);
        }

        if(state.getGwrite()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getGwrite().getOperation(), state.getGwrite().getDatatype(), state.getGwrite().getValue(), fileInfo.getGroupWrite());
            resultsToBeCombined.add(result);
        }

        //FIXME fix this
        if(state.getHasExtendedAcl()!=null)
        {
            //ResultEnumeration result = OperationAnalyzer.applyOperation(state.getHasExtendedAcl().getOperation(), state.getHasExtendedAcl().getDatatype(), state.getHasExtendedAcl().getValue(), fileInfo.());
            logger.warn("State has getHasExtendedAcl which is not supported");
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, this.getId(),
                    "State has getHasExtendedAcl which is not supported",
                    CollectionUtils.mapFromArgs("state", state.getId(), "extendedAcl", String.valueOf(state.getHasExtendedAcl().getValue())));
            resultsToBeCombined.add(ResultEnumeration.ERROR);
        }

        if(state.getMTime()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getMTime().getOperation(), state.getMTime().getDatatype(), state.getMTime().getValue(), fileInfo.getLastModificationTimestamp());
            resultsToBeCombined.add(result);
        }
        if(state.getOexec()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getOexec().getOperation(), state.getOexec().getDatatype(), state.getOexec().getValue(), fileInfo.getOtherExec());
            resultsToBeCombined.add(result);
        }
        if(state.getOread()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getOread().getOperation(), state.getOread().getDatatype(), state.getOread().getValue(), fileInfo.getOtherRead());
            resultsToBeCombined.add(result);
        }
        if(state.getOwrite()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getOwrite().getOperation(), state.getOwrite().getDatatype(), state.getOwrite().getValue(), fileInfo.getOtherWrite());
            resultsToBeCombined.add(result);
        }
        if(state.getPath()!=null)
        {
            ResultEnumeration result = null;
            if(state.getPath().getVarRef() != null)
            {
                List<ComponentGroup> componentGroups = this.resolveVariableRef(state.getPath().getVarRef());
                List<ResultEnumeration> tempPathResults = new ArrayList<>();
                for (ComponentGroup componentGroup : componentGroups)
                {
                    ResultEnumeration tempResult = OperationAnalyzer.applyOperation(state.getPath().getOperation(), componentGroup.getDataType(),
                                                     componentGroup.getValue(), fileInfo.getPath());
                    tempPathResults.add(tempResult);
                }
                result = CheckEnumerationAnalyzer.evaluate(state.getPath().getVarCheck(), tempPathResults);
            }
            else
            {
                result = OperationAnalyzer.applyOperation(state.getPath().getOperation(), state.getPath().getDatatype(),
                                                                            state.getPath().getValue(), fileInfo.getPath());
            }
            resultsToBeCombined.add(result);
        }
        if(state.getFilepath()!= null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getFilepath().getOperation(),state.getFilepath().getDatatype(),state.getFilepath().getValue(), fileInfo.getFilepath());
            resultsToBeCombined.add(result);
        }
        if(state.getSgid()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getSgid().getOperation(), state.getSgid().getDatatype(), state.getSgid().getValue(), fileInfo.getGuid());
            resultsToBeCombined.add(result);
        }
        if(state.getSize()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getSize().getOperation(), state.getSize().getDatatype(), state.getSize().getValue(), fileInfo.getSizeInBytes());
            resultsToBeCombined.add(result);
        }
        if(state.getSticky()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getSticky().getOperation(), state.getSticky().getDatatype(), state.getSticky().getValue(), fileInfo.getSticky());
            resultsToBeCombined.add(result);
        }
        if(state.getSuid()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getSuid().getOperation(), state.getSuid().getDatatype(), state.getSuid().getValue(), fileInfo.getSuid());
            resultsToBeCombined.add(result);
        }
        if(state.getType()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getType().getOperation(), state.getType().getDatatype(), state.getType().getValue(), fileInfo.getFileType());
            resultsToBeCombined.add(result);
        }
        if(state.getUexec()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getUexec().getOperation(), state.getUexec().getDatatype(), state.getUexec().getValue(), fileInfo.getUExec());
            resultsToBeCombined.add(result);
        }
        if(state.getUread()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getUread().getOperation(), state.getUread().getDatatype(), state.getUread().getValue(), fileInfo.getUread());
            resultsToBeCombined.add(result);
        }
        if(state.getUserId()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getUserId().getOperation(), state.getUserId().getDatatype(), state.getUserId().getValue(), fileInfo.getOwnerUserId());
            resultsToBeCombined.add(result);
        }
        if(state.getUwrite()!=null)
        {
            ResultEnumeration result = OperationAnalyzer.applyOperation(state.getUwrite().getOperation(), state.getUwrite().getDatatype(), state.getUwrite().getValue(), fileInfo.getUwrite());
            resultsToBeCombined.add(result);
        }
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning:" + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
}
