
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

package com.vulniq.client.securityanalyzer.oval.analyze;

import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import com.vulniq.client.securityanalyzer.oval.error.UnsupportedOVALItemError;
import com.vulniq.client.securityanalyzer.utils.StringUtils;
import com.vulniq.client.securityanalyzer.utils.VersionUtils;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationAnalyzer
{
    public static ResultEnumeration applyOperation(OperationEnumeration operationEnumeration, String dataTypeStr, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        SimpleDatatypeEnumeration dataType = SimpleDatatypeEnumeration.fromValue(dataTypeStr);
        return applyOperation(operationEnumeration, dataType, stateValue, collectedValue);
    }

    public static ResultEnumeration applyOperation(OperationEnumeration operationEnumeration, SimpleDatatypeEnumeration dataType, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        switch (dataType)
        {
            case BINARY:
                return applyOperationBinary(operationEnumeration, stateValue, collectedValue);
            case BOOLEAN:
                return applyOperationBoolean(operationEnumeration, stateValue, collectedValue);
            case DEBIAN_EVR_STRING:
                return applyOperationDebianEvrString(operationEnumeration, stateValue, collectedValue);

            case EVR_STRING:
                return applyOperationEvrString(operationEnumeration, stateValue, collectedValue);
            case FILESET_REVISION:
                throw new UnsupportedOVALItemError("FILESET_REVISION is not supported");
            case FLOAT:
                return applyOperationFloat(operationEnumeration, stateValue, collectedValue);
            case INT:
                return applyOperationInt(operationEnumeration, stateValue, collectedValue);
            case IOS_VERSION:
                //return applyOperationIOSVersion(operationEnumeration, stateValue, collectedValues);
                throw new UnsupportedOVALItemError("IOS_VERSION is not supported");
            case IPV_4_ADDRESS:
                //return applyOperationIPv4Address(operationEnumeration, stateValue, collectedValues);
                throw new UnsupportedOVALItemError("IPV_4_ADDRESS is not supported");
            case IPV_6_ADDRESS:
                //return applyOperationIPv6Address(operationEnumeration, stateValue, collectedValues);
                throw new UnsupportedOVALItemError("IPV_6_ADDRESS is not supported");
            case STRING:
                return applyOperationString(operationEnumeration, stateValue, collectedValue);
            case VERSION:
                return applyOperationVersion(operationEnumeration, stateValue, collectedValue);
        }
        throw new UnsupportedOVALItemError("Unexpected data type=" + dataType);
    }

    /**
     * The string datatype describes standard string data. This datatype conforms to the W3C Recommendation for string data.
     * Expected operations within OVAL for string values are
     * 'equals', 'not equal', 'case insensitive equals', 'case insensitive not equal', 'pattern match'
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     */
    public static ResultEnumeration applyOperationString(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration rv = ResultEnumeration.ERROR;
        String stateStr = String.valueOf(stateValue);
        String collectedStr = String.valueOf(collectedValue);
        switch (operationEnumeration)
        {
            case EQUALS:
                if(stateStr.equals(collectedStr))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case NOT_EQUAL:
                if(!stateStr.equals(collectedStr))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case CASE_INSENSITIVE_EQUALS:
                if(stateStr.equalsIgnoreCase(collectedStr))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case CASE_INSENSITIVE_NOT_EQUAL:
                if(!stateStr.equalsIgnoreCase(collectedStr))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case PATTERN_MATCH:
                Pattern pattern = Pattern.compile(stateStr);
                Matcher matcher = pattern.matcher(collectedStr);
                if(matcher.find())
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            default:
                throw new UnexpectedOVALEvaluationError("Got an unexpected operation for string type:'" +operationEnumeration+ "'");
        }
        return rv;
    }

    /**
     * The int datatype describes standard integer data.  This datatype conforms to the W3C Recommendation for integer data
     * which follows the standard mathematical concept of the integer numbers.  (no decimal point and infinite range)
     * Expected operations within OVAL for int values are
     * 'equals', 'not equal', 'greater than', 'greater than or equal', 'less than',
     * 'less than or equal', 'bitwise and', and 'bitwise or'
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     */
    public static ResultEnumeration applyOperationInt(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration rv = ResultEnumeration.ERROR;
        long stateInt = StringUtils.parseLong(String.valueOf(stateValue), 0);
        long collectedInt = StringUtils.parseLong(String.valueOf(collectedValue), 0);
        switch (operationEnumeration)
        {
            case BITWISE_AND:
                if( (stateInt & collectedInt) == stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case BITWISE_OR:
                if( (stateInt | collectedInt) == stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case EQUALS:
                if(stateInt == collectedInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case GREATER_THAN:
                if(collectedInt > stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case GREATER_THAN_OR_EQUAL:
                if(collectedInt >= stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case LESS_THAN:
                if(collectedInt < stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case LESS_THAN_OR_EQUAL:
                if(collectedInt <= stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case NOT_EQUAL:
                if(collectedInt != stateInt)
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            default:
                throw new UnexpectedOVALEvaluationError("Got an unexpected operation for int type:'" +operationEnumeration+ "'");
        }
        return rv;
    }
    /**
     * The binary datatype is used to represent hex-encoded data that is in raw (non-printable) form.
     * This datatype conforms to the W3C Recommendation for binary data meaning that each binary octet
     * is encoded as a character tuple, consisting of two hexadecimal digits {[0-9a-fA-F]} representing the octet code.
     * Expected operations within OVAL for binary values are 'equals' and 'not equal'.
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     */
    public static ResultEnumeration applyOperationBinary(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        String stateValueStr = String.valueOf(stateValue);
        String collectedValueStr = String.valueOf(collectedValue);
        stateValueStr = stateValueStr.toUpperCase(Locale.ENGLISH);
        collectedValueStr = collectedValueStr.toUpperCase(Locale.ENGLISH);
        ResultEnumeration rv = ResultEnumeration.ERROR;
        switch (operationEnumeration)
        {
            case EQUALS:
                if(stateValueStr.equals(collectedValueStr))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case NOT_EQUAL:
                if(stateValueStr.equals(collectedValueStr))
                {
                    rv = ResultEnumeration.FALSE;
                }
                else
                {
                    rv = ResultEnumeration.TRUE;
                }
                break;
            default:
                throw new UnexpectedOVALEvaluationError("Expected operations within OVAL for binary values are 'equals' and 'not equal'. But got '" +operationEnumeration+ "'");
        }

        return rv;
    }

    /**
     * The boolean datatype represents standard boolean data, either true or false.
     * This datatype conforms to the W3C Recommendation for boolean data meaning that the following literals are legal values:
     * {true, false, 1, 0}.  Expected operations within OVAL for boolean values are 'equals' and 'not equal'.
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     */
    public static ResultEnumeration applyOperationBoolean(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        String valueForState = "false";
        if("true".equals(stateValue) || "1".equals(stateValue) || Boolean.TRUE.equals(stateValue))
        {
            valueForState = "true";
        }
        String valueForCollectedValue = "false";
        if("true".equals(collectedValue) || "1".equals(collectedValue) || Boolean.TRUE.equals(collectedValue))
        {
            valueForCollectedValue = "true";
        }
        ResultEnumeration rv = ResultEnumeration.ERROR;
        switch (operationEnumeration)
        {
            case EQUALS:
                if(valueForState.equals(valueForCollectedValue))
                {
                    rv = ResultEnumeration.TRUE;
                }
                else
                {
                    rv = ResultEnumeration.FALSE;
                }
                break;
            case NOT_EQUAL:
                if(valueForState.equals(valueForCollectedValue))
                {
                    rv = ResultEnumeration.FALSE;
                }
                else
                {
                    rv = ResultEnumeration.TRUE;
                }
                break;
            default:
                throw new UnexpectedOVALEvaluationError("Expected operations within OVAL for boolean values are 'equals' and 'not equal'. But got '" +operationEnumeration+ "'");
        }
        return rv;
    }

    /**
     * The debian_evr_string datatype represents the epoch, upstream_version, and debian_revision fields, for a Debian package,
     * as a single version string. It has the form "EPOCH:UPSTREAM_VERSION-DEBIAN_REVISION".
     * Comparisons involving this datatype should follow the algorithm outlined in Chapter 5 of the "Debian Policy Manual"
     * (https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-version).
     * Note that a null epoch is equivalent to a value of '0'. An implementation of this is the cmpversions()
     * function in dpkg's enquiry.c. Expected operations within OVAL for debian_evr_string values are
     * 'equals', 'not equal', 'greater than', 'greater than or equal', 'less than', and 'less than or equal'.
     *
     * ---From the above mentioned debian doc---
     * When comparing two version numbers, first the epoch of each are compared, then the upstream_version if epoch is equal,
     * and then debian_revision if upstream_version is also equal. epoch is compared numerically.
     * The upstream_version and debian_revision parts are compared by the package management system using the following algorithm:
     *
     * The strings are compared from left to right.
     *
     * First the initial part of each string consisting entirely of non-digit characters is determined. These two parts
     * (one of which may be empty) are compared lexically. If a difference is found it is returned. The lexical comparison is
     * a comparison of ASCII values modified so that all the letters sort earlier than all the non-letters and so that a tilde
     * sorts before anything, even the end of a part. For example, the following parts are in sorted order from earliest to
     * latest: ~~, ~~a, ~, the empty part, a. [7]
     *
     * Then the initial part of the remainder of each string which consists entirely of digit characters is determined. The numerical
     * values of these two parts are compared, and any difference found is returned as the result of the comparison.
     * For these purposes an empty string (which can only occur at the end of one or both version strings being compared) counts as zero.
     *
     * These two steps (comparing and removing initial non-digit strings and initial digit strings) are repeated until a difference
     * is found or both strings are exhausted.
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     */
    public static ResultEnumeration applyOperationDebianEvrString(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = ResultEnumeration.ERROR;
        String collectedValueStr = String.valueOf(collectedValue);

        String stateValueStr = String.valueOf(stateValue);
        
        int comparisonResult = dpkgVerCmp(collectedValueStr, stateValueStr);

        if(comparisonResult == 2)
        {
            return ResultEnumeration.ERROR;
        }
        
        
        if(operationEnumeration == OperationEnumeration.EQUALS)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.NOT_EQUAL)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.FALSE;
            }
            else
            {
                result = ResultEnumeration.TRUE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN)
        {
            if("0:0".equals(stateValueStr) || "0".equals(stateValueStr))
            {
                throw new UnexpectedOVALEvaluationError("State value '" +stateValueStr+ "' using a LESS_THAN operation will always return false and " +
                        "could lead to incorrect results. Some Debian OVAL definitions lack proper version numbers and just contain 0:0 " +
                        "as the version string. Please manually review and evaluate this definition. " +
                        "This is an error in the evaluated definition, not the software.");
            }
            if(comparisonResult == -1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN_OR_EQUAL)
        {
            if(comparisonResult == -1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN)
        {
            if(comparisonResult == 1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN_OR_EQUAL)
        {
            if(comparisonResult == 1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else
        {
            throw new UnsupportedOVALItemError("Unexpected operation:" + operationEnumeration);
        }

        return result;    
    }


    public static ResultEnumeration applyOperationFloat(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = ResultEnumeration.ERROR;

        double collectedDouble = StringUtils.parseDouble(String.valueOf(collectedValue), 0.0);
        double stateDouble = StringUtils.parseDouble(String.valueOf(stateValue), 0.0);
        if(operationEnumeration == OperationEnumeration.EQUALS)
        {
            if(collectedDouble == stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.NOT_EQUAL)
        {
            if(collectedDouble != stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN)
        {

            if(collectedDouble < stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN_OR_EQUAL)
        {

            if(collectedDouble <= stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN)
        {

            if(collectedDouble > stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN_OR_EQUAL)
        {

            if(collectedDouble >= stateDouble)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else
        {
            throw new UnsupportedOVALItemError("Unexpected operation:" + operationEnumeration);
        }

        return result;
    }

    /**
     * The version datatype represents a value that is a hierarchical list of non-negative integers separated by a single character delimiter.
     * Note that any non-number character can be used as a delimiter and that different characters can be used within the same version string.
     * So '#.#-#' is the same as '#.#.#' or '#c#c#' where '#' is any non-negative integer.
     * Expected operations within OVAL for version values are
     * 'equals', 'not equal', 'greater than', 'greater than or equal', 'less than', and 'less than or equal'.
     *
     * WARNING this implementation differs from ovaldi implementation. because I assumed that rpmvercmp will generate the same results
     * @param operationEnumeration
     * @param stateValue
     * @param collectedValue
     * @return
     * @throws UnexpectedOVALEvaluationError
     */
    public static ResultEnumeration applyOperationVersion(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = ResultEnumeration.ERROR;
        String collectedValueStr = String.valueOf(collectedValue);
        String stateValueStr = String.valueOf(stateValue);

        int comparisonResult = enumerationVersionCompare(collectedValueStr, stateValueStr);

        if(operationEnumeration == OperationEnumeration.EQUALS)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.NOT_EQUAL)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.FALSE;
            }
            else
            {
                result = ResultEnumeration.TRUE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN)
        {
            if(comparisonResult == -1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN_OR_EQUAL)
        {
            if(comparisonResult == -1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN)
        {
            if(comparisonResult == 1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN_OR_EQUAL)
        {
            if(comparisonResult == 1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else
        {
            throw new UnsupportedOVALItemError("Unexpected operation:" + operationEnumeration);
        }

        return result;

    }


    public static ResultEnumeration applyOperationEvrString(OperationEnumeration operationEnumeration, Object stateValue, Object collectedValue)
            throws UnexpectedOVALEvaluationError
    {
        ResultEnumeration result = ResultEnumeration.ERROR;
        String collectedValueStr = String.valueOf(collectedValue);
        int collectedEpochInt = StringUtils.parseInt(getEpochFromEVR(collectedValueStr), 0);
        String collectedVersionStr = getVersionFromEVR(collectedValueStr);
        String collectedReleaseStr = getReleaseFromEVR(collectedValueStr);

        String stateValueStr = String.valueOf(stateValue);
        int stateEpochInt = StringUtils.parseInt(getEpochFromEVR(stateValueStr), 0);
        String stateVersionStr = getVersionFromEVR(stateValueStr);
        String stateReleaseStr = getReleaseFromEVR(stateValueStr);

        int comparisonResult = 1;

        if(collectedEpochInt == stateEpochInt)
        {
            comparisonResult = rpmvercmp(collectedVersionStr, stateVersionStr);
            if(comparisonResult == 0)
            {
                comparisonResult = rpmvercmp(collectedReleaseStr, stateReleaseStr);
            }
        }
        else
        {
            if(collectedEpochInt>stateEpochInt)
            {
                comparisonResult = 1;
            }
            else
            {
                comparisonResult = -1;
            }

        }

        if(operationEnumeration == OperationEnumeration.EQUALS)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.NOT_EQUAL)
        {
            if(comparisonResult == 0)
            {
                result = ResultEnumeration.FALSE;
            }
            else
            {
                result = ResultEnumeration.TRUE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN)
        {
            if(comparisonResult == -1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.LESS_THAN_OR_EQUAL)
        {
            if(comparisonResult == -1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN)
        {
            if(comparisonResult == 1)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else if(operationEnumeration == OperationEnumeration.GREATER_THAN_OR_EQUAL)
        {
            if(comparisonResult == 1 || comparisonResult == 0)
            {
                result = ResultEnumeration.TRUE;
            }
            else
            {
                result = ResultEnumeration.FALSE;
            }
        }
        else
        {
            throw new UnsupportedOVALItemError("Unexpected operation:" + operationEnumeration);
        }

        return result;

    }


    public static String getEpochFromEVR(String evr)
    {
        String epoch = VersionUtils.getEpochFromEVR(evr);
        return epoch;
    }

    public static String getVersionFromEVR(String evr)
    {
        String version = VersionUtils.getVersionFromEVR(evr);
        return version;
    }

    public static String getReleaseFromEVR(String evr)
    {
        String release = VersionUtils.getReleaseFromEVR(evr);
        return release;
    }

    public static List<Integer> parseVersion(String versionStr)
    {
        Pattern regex = Pattern.compile("\\d+");
        Matcher matcher = regex.matcher(versionStr);
        List<Integer> rv = new ArrayList<>();
        while(matcher.find())
        {
            rv.add(StringUtils.parseInt(matcher.group(0), 0));
        }
        return rv;
    }

    /** TODO There is a confusion when comparing alphanumerics such as 1b or 3g. Need to learn whether 1 is larger than 1b or lesser.
     *  Then correct the method accordingly.
     * 
     * RPM splits versions in to sections which are compared piece by piece
     * Version/Release strings allowed to have ASCII letters (a-zA-Z), digits (0-9) and separators (._+~)
     * Tilde (~) is special separator and has special meaning/handling
     * Separators are ignored by RPM's comparison - 1+0 == 1.0
     * Letters are sorted before digits - a < 1
     * Letters are compared by their ASCII value - a (97) > A (65)
     * Additional character makes version being higher - 1.1 < 1.10, 1.0 < 1.0.0
     * Tilde (~) makes version being lower - 1.0 > 1.0~, 1.0 > 1.0~rc1
     * Zero (0) after separator handled natively - 1.0 == 1.000
     *
     *
     * return
     *   1: v1 is newer than v2
     *   0: v1 and v2 are the same version
     *  -1: v2 is newer than v1
     */
    public static int rpmvercmp(String v1, String v2)
    {
        if(v1.equals(v2))
        {
            return 0;
        }

        String[] split1 = v1.split("((?<=[^a-zA-Z0-9])|(?=[^a-zA-Z0-9]+))");
        String[] split2 = v2.split("((?<=[^a-zA-Z0-9])|(?=[^a-zA-Z0-9]+))");  //"[^a-zA-Z0-9~]+");
        int x=0;
        int y=0;
        while(x<split1.length && y<split2.length)
        {
            while(x<split1.length && !split1[x].matches("^[a-zA-Z0-9]+$") && !split1[x].equals("~"))
            {
                x++;
            }

            while(y<split2.length && !split2[y].matches("^[a-zA-Z0-9]+$") && !split2[y].equals("~"))
            {
                y++;
            }
            if(! (x<split1.length))
            {
                break;
            }

            if(! (y<split2.length))
            {
                break;
            }

            boolean is1Numeric = false;
            boolean is2Numeric = false;

            int num1 = 0;
            int num2 = 0;
            if(split1[x].matches("^[0-9]+$"))
            {
                is1Numeric = true;
                num1 = StringUtils.parseInt(split1[x], 0);
            }
            if(split2[y].matches("^[0-9]+$"))
            {
                is2Numeric = true;
                num2 = StringUtils.parseInt(split2[y], 0);
            }
            if(is1Numeric && is2Numeric)
            {
                if(num1<num2)
                {
                    return -1;
                }
                if(num1>num2)
                {
                    return 1;
                }
            }
            else
            {

                //string comparison
                if(split1[x].equals("~") && !split2[y].equals("~"))
                {
                    return -1;
                }
                if(!split1[x].equals("~") && split2[y].equals("~"))
                {
                    return 1;
                }
                int strComparisonResult = split1[x].compareTo(split2[y]);
                if(strComparisonResult<0)
                {
                    return -1;
                }
                if(strComparisonResult>0)
                {
                    return 1;
                }
            }
            x++;
            y++;
        }
        if(x==split1.length && y==split2.length)
        {
            return 0;
        }
        if(x<split1.length)
        {
            if(split1[x].equals("~"))
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        else if (y<split2.length)
        {
            if(split2[y].equals("~"))
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }
    
    
    /**
     * The debian_evr_string datatype represents the epoch, upstream_version, and debian_revision fields, for a Debian package,
     * as a single version string. It has the form "EPOCH:UPSTREAM_VERSION-DEBIAN_REVISION".
     * Comparisons involving this datatype should follow the algorithm outlined in Chapter 5 of the "Debian Policy Manual"
     * (https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-version).
     * ---From the above mentioned debian doc---
     * When comparing two version numbers, first the epoch of each are compared, then the upstream_version if epoch is equal,
     * and then debian_revision if upstream_version is also equal. epoch is compared numerically.
     * The upstream_version and debian_revision parts are compared by the package management system using the following algorithm:
     *
     * The strings are compared from left to right.
     *
     * First the initial part of each string consisting entirely of non-digit characters is determined. These two parts
     * (one of which may be empty) are compared lexically. If a difference is found it is returned. The lexical comparison is
     * a comparison of ASCII values modified so that all the letters sort earlier than all the non-letters and so that a tilde
     * sorts before anything, even the end of a part. For example, the following parts are in sorted order from earliest to
     * latest: ~~, ~~a, ~, the empty part, a. [7]
     *
     * Then the initial part of the remainder of each string which consists entirely of digit characters is determined. The numerical
     * values of these two parts are compared, and any difference found is returned as the result of the comparison.
     * For these purposes an empty string (which can only occur at the end of one or both version strings being compared) counts as zero.
     *
     * These two steps (comparing and removing initial non-digit strings and initial digit strings) are repeated until a difference
     * is found or both strings are exhausted.
     * return 
     * 1: v1 is newer than v2 
     * 0: v1 and v2 are the same version 
     * -1: v2 is newer than v1
     */
    
    
    public static int dpkgVerCmp (String evr1, String evr2)
    {
        //DPKG Format: EPOCH:UPSTREAM_VERSION-DEBIAN_REVISION
        boolean hasDebianRevision = false;
        
        String [] splitted1 = evr1.split(":");
        String [] splitted2 = evr2.split(":");
        
        int comparisonResult = 2;
        
        
        if(splitted1.length > 2  && splitted2.length > 2)
        {
            return 2; // Will be handled in applyOperationDebianEvrString
        }
        int epoch1 = 0;
        int epoch2 = 0;
        
        //Firstly, comparing epoch
        if (splitted1.length == 2) 
        {
            if (splitted1[0].isBlank())
            {
                epoch1 = 0;
            }
            else
            {
                epoch1 = Integer.parseInt(splitted1[0]);
            }   
        }
        if (splitted2.length == 2)
        {
            if (splitted2[0].isBlank())
            {
                epoch2 = 0;
            }
            else
            {
                epoch2 = Integer.parseInt(splitted2[0]);
            }    
        }

        if(epoch1 > epoch2)    
        {
            return 1;   
        }
        else if (epoch2 > epoch1)
        {
            return -1;
        }
        else
        {
            String fullVersion1 = splitted1[splitted1.length-1];
            String fullVersion2 = splitted2[splitted2.length-1];
            
            String[] splittedFullVersion1 = fullVersion1.split("-");
            String[] splittedFullVersion2 = fullVersion2.split("-");
            
            String upstreamVersion1;
            String upstreamVersion2;
            
            String debianRevision1 = "";
            String debianRevision2 = "";
            
            
            if(splittedFullVersion1.length == 2)
            {
                upstreamVersion1 = splittedFullVersion1[0];
                debianRevision1 = splittedFullVersion1[1];
                hasDebianRevision = true;
            }
            else
            {
                upstreamVersion1 = splittedFullVersion1[0];
                hasDebianRevision = false;    
            }
            
            if(splittedFullVersion2.length == 2)
            {
                upstreamVersion2 = splittedFullVersion2[0];
                debianRevision2 = splittedFullVersion2[1];
                hasDebianRevision = true;
            }
            else
            {
                upstreamVersion2 = splittedFullVersion2[0];
                hasDebianRevision = false;
            }

            comparisonResult = compareDebianVersion(upstreamVersion1, upstreamVersion2);

            if (hasDebianRevision && comparisonResult == 0)
            {

                comparisonResult = compareDebianVersion(debianRevision1, debianRevision2);

            }
        }

        return comparisonResult;
    }
    
    public static int compareDebianVersion(String v1, String v2)
    {
        //Split the Version String into a String[], grouped according to the comparison algorithm.
        String regex = "(?<=[0-9])(?=[^0-9])|(?=[0-9])(?<=[^0-9])";

        String[] tempVersionArray1 = v1.split(regex);
        String[] tempVersionArray2 = v2.split(regex);
        
        String[] versionArray1;
        String[] versionArray2;
        
        int comparisonResult = 2;
        
        if(tempVersionArray1.length > tempVersionArray2.length)
        {
            versionArray1 = tempVersionArray1;
            versionArray2 = new String[versionArray1.length];
            System.arraycopy(tempVersionArray2, 0, versionArray2, 0, tempVersionArray2.length);
            
            for (int index = 0; index < versionArray2.length; index++)
            {
                if(versionArray2[index] == null)
                {
                    versionArray2[index] = "";
                }                
            }
        }
        else if (tempVersionArray2.length > tempVersionArray1.length)
        {
            versionArray2 = tempVersionArray2;
            versionArray1 = new String[versionArray2.length];
            System.arraycopy(tempVersionArray1, 0, versionArray1, 0, tempVersionArray1.length);
            
            for (int index = 0; index < versionArray1.length; index++)
            {
                if(versionArray1[index] == null)
                {
                    versionArray1[index] = "";
                }                
            }   
        }
        else
        {
            versionArray1 = tempVersionArray1;
            versionArray2 = tempVersionArray2;    
        }
        
        
        String numericRegex = "[0-9]+";
        
        for(int index = 0; index<versionArray1.length; index++)
        {
            boolean isIndex1Numeric = versionArray1[index].matches(numericRegex);
            boolean isIndex2Numeric = versionArray2[index].matches(numericRegex);
            
            if(isIndex1Numeric && isIndex2Numeric)
            {
                comparisonResult = compareDpkgVersionDigitPart(versionArray1[index], versionArray2[index]);    
            }
            else if (!isIndex1Numeric && !isIndex2Numeric)
            {
                comparisonResult = compareDpkgVersionNonDigitPart(versionArray1[index], versionArray2[index]);    
            }
            else if (isIndex1Numeric && !isIndex2Numeric)
            {
                comparisonResult = -1;
            }
            else if (!isIndex1Numeric && isIndex2Numeric)
            {
                comparisonResult = 1;    
            }
            else
            {
                if (index == versionArray1.length - 1)
                {
                    return comparisonResult;
                }
                continue;
            }
            
            if(comparisonResult != 0)
            {
                break;
            }
        }
        return comparisonResult;
    }
    
    public static int compareDpkgVersionDigitPart(String v1, String v2)
    {
        int comparisonResult = 2;

        int numericVersion1 = 0;
        int numericVersion2 = 0;

        if (v1.isBlank())
        {
            numericVersion1 = 0;
        }
        else
        {
            numericVersion1 = Integer.parseInt(v1);
        }
        
        if (v2.isBlank())
        {
            numericVersion2 = 0;
        }
        else
        {
            numericVersion2 = Integer.parseInt(v2);
        }
        
        int difference = numericVersion1 - numericVersion2;
        
        if(difference < 0)
        {
            comparisonResult = -1;
        }
        else if(difference > 0)
        {
            comparisonResult = 1;    
        }
        else
        {
            comparisonResult = 0;
        }
        
        return comparisonResult;
    }
    
    
    public static int compareDpkgVersionNonDigitPart(String v1, String v2)
    {
        char[] v1Array;
        char[] v2Array; 
        if( v1.length() > v2.length())
        {
            v1Array = new char [v1.length()];
            v2Array = new char [v1.length()];   
        }
        else if ( v2.length() > v1.length() )
        {
            v1Array = new char [v2.length()];
            v2Array = new char [v2.length()];    
        }
        else
        {
            v1Array = new char [v1.length()];
            v2Array = new char [v2.length()];    
        }

        v1.getChars(0, v1.length(), v1Array, 0);
        v2.getChars(0, v2.length(), v2Array, 0);
        
        
        for (int index = 0; index < v1Array.length; index++)
        {
            if (v1Array[index] == '~' && v2Array[index] != '~' )
            {
                return -1;
            }
            else if (v1Array[index] != '~' && v2Array[index] == '~' )
            {
                return 1;
            }
            else
            {
                if(v1Array[index] == '~' && v2Array[index] == '~')
                {
                    continue;
                }
                int comparison = Character.compare(v1Array[index], v2Array[index]);
                
                if(comparison > 0)
                {
                    return 1;
                }
                else if (comparison < 0)
                {
                    return -1;
                }
                else
                {
                    if(index == v1Array.length-1)
                    {
                        return 0;
                    }
                    continue;
                }
                
            }
        }
        return 0; // Should never reach here
    }
    
    public static int rpmvercmpDEPRECATED(String v1, String v2)
    {
        if(v1.equals(v2))
        {
            return 0;
        }
        int v1index = 0;
        int v2index = 0;
        int v1Index2 = 0;
        int v2Index2 = 0;
        boolean isCurrentSegmentNumeric = false;

        while(v1index<v1.length() || v2index<v2.length())
        {
            //skip chars if not alpha numeric
            while(v1index<v1.length())
            {
                char tmpChar = v1.charAt(v1index);

                if( ! (StringUtils.isASCIILetter(tmpChar) || Character.isDigit(tmpChar))  && tmpChar!='~')
                {
                    v1index++;
                }
                else
                {
                    break;
                }
            }
            while(v2index<v2.length())
            {
                char tmpChar = v2.charAt(v2index);
                if( ! (StringUtils.isASCIILetter(tmpChar) || Character.isDigit(tmpChar)) && tmpChar!='~')
                {
                    v2index++;
                }
                else
                {
                    break;
                }
            }

            /* handle the tilde separator, it sorts before everything else */
            //Tilde (~) makes version being lower - 1.0 > 1.0~, 1.0 > 1.0~rc1
            if ((v1index<v1.length() && v1.charAt(v1index) == '~') || (v2index<v2.length() && v2.charAt(v2index) == '~'))
            {
                //one of the versions has ~ if the other one is finished or does not have ~ then the one with the tilde is lower
                if(v1index<v1.length() && (v1.charAt(v1index) == '~'))
                {
                    if(v2index<v2.length())
                    {
                        if(v2.charAt(v2index) != '~')
                        {
                            return -1;
                        }
                    }
                    else
                    {
                        //v2 is finished. v1 is lower
                        return -1;
                    }
                }
                if(v2index<v2.length() && (v2.charAt(v1index) == '~'))
                {
                    if(v1index<v1.length())
                    {
                        if(v1.charAt(v1index) != '~')
                        {
                            return 1;
                        }
                    }
                    else
                    {
                        //v1 is finished. v2 is lower
                        return 1;
                    }
                }
                v1index++;
                v2index++;
                continue;
            }

            if(!(v1index<v1.length()) || !(v2index<v2.length()))
            {
                break;
            }
            //
            v1Index2 = v1index;
            v2Index2 = v2index;

            /* grab first completely alpha or completely numeric segment */
            /* leave v1index and v2index pointing to the start of the alpha or numeric */
            /* segment and walk v1Index2 and v2Index2 to end of segment */
            if(Character.isDigit(v1.charAt(v1Index2)))
            {
                isCurrentSegmentNumeric = true;
                while(v1Index2<v1.length())
                {
                    if(Character.isDigit(v1.charAt(v1Index2)))
                    {
                        v1Index2++;
                    }
                    else
                    {
                        break;
                    }
                }
                while(v2Index2<v2.length())
                {
                    if(Character.isDigit(v2.charAt(v2Index2)))
                    {
                        v2Index2++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else
            {
                isCurrentSegmentNumeric = false;
                while(v1Index2<v1.length())
                {
                    if(StringUtils.isASCIILetter(v1.charAt(v1Index2)))
                    {
                        v1Index2++;
                    }
                    else
                    {
                        break;
                    }
                }
                while(v2Index2<v2.length())
                {
                    if(StringUtils.isASCIILetter(v2.charAt(v2Index2)))
                    {
                        v2Index2++;
                    }
                    else
                    {
                        break;
                    }
                }
            }

            String segment1 = v1.substring(v1index, v1Index2);
            String segment2 = v2.substring(v2index, v2Index2);
            /* take care of the case where the two version segments are */
            /* different types: one numeric, the other alpha (i.e. empty) */
            if(v1index == v1Index2)
            {
                return -1;
            }
            if(v2index == v2Index2)
            {
                if(isCurrentSegmentNumeric)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            if(isCurrentSegmentNumeric)
            {
                long longSegment1 = StringUtils.parseLong(segment1, 0);
                long longSegment2 = StringUtils.parseLong(segment2, 0);
                if(longSegment1>longSegment2)
                {
                    return 1;
                }
                if(longSegment1<longSegment2)
                {
                    return -1;
                }
            }

            int strComparisonResult = segment1.compareTo(segment2);
            if(strComparisonResult<0)
            {
                return -1;
            }
            if(strComparisonResult>0)
            {
                return 1;
            }
            v1index = v1Index2;
            v2index = v2Index2;
        }   //while

        /* this catches the case where all numeric and alpha segments have */
        /* compared identically but the segment sepparating characters were */
        /* different */
        if(v1index==v1.length() && v2index==v2.length())
        {
            return 0;
        }
        /* whichever version still has characters left over wins */
        if(v1index<v1.length())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     *  TODO Correct the rpmvercmp method here and change with the original
     * @param v1
     * @param v2
     * @return
     */
    public static int rpmvercmp2(String v1, String v2)//Modified version of rpmvercmp
    {
        if(v1.equals(v2))
        {
            return 0;
        }

        String[] split1 = v1.split("((?<=[^a-zA-Z0-9])|(?=[^a-zA-Z0-9]+))");
        String[] split2 = v2.split("((?<=[^a-zA-Z0-9])|(?=[^a-zA-Z0-9]+))");  //"[^a-zA-Z0-9~]+");
        int x=0;
        int y=0;
        while(x<split1.length && y<split2.length)
        {
            while(x<split1.length && !split1[x].matches("^[a-zA-Z0-9]+$") && !split1[x].equals("~"))
            {
                x++;
            }

            while(y<split2.length && !split2[y].matches("^[a-zA-Z0-9]+$") && !split2[y].equals("~"))
            {
                y++;
            }
            if(! (x<split1.length))
            {
                break;
            }

            if(! (y<split2.length))
            {
                break;
            }

            boolean is1Numeric = false;
            boolean is2Numeric = false;

            int num1 = 0;
            int num2 = 0;
            if(split1[x].matches("^[0-9]+$"))
            {
                is1Numeric = true;
                num1 = StringUtils.parseInt(split1[x], 0);
            }
            if(split2[y].matches("^[0-9]+$"))
            {
                is2Numeric = true;
                num2 = StringUtils.parseInt(split2[y], 0);
            }
            if(is1Numeric && is2Numeric)
            {
                if(num1<num2)
                {
                    return -1;
                }
                if(num1>num2)
                {
                    return 1;
                }
            }
            else if ((is1Numeric || is2Numeric))//Comparison when 1 or 2 is numeric and the other is not
            {
                if (is1Numeric)
                {
                    return 1;  
                }
                if (is2Numeric)
                {
                    return 1;  
                }        
            }
            else
            {

                //string comparison
                if(split1[x].equals("~") && !split2[y].equals("~"))
                {
                    return -1;
                }
                if(!split1[x].equals("~") && split2[y].equals("~"))
                {
                    return 1;
                }
                int strComparisonResult = split1[x].compareTo(split2[y]);
                if(strComparisonResult<0)
                {
                    return -1;
                }
                if(strComparisonResult>0)
                {
                    return 1;
                }
            }
            x++;
            y++;
        }
        if(x==split1.length && y==split2.length)
        {
            return 0;
        }
        if(x<split1.length)
        {
            if(split1[x].equals("~"))
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        else if (y<split2.length)
        {
            if(split2[y].equals("~"))
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }
    
    public static int enumerationVersionCompare(String v1, String v2)
    {
        if(v1.equals(v2))
        {
            return 0;
        }

        String[] split1 = v1.split("[^0-9]+");
        String[] split2 = v2.split("[^0-9]+");
        
        int x=0;
        int y=0;
        if (!(split1.length == split2.length) )
        {
            ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(split1));
            ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(split2));

            
            if (list1.size()>list2.size())
            {
                int difference=(list1.size()-list2.size());
                for (int i=0 ; i<difference ; i++)
                {
                    list2.add("0");
                    
                }
                split2 = list2.toArray(split2);
            }
            else
            {

                int difference=(list2.size()-list1.size());
                for (int i=0 ; i<difference ; i++)
                {
                    list1.add("0");
                    
                }
                split1 = list1.toArray(split1);
            }
        }
        while(x<split1.length && y<split2.length)
        {

            if(! (x<split1.length))
            {
                break;
            }

            if(! (y<split2.length))
            {
                break;
            }

            int num1 = 0;
            int num2 = 0;

            num1 = StringUtils.parseInt(split1[x], 0);

            num2 = StringUtils.parseInt(split2[y], 0);

            if(num1<num2)
            {
                return -1;
            }
            if(num1>num2)
            {
                return 1;
            }
            x++;
            y++;
        }
        return 0;
    }
    

}
