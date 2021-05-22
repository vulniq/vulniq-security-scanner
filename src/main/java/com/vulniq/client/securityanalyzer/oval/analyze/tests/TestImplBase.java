
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

package com.vulniq.client.securityanalyzer.oval.analyze.tests;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.OVALXMLLoader;
import com.vulniq.client.securityanalyzer.oval.analyze.CheckEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.ExistenceEnumerationAnalyzer;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.OVALObjectImplBase;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.utils.CollectionUtils;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Test;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiTest;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Test;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileTest;

public abstract class TestImplBase
{
    private Logger logger = LoggerFactory.getLogger(TestImplBase.class);
    protected OVALInterpreter ovalInterpreter;

    private TestType test;
    protected ResultEnumeration finalResult;
    protected Map<String, ResultEnumeration> stateEvaluationResults;

    public TestImplBase(OVALInterpreter interpreter, TestType testType)
    {
        this.ovalInterpreter = interpreter;
        this.test = testType;
        this.stateEvaluationResults = new LinkedHashMap<>();
    }

    /**
     * typically should return : testDefinition.getObject().getObjectRef();
     * @return
     */
    public abstract String getObjectId();

    /**
     * typically should return : testDefinition.getState();
     * @return
     */
    public abstract List<StateRefType> getStateRefs();


