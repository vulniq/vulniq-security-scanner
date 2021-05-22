
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
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTargetType;
import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.analyze.OperationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.OperatorAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.utils.rpm.RpmParser;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandOutput;
import com.vulniq.client.securityanalyzer.utils.os.OSCommandUtils;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateSimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmVerifyFileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * TODO add variable support
 */
public class RpmVerifyFileObjectImpl extends OVALObjectImplBase
{

    private static Logger logger = LoggerFactory.getLogger(RpmVerifyFileObjectImpl.class);
    private RpmverifyfileObject rpmVerifyFileObject;
    private boolean isFilepath;
    private String objectFilepath;
    private String rpmVerificationResult;
    private StatusEnumeration statusForObjectCollection = StatusEnumeration.NOT_COLLECTED;

    public RpmVerifyFileObjectImpl(OVALInterpreter interpreter, RpmverifyfileObject objectDefinition)
    {
        super(interpreter);
        this.rpmVerifyFileObject = objectDefinition;
    }

    /**
     * always returns StatusEnumeration.NOT_COLLECTED because actual existence status is set in verifyPackage
     *
     * @param dataCollectionTarget
     * @return
     */
    @Override
    protected StatusEnumeration checkExistence(DataCollectionTarget dataCollectionTarget)
    {
        return StatusEnumeration.NOT_COLLECTED;
    }

    private void setIsFilepath()
    {
        for (Object objectChild : rpmVerifyFileObject.getRest())
        {
            JAXBElement objectChildJAXB = (JAXBElement) objectChild;
            if ("filepath".equals(objectChildJAXB.getName().getLocalPart()))
            {
                EntityObjectStringType valueOfFilepath = (EntityObjectStringType) objectChildJAXB.getValue();
                isFilepath = (valueOfFilepath.getValue() != null && !valueOfFilepath.getValue().toString().isBlank());
                if(isFilepath)
                {
                    logger.debug("setObjectFilepath rpmVerifyObject is defined with a filepath. filepath=" + objectChildJAXB.getValue());
                    objectFilepath = valueOfFilepath.getValue().toString();
                }
                break;
            }
            else
            {
                isFilepath = false;
            }
        }
    }