    public void analyze()
    {
        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(), "Starting to analyze test", null);
        String objectId = getObjectId();
        ObjectType objectType = OVALXMLLoader.loadObject(ovalInterpreter.getDataSourceGuid(), objectId, ovalInterpreter.getOsInfo().getDisplayVersion(), null);
        if(objectType!=null)
        {
            OVALObjectImplBase ovalObject = OVALObjectImplBase.getInstance(objectType, ovalInterpreter);
            if (ovalObject != null)
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Object, objectId, "Loaded object",
                        CollectionUtils.mapFromArgs("comment", objectType.getComment()));
                try
                {
                    if (ovalObject.collect())
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, objectId, "Collected object",
                                CollectionUtils.mapFromArgs("value", ovalObject.getCollectedValues()));
                        doAnalyze(ovalObject);
                    }
                    else
                    {
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, objectId, "Failed to collect object", null);
                    }
                }
                catch (Exception ex)
                {
                    logger.error("Unexpected error evaluating object "+ objectId, ex);
                    finalResult = ResultEnumeration.ERROR;
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, objectId, "Unexpected error while collecting object",
                            CollectionUtils.mapFromArgs("error", ex.getMessage()));
                }
            }
            else
            {
                ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, objectId, "Failed to load object", null);
            }
        }
        else
        {
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Object, objectId, "Failed to load object xml", null);
        }
    }

    /*
        stateEvaluationResults = analyze();
                if (stateEvaluationResults != null)
                {
                    try
                    {
                        finalResult = OperatorAnalyzer.evaluate(test.getStateOperator(), stateEvaluationResults.values());
                    }
                    catch (Exception ex)
                    {
                        logger.error("Error running OperatorAnalyzer.evaluate", ex);
                        finalResult = ResultEnumeration.ERROR;
                    }
                }
                else
                {
                    finalResult = ResultEnumeration.ERROR;
                }
     */

    /**
     * <xsd:documentation>The base type of every test includes an optional notes element and several attributes.
     * The notes section of a test should be used to hold information that might be helpful to someone examining the technical aspects of the test.
     * For example, why certain values have been used by the test, or maybe a link to where further information can be found.
     * Please refer to the description of the NotesType complex type for more information about the notes element.
     * The required comment attribute provides a short description of the test.
     * The optional deprecated attribute signifies that an id is no longer to be used or referenced but the information has
     * been kept around for historic purposes.
     * </xsd:documentation>
     * <xsd:documentation>The required id attribute uniquely identifies each test, and must conform to the format specified by
     * the TestIdPattern simple type. The required version attribute holds the current version of the test.
     * Versions are integers, starting at 1 and incrementing every time a test is modified.</xsd:documentation>
     * <xsd:documentation>
     *     The optional check_existence attribute specifies how many items in the set defined by the OVAL Object must exist for
     *     the test to evaluate to true.
     *     The default value for this attribute is 'at_least_one_exists' indicating that by default the test may evaluate to true
     *     if at least one item defined by the OVAL Object exists on the system.
     *     For example, if a value of 'all_exist' is given, every item defined by the OVAL Object must exist on the
     *     system for the test to evaluate to true. If the OVAL Object uses a variable reference,
     *     then every value of that variable must exist.
     *     Note that a pattern match defines a unique set of matching items found on a system.
     *     So when check_existence = 'all_exist' and a regex matches anything on a system the test will evaluate to true
     *     (since all matching objects on the system were found on the system).
     *     When check_existence = 'all_exist' and a regex does not match anything on a system the test will evaluate to false.
     * </xsd:documentation>
     * <xsd:documentation>
     *     The required check attribute specifies how many items in the set defined by the OVAL Object
     *     (ignoring items with a status of Does Not Exist) must satisfy the state requirements.
     *     For example, should the test check that all matching files have a specified version or that at
     *     least one file has the specified version?  The valid check values are explained in the description of the
     *     CheckEnumeration simple type. Note that if the test does not contain any references to OVAL States,
     *     then the check attribute has no meaning and can be ignored during evaluation.</xsd:documentation>
     * <xsd:documentation>
     *     An OVAL Test evaluates to true if both the check_existence  and check attributes are satisfied during evaluation.
     *     The evaluation result for a test is determined by first evaluating the check_existence attribute.
     *     If the result of evaluating the check_existence attribute is true then the check attribute is evaluated.
     *     An interpreter may choose to always evaluate both the check_existence and the check attributes,
     *     but once the check_existence attribute evaluation has resulted in false the overall test result after
     *     evaluating the check attribute will not be affected.
     * </xsd:documentation>
     * <xsd:documentation>
     *     The optional state_operator attribute provides the logical operator that combines the evaluation results from each
     *     referenced state on a per item basis.  Each matching item is compared to each referenced state.
     *     The result of comparing each state to a single item is combined based on the specified state_operator value
     *     to determine one result for each item. Finally, the results for each item are combined based on the specified check value.
     *     Note that if the test does not contain any references to OVAL States, then the state_operator attribute has no meaning
     *     and can be ignored during evaluation. Referencing multiple states in one test allows ranges of possible values to be expressed.
     *     For example, one state can check that a value greater than 8 is found and another state can check that a value of less
     *     than 16 is found.  In this example the referenced states are combined with a state_operator = 'AND'
     *     indicating that the conditions of all referenced states must be satisfied and that the value must be between 8 AND 16.
     *     The valid state_operation values are explained in the description of the OperatorEnumeration simple type.
     * </xsd:documentation>
     * @param ovalObjectImpl
     */
    public void doAnalyze(OVALObjectImplBase ovalObjectImpl)
    {
        FlagEnumeration objectCollectionStatus = ovalObjectImpl.getCollectionStatus();
        //check existence first
        ResultEnumeration existenceResult = null;
        try
        {
            existenceResult = ovalObjectImpl.getExistenceStatus(test.getCheckExistence());
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object,
                    ovalObjectImpl.getId(), "Existence result",
                    CollectionUtils.mapFromArgs("existenceResult", existenceResult));

        }
        catch (UnexpectedOVALEvaluationError ex)
        {
            logger.error("Error evaluating existence check for test", ex);
            finalResult = ResultEnumeration.ERROR;
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Object, ovalObjectImpl.getId(),
                    "Existence check failed",
                    CollectionUtils.mapFromArgs("error", ex.getMessage()));
            return;
        }

        //If the result of evaluating the check_existence attribute is true then the check attribute is evaluated.
        //otherwise it is not necessary to evaluate check conditions
        if(existenceResult!=ResultEnumeration.TRUE)
        {
            finalResult = existenceResult;

            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Object, ovalObjectImpl.getId(),
                    "Existence check did not evaluate to TRUE. Setting finalResult to existenceResult for the test ",
                    CollectionUtils.mapFromArgs("existenceResult", existenceResult));

            return;
        }

        List<StateRefType> stateRefs = getStateRefs();
        if(stateRefs==null || stateRefs.isEmpty())
        {
            //if the test does not contain any references to OVAL States,
            //then the check attribute has no meaning and can be ignored during evaluation
            //so check existence is the king
            finalResult = existenceResult;
            ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                    "Test does not have any state references. Setting finalResult to existenceResult for the test",
                    CollectionUtils.mapFromArgs("existenceResult", existenceResult));

            return;
        }
        switch (objectCollectionStatus)
        {
            case ERROR:
                if(test.getCheckExistence() == ExistenceEnumeration.ANY_EXIST && (stateRefs==null || stateRefs.isEmpty()))
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is ERROR but existence check is ANY_EXIST and the test has no states. Setting final result to TRUE",
                            null);

                    finalResult = ResultEnumeration.TRUE;
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_WARN, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is ERROR and existence check is not ANY_EXIST and the test has states. Setting final result to ERROR",
                            null);
                    finalResult = ResultEnumeration.ERROR;
                }
                break;
            case NOT_APPLICABLE:
                if(test.getCheckExistence() == ExistenceEnumeration.ANY_EXIST && (stateRefs==null || stateRefs.isEmpty()))
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is NOT_APPLICABLE but existence check is ANY_EXIST and the test has no states. Setting final result to TRUE",
                            null);

                    finalResult = ResultEnumeration.TRUE;
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is NOT_APPLICABLE. Setting final result to NOT_APPLICABLE",
                            null);
                    finalResult = ResultEnumeration.NOT_APPLICABLE;
                }
                break;
            case NOT_COLLECTED:
                if(test.getCheckExistence() == ExistenceEnumeration.ANY_EXIST && (stateRefs==null || stateRefs.isEmpty()))
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is NOT_COLLECTED but existence check is ANY_EXIST and the test has no states. Setting final result to TRUE",
                            null);

                    finalResult = ResultEnumeration.TRUE;
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is NOT_COLLECTED. Setting final result to UNKNOWN",
                            null);
                    finalResult = ResultEnumeration.UNKNOWN;
                }
                break;
            case DOES_NOT_EXIST:
                if(test.getCheckExistence() == ExistenceEnumeration.ANY_EXIST || test.getCheckExistence() == ExistenceEnumeration.NONE_EXIST)
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is DOES_NOT_EXIST but existence check is "+test.getCheckExistence()+". Setting final result to TRUE",
                            null);

                    finalResult = ResultEnumeration.TRUE;
                }
                else
                {
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is DOES_NOT_EXIST. Setting final result to FALSE",
                            null);
                    finalResult = ResultEnumeration.FALSE;
                }
               break;
            case INCOMPLETE:
            case COMPLETE:    //collected all results
                if(stateRefs==null || stateRefs.isEmpty())
                {
                    finalResult = existenceResult;
                    ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_INFO, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                            "Object collection status is "+objectCollectionStatus+" and test has no states. Setting final result to existenceResult",
                            CollectionUtils.mapFromArgs("existenceResult", existenceResult));
                }
                else
                {
                    /*
                     *     The optional state_operator attribute provides the logical operator that combines the evaluation results from each
                     *     referenced state on a per item basis.
                     *     Each matching item is compared to each referenced state.
                     *     The result of comparing each state to a single item is combined based on the specified state_operator value
                     *     to determine one result for each item.
                     *     Finally, the results for each item are combined based on the specified check value.
                     */

                    try
                    {
                        List<ResultEnumeration> resultForCollectedValuesVsStates = ovalObjectImpl.analyzeStates(stateRefs, test.getStateOperator());
                        ResultEnumeration stateResult = CheckEnumerationAnalyzer.evaluate(test.getCheck(), resultForCollectedValuesVsStates);
                        if(objectCollectionStatus==FlagEnumeration.INCOMPLETE)
                        {
                            finalResult = ResultEnumeration.UNKNOWN;
                            if(existenceResult==ResultEnumeration.TRUE)
                            {
                                if (stateResult == ResultEnumeration.FALSE)
                                {
                                    finalResult = ResultEnumeration.FALSE;
                                }
                                else if (stateResult == ResultEnumeration.TRUE && test.getCheck() == CheckEnumeration.AT_LEAST_ONE)
                                {
                                    finalResult = ResultEnumeration.TRUE;
                                }
                            }
                            else
                            {
                                finalResult = existenceResult;
                            }
                        }
                        else
                        {
                            finalResult = ResultEnumeration.ERROR;
                            if(existenceResult==ResultEnumeration.TRUE)
                            {
                                finalResult = stateResult;
                            }
                            else
                            {
                                finalResult = existenceResult;
                            }
                        }

                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_DEBUG, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                                "Object collection status is "+objectCollectionStatus+" and test has states. Final result after evaluating states: " + finalResult,
                                CollectionUtils.mapFromArgs("finalResult", finalResult, "check", test.getCheck(), "stateResults", resultForCollectedValuesVsStates));

                    }
                    catch (UnexpectedOVALEvaluationError unexpectedOVALEvaluationError)
                    {
                        finalResult = ResultEnumeration.ERROR;
                        logger.error("Error evaluating test:" + test.getId(), unexpectedOVALEvaluationError);
                        ovalInterpreter.addLog(OVALInterpreter.LOG_LEVEL_ERROR, OVALInterpreter.OVALTypesForLog.Test, test.getId(),
                                "Object collection status is "+objectCollectionStatus+" and test has states. But an unexpected error occured. Setting final result to ERROR",
                                CollectionUtils.mapFromArgs("error", unexpectedOVALEvaluationError.getMessage()));

                    }
                }
                break;
        }
    }


    public ResultEnumeration getResult()
    {
        if(finalResult==null)
        {
            if(getObjectId() == null)
            {
                finalResult = ResultEnumeration.UNKNOWN;
            }
            else
            {
                analyze();
            }
        }
        return finalResult;
    }

    public static TestImplBase getInstance(OVALInterpreter interpreter, TestType testType)
    {
        if(testType instanceof FileTest)
        {
            UnixFileTestImpl rv = new UnixFileTestImpl(interpreter, testType);
            return rv;
        }
        else if(testType instanceof DpkginfoTest)
        {
            DpkginfoTestImpl rv = new DpkginfoTestImpl(interpreter, (DpkginfoTest)testType);
            return rv;
        }
        else if(testType instanceof Textfilecontent54Test)
        {
            TextFileContent54TestImpl rv = new TextFileContent54TestImpl(interpreter, (Textfilecontent54Test)testType);
            return rv;
        }
        else if(testType instanceof UnameTest)
        {
            UnameTestImpl rv = new UnameTestImpl(interpreter, (UnameTest)testType);
            return rv;
        }
        else if(testType instanceof RpminfoTest)
        {
            RpmInfoTestImpl rv = new RpmInfoTestImpl(interpreter, (RpminfoTest)testType);
            return rv;
        }
        else if(testType instanceof FamilyTest)
        {
            FamilyTestImpl rv = new FamilyTestImpl(interpreter, (FamilyTest)testType);
            return rv;
        }
        else if (testType instanceof Process58Test)
        {
            Process58TestImpl rv = new Process58TestImpl(interpreter, (Process58Test) testType);
            return rv;
        }
        else if (testType instanceof VariableTest)
        {
            VariableTestImpl rv = new VariableTestImpl(interpreter, (VariableTest) testType);
            return rv;
        }
        else if (testType instanceof InetlisteningserversTest)
        {
            InetListeningServersTestImpl rv = new InetListeningServersTestImpl(interpreter, (InetlisteningserversTest) testType);
            return rv;
        }
        else if (testType instanceof XmlfilecontentTest)
        {
            XmlFileContentTestImpl rv = new XmlFileContentTestImpl(interpreter, (XmlfilecontentTest) testType);
            return rv;
        }
        else if (testType instanceof RpmverifyfileTest)
        {
            RpmVerifyFileTestImpl rv = new RpmVerifyFileTestImpl(interpreter, (RpmverifyfileTest) testType);
            return rv;
        }
        else if (testType instanceof org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest)
        {
            WindowsFileTestImpl rv = new WindowsFileTestImpl(interpreter, (org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest) testType);
            return rv;
        }
        else if (testType instanceof RegistryTest)
        {
            RegistryTestImpl rv = new RegistryTestImpl(interpreter, (RegistryTest) testType);
            return rv;
        }
        else if (testType instanceof WmiTest)
        {
            WmiTestImpl rv = new WmiTestImpl(interpreter,(WmiTest) testType);
            return rv;
        }
        else if (testType instanceof Wmi57Test)
        {
            Wmi57TestImpl rv = new Wmi57TestImpl(interpreter,(Wmi57Test) testType);
            return rv;
        }
        else if (testType instanceof CmdletTest)
        {
            CmdletTestImpl rv = new CmdletTestImpl(interpreter,(CmdletTest) testType);
            return rv;
        }
        else if (testType instanceof ServiceTest)
        {
            ServiceTestImpl rv = new ServiceTestImpl(interpreter,(ServiceTest) testType);
            return rv;
        }
        else if (testType instanceof PortTest)
        {
            PortTestImpl rv = new PortTestImpl(interpreter,(PortTest) testType);
            return rv;
        }
        
        throw new UnsupportedOVALItemError("Unsupported test type: " + testType.getId() + " class=" + testType.getClass());
    }

}