    private String createObjectPackageName()
    {
        String name = "";
        String epoch = "(none)";
        String version = "";
        String release = "";
        String arch = "";

        for (Object objectChild : rpmVerifyFileObject.getRest())
        {
            JAXBElement objectChildJAXB = (JAXBElement) objectChild;
            String localPart = objectChildJAXB.getName().getLocalPart();

            switch (localPart)
            {
                case "name":
                    EntityObjectStringType nameObject = (EntityObjectStringType) objectChildJAXB.getValue();
                    name = nameObject.getValue().toString();
                    logger.debug("createObjectPackageName rpmVerifyObject is defined with package name:" + name);
                    break;
                case "epoch":
                    RpmverifyfileObject.Epoch epochObject = (RpmverifyfileObject.Epoch) objectChildJAXB.getValue();
                    if ("".equals(epochObject.getValue().toString()))
                    {
                        epoch = "(none)";
                    }
                    else
                    {
                        epoch = epochObject.getValue().toString();
                    }
                    logger.debug("createObjectPackageName epoch:" + epoch);
                    break;
                case "version":
                    RpmverifyfileObject.Version versionObject = (RpmverifyfileObject.Version) objectChildJAXB.getValue();
                    version = versionObject.getValue().toString();
                    logger.debug("createObjectPackageName version:" + version);
                    break;
                case "release":
                    RpmverifyfileObject.Release releaseObject = (RpmverifyfileObject.Release) objectChildJAXB.getValue();
                    release = releaseObject.getValue().toString();
                    logger.debug("createObjectPackageName release:" + release);
                    break;
                case "arch":
                    EntityObjectStringType archObject = (EntityObjectStringType) objectChildJAXB.getValue();
                    arch = archObject.getValue().toString();
                    logger.debug("createObjectPackageName arch:" + arch);
                    break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        //[name]-[version]-[release].[arch].rpm
        //pyxattr-0.5.1-5.el7.x86_64
        if ("".equals(arch) || "".equals(release) || "".equals(version) || "(none)".equals(epoch))
        {
            stringBuilder.append(name);
        }
        else
        {
            stringBuilder.append(name).append("\\t");
            stringBuilder.append(epoch).append("\\t");
            stringBuilder.append(version).append("\\t");
            stringBuilder.append(release).append("\\t");
            stringBuilder.append(arch);
        }

        String rv = stringBuilder.toString();
        logger.debug("createObjectPackageName objectPackageName:" + rv);
        return rv;
    }

    /**Sets whether the rpm package is defined with a filepath element or a package name element.
     * If the oval object is defined with filepath, first the package name that resides in that path is found and the
     * verification process begins afterwards. If package name is defined at first, then the verification process begins
     * immediately.
     * 
     *
     *
     */
    private void setInitialOVALObjectParameters()
    {
        setIsFilepath();
    }


    private OSCommandOutput verifyPackage(String formattedObjectPackageName, DataCollectionTarget dataCollectionTarget)
    {
        RpmVerifyFileBehaviors rpmFileBehaviors = null;
        OSCommandOutput cmdOut = null;
        for (Object objectChild : rpmVerifyFileObject.getRest())
        {
            JAXBElement objectChildJAXB = (JAXBElement) objectChild;
            if ("behaviors".equals(objectChildJAXB.getName().getLocalPart()))
            {
                rpmFileBehaviors = (RpmVerifyFileBehaviors) objectChildJAXB.getValue();
                break;
            }
        }
        if (rpmFileBehaviors == null)
        {
            logger.debug("verifyPackage rpmFileBehaviors is null. package:" + formattedObjectPackageName);
            if (dataCollectionTarget.getTargetType() == DataCollectionTargetType.Docker)
            {
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(),
                        "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        "rpm -V " + OSCommandUtils.escapeShellArg(formattedObjectPackageName, ovalInterpreter.getOsInfo()));
            }
            else
            { // Verify Whether Below Expression Works
                cmdOut = OSCommandUtils.runCommand(timeout, "rpm", "-V", formattedObjectPackageName);
            }
        }
        else
        {
            String rpmVerifyOptions = addRpmVerifyOptions(rpmFileBehaviors);
            String rpmVerifyArguments = formattedObjectPackageName + " " + rpmVerifyOptions;

            logger.debug("verifyPackage rpmFileBehaviors is set. package:" + formattedObjectPackageName +
                    " rpmVerifyOptions=" + rpmVerifyOptions + " rpmVerifyArguments=" + rpmVerifyArguments);

            if (dataCollectionTarget.getTargetType() == DataCollectionTargetType.Docker)
            {
                cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                        "rpm -V " + OSCommandUtils.escapeShellArg(formattedObjectPackageName, ovalInterpreter.getOsInfo())
                                + " " + rpmVerifyOptions    //<--rpmVerifyOptions are hardcoded, that's why we don't escape
                );
            }
            else
            { // Verify Whether Below Expression Works
                cmdOut = OSCommandUtils.runCommand(timeout, "rpm", "-V", rpmVerifyArguments);
            }
        }
        return cmdOut;
    }

    private String addRpmVerifyOptions(RpmVerifyFileBehaviors behaviors)
    {
        StringBuilder sb = new StringBuilder();

        if (behaviors.isNolinkto())
        {
            sb.append("--nolinkto ");
        }
        if (behaviors.isNomd5())
        {
            sb.append("--nomd5 ");
        }
        if (behaviors.isNosize())
        {
            sb.append("--nosize ");
        }
        if (behaviors.isNouser())
        {
            sb.append("--nouser ");
        }
        if (behaviors.isNogroup())
        {
            sb.append("--nogroup ");
        }
        if (behaviors.isNomtime())
        {
            sb.append("--nomtime ");
        }
        if (behaviors.isNomode())
        {
            sb.append("--nomode ");
        }
        if (behaviors.isNordev())
        {
            sb.append("--nordev ");
        }
        if (behaviors.isNoconfigfiles())
        {
            sb.append("--noconfig ");
        }
        if (behaviors.isNoghostfiles())
        {
            sb.append("--noghost ");
        }
        if (behaviors.isNofiledigest())
        {
            sb.append("--nofiledigest ");
        }
        if (behaviors.isNocaps())
        {
            sb.append("--nocaps ");
        }

        if (sb.length() > 0)
        {
            sb.deleteCharAt(sb.length() - 1);

        }

        return sb.toString();
    }

    @Override
    protected ObjectCollectionResult collectValues(DataCollectionTarget dataCollectionTarget)
    {
        ObjectCollectionResult rv = new ObjectCollectionResult();

        setInitialOVALObjectParameters();

        if (isFilepath)
        {
            EntityItemStringType filepathEntity = new EntityItemStringType();
            filepathEntity.setValue(objectFilepath);
            OSCommandOutput cmdOut = OSCommandUtils.runCommand(timeout, TerziConfiguration.getDockerCommand(), "exec", dataCollectionTarget.getTargetName(), "/bin/bash", "-c",
                    "rpm -qf " + OSCommandUtils.escapeShellArg(objectFilepath, ovalInterpreter.getOsInfo()) + " | xargs rpm --queryformat \"%{NAME}\\t%{EPOCH}\\t%{VERSION}\\t%{RELEASE}\\t%{ARCH}\" -q");
            if (cmdOut.isErrorOccured())
            {
                addFailedLog(cmdOut.getError());
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            }
            else if (cmdOut.isTimedOut())
            {
                addTimedOutLog(timeout);
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            }
            else
            {
                //TODO investigate if we should keep assuming 1 a success
                //exit code is not 0 if there is an error
                if (cmdOut.getExitCode() != 0 && cmdOut.getExitCode() != 1)
                {
                    rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                }
                else
                {
                    String commandOutput = cmdOut.getStdOut();
                    RpmverifyfileItem rpmVerifyFileItem = RpmParser.parseObjectPackageName(commandOutput);
                    rpmVerifyFileItem.setFilepath(filepathEntity);
                    String rpmPackageName = rpmVerifyFileItem.getExtendedName().getValue().toString();
                    OSCommandOutput verifyCmdOut = verifyPackage(rpmPackageName, dataCollectionTarget);
                    if (verifyCmdOut.isErrorOccured())
                    {
                        logger.debug("Error querying rpm info. package:" + rpmPackageName);
                        addFailedLog(verifyCmdOut.getError());
                        rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                    }
                    else if (verifyCmdOut.isTimedOut())
                    {
                        logger.debug("Command timeout querying rpm info. package:" + rpmPackageName);
                        addTimedOutLog(timeout);
                        rv.addItemCollectionStatus(StatusEnumeration.ERROR);
                    }
                    else
                    {
                        //exit code is not 0 or 1 if there is an error
                        if (verifyCmdOut.getExitCode() != 0 && verifyCmdOut.getExitCode() != 1)
                        {
                            logger.debug("Package not found. package:" + rpmPackageName);
                            rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                        }
                        else
                        {
                            logger.debug("Found package. package:" + rpmPackageName);
                            String rpmVerificationResultOutput = verifyCmdOut.getStdOut();
                            RpmverifyfileItem secondRpmVerifyFileItem = RpmParser.parseRpmVerifyOutput(rpmVerificationResultOutput, rpmVerifyFileItem);
                            rv.addCollectedValue(secondRpmVerifyFileItem, StatusEnumeration.EXISTS);
                        }
                    }
                }
            }
        }
        else // If the object is defined without a filepath
        {
            String objectPackageName = createObjectPackageName();
            RpmverifyfileItem rpmVerifyFileItem = RpmParser.parseObjectPackageName(objectPackageName);
            String rpmPackageName = rpmVerifyFileItem.getExtendedName().getValue().toString();
            OSCommandOutput verifyCmdOut = verifyPackage(rpmVerifyFileItem.getExtendedName().getValue().toString(), dataCollectionTarget);
            if (verifyCmdOut.isErrorOccured())
            {
                logger.debug("Error querying rpm info. package:" + rpmPackageName);
                addFailedLog(verifyCmdOut.getError());
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            }
            else if (verifyCmdOut.isTimedOut())
            {
                logger.debug("Command timeout querying rpm info. package:" + rpmPackageName);
                addTimedOutLog(timeout);
                rv.addItemCollectionStatus(StatusEnumeration.ERROR);
            }
            else
            {
                //exit code is not 0 or 1 if there is an error
                if (verifyCmdOut.getExitCode() != 0 && verifyCmdOut.getExitCode() != 1)
                {
                    logger.debug("Package not found. package:" + rpmPackageName);
                    rv.addItemCollectionStatus(StatusEnumeration.DOES_NOT_EXIST);
                }
                else
                {
                    String rpmVerificationResultOutput = verifyCmdOut.getStdOut();
                    logger.debug("Found package. package:" + rpmPackageName);
                    RpmverifyfileItem secondRpmVerifyFileItem = RpmParser.parseRpmVerifyOutput(rpmVerificationResultOutput, rpmVerifyFileItem);
                    rv.addCollectedValue(secondRpmVerifyFileItem, StatusEnumeration.EXISTS);
                }
            }
        }

        if(logger.isDebugEnabled())
        {
            logger.debug("collectValues returning:" + StringUtils.toJson(rv, false));
        }
        return rv;
    }

    @Override
    public String getId()
    {
        return rpmVerifyFileObject.getId();
    }

    @Override
    public Set getChildSet()
    {
        for(Object childElem : rpmVerifyFileObject.getRest())
        {
            if(childElem instanceof Set)
            {
                return (Set)childElem;
            }
        }
        return null;
    }

    @Override
    protected List<ResultEnumeration> evaluateSingleValueVsState(Object individualCollectedValue, StateType state) throws Exception
    {
        RpmverifyfileState rpmVerifyFileState = (RpmverifyfileState) state;

        RpmverifyfileItem collectedRpmInfo = (RpmverifyfileItem) individualCollectedValue;
        List<JAXBElement<? extends EntityStateSimpleBaseType>> stateChildren = rpmVerifyFileState.getRest();
        List<ResultEnumeration> resultsToBeCombined = new LinkedList<>();

        List<ResultEnumeration> tempResultList = new LinkedList<>();// These results will be combined with the state operator to obtain final result
        for (JAXBElement<? extends EntityStateSimpleBaseType> childState : stateChildren)
        {
            String tagName = childState.getName().getLocalPart();

            ResultEnumeration result = ResultEnumeration.NOT_EVALUATED;
            switch (tagName)
            {

                case "name":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getName().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "name" + "' property = " + collectedRpmInfo.getName().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "version":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getVersion().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "version" + "' property = " + collectedRpmInfo.getVersion().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "epoch":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getEpoch().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "epoch" + "' property = " + collectedRpmInfo.getEpoch().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "release":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getRelease().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "release" + "' property = " + collectedRpmInfo.getRelease().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "arch":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getArch().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "arch" + "' property = " + collectedRpmInfo.getArch().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "extended_name":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getExtendedName().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "extended_name" + "' property = " + collectedRpmInfo.getExtendedName().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "filepath":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getFilepath().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "filepath" + "' property = " + collectedRpmInfo.getFilepath().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "readme_file":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getReadmeFile().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "readme_file" + "' property = " + collectedRpmInfo.getReadmeFile().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "license_file":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getLicenseFile().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "license_file" + "' property = " + collectedRpmInfo.getLicenseFile().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "configuration_file":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getConfigurationFile().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "configuration_file" + "' property = " + collectedRpmInfo.getConfigurationFile().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "documentation_file":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getDocumentationFile().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "documentation_file" + "' property = " + collectedRpmInfo.getDocumentationFile().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "ghost_file":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getGhostFile().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "ghost_file" + "' property = " + collectedRpmInfo.getGhostFile().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;

                case "mode_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getModeDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "mode_differs" + "' property = " + collectedRpmInfo.getModeDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "device_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getDeviceDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "device_differs" + "' property = " + collectedRpmInfo.getDeviceDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "ownership_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getOwnershipDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "ownership_differs" + "' property = " + collectedRpmInfo.getOwnershipDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "mtime_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getMtimeDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "mtime_differs" + "' property = " + collectedRpmInfo.getMtimeDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "link_mismatch":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getLinkMismatch().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "link_mismatch" + "' property = " + collectedRpmInfo.getLinkMismatch().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "size_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getSizeDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "size_differs" + "' property = " + collectedRpmInfo.getSizeDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "filedigest_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getFiledigestDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "filedigest_differs" + "' property = " + collectedRpmInfo.getFiledigestDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "capabilities_differ":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getCapabilitiesDiffer().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "capabilities_differ" + "' property = " + collectedRpmInfo.getCapabilitiesDiffer().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "group_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getGroupDiffers().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "group_differs" + "' property = " + collectedRpmInfo.getGroupDiffers().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
                case "md5_differs":
                    result = OperationAnalyzer.applyOperation(childState.getValue().getOperation(), childState.getValue().getDatatype(), childState.getValue().getValue(), collectedRpmInfo.getMd5Differs().getValue().toString());
                    logger.debug("evaluateSingleValueVsState state = " + state.getId() + " " + state.getComment() + " " + "Collected Value for '" + "md5_differs" + "' property = " + collectedRpmInfo.getMd5Differs().getValue().toString() + " result = '" + result + "'");
                    tempResultList.add(result);
                    break;
                    
            }
        }
        ResultEnumeration resultOfASingleState = OperatorAnalyzer.evaluate(rpmVerifyFileState.getOperator(), tempResultList);
        resultsToBeCombined.add(resultOfASingleState);
        if(logger.isDebugEnabled())
        {
            logger.debug("evaluateSingleValueVsState returning: " + resultsToBeCombined);
        }
        return resultsToBeCombined;
    }
    
    @Override
    public Map<String, List<String>> getCollectedItems()
    {
        return null;
    }
    
}
