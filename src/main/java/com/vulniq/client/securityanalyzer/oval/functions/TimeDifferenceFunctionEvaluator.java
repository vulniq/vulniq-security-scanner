
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

package com.vulniq.client.securityanalyzer.oval.functions;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.DateTimeFormatEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.TimeDifferenceFunctionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TimeDifferenceFunctionEvaluator extends FunctionEvaluatorBase
{
    private static final Logger logger = LoggerFactory.getLogger(TimeDifferenceFunctionEvaluator.class);
    private final TimeDifferenceFunctionType functionType;
    
    public TimeDifferenceFunctionEvaluator(TimeDifferenceFunctionType functionType, OVALInterpreter interpreter)
    {
        super(interpreter);
        this.functionType = functionType;
    }
    
    public long convertDateTimeToSecondsSinceEpoch(String dateTimeComponent, DateTimeFormatEnumeration dateTimeFormatEnum) throws UnexpectedOVALEvaluationError
    {
        DateTimeFormatter dateTimeFormat;
        long secondsSinceEpoch = 0;
        switch (dateTimeFormatEnum)
        {
            case YEAR_MONTH_DAY:
                dateTimeFormat = new DateTimeFormatterBuilder().appendPattern(
                        "[yyyy/MM/dd][yyyy-MM-dd][yyyyMMdd][yyyy/M/d][yyyy-M-d]").optionalStart().appendPattern(
                        "[ HH:mm:ss]['T'HHmmss]").optionalEnd().parseDefaulting(ChronoField.HOUR_OF_DAY,
                                                                                0).parseDefaulting(
                        ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0).toFormatter();
                try
                {
                    LocalDateTime formattedDateTime = LocalDateTime.parse(dateTimeComponent, dateTimeFormat);
                    secondsSinceEpoch = formattedDateTime.toEpochSecond(ZoneOffset.UTC);
                }
                catch (DateTimeParseException exception)
                {
                    logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                }
                break;
            
            case DAY_MONTH_YEAR:
                
                dateTimeFormat = new DateTimeFormatterBuilder().appendPattern(
                        "[dd/MM/yyyy][dd-MM-yyyy][d/M/yyyy][d-M-yyyy]").optionalStart().appendPattern(
                        " HH:mm:ss").optionalEnd().parseDefaulting(ChronoField.HOUR_OF_DAY, 0).parseDefaulting(
                        ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0).toFormatter();
                try
                {
                    LocalDateTime formattedDateTime = LocalDateTime.parse(dateTimeComponent, dateTimeFormat);
                    secondsSinceEpoch = formattedDateTime.toEpochSecond(ZoneOffset.UTC);
                }
                catch (DateTimeParseException exception)
                {
                    logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                }
                break;
            
            case MONTH_DAY_YEAR: // 'mm/dd/yyyy hh:mm:ss', 'mm/dd/yyyy', 'mm-dd-yyyy hh:mm:ss', 'mm-dd-yyyy', 'NameOfMonth, dd yyyy hh:mm:ss' or 'NameOfMonth, dd yyyy', 'AbbreviatedNameOfMonth, dd yyyy hh:mm:ss', or 'AbbreviatedNameOfMonth, dd yyyy'
                
                dateTimeFormat = new DateTimeFormatterBuilder().appendPattern(
                        "[M/d/yyyy][MM/dd/yyyy][MMMM',' dd yyyy][MM-dd-yyyy][M-d-yyyy][MMM',' dd yyyy]").optionalStart().appendPattern(
                        " HH:mm:ss").optionalEnd().parseDefaulting(ChronoField.HOUR_OF_DAY, 0).parseDefaulting(
                        ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0).toFormatter();
                try
                {
                    LocalDateTime formattedDateTime = LocalDateTime.parse(dateTimeComponent, dateTimeFormat);
                    secondsSinceEpoch = formattedDateTime.toEpochSecond(ZoneOffset.UTC);
                }
                catch (DateTimeParseException exception)
                {
                    logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                }
                break;
            
            case SECONDS_SINCE_EPOCH:
                
                secondsSinceEpoch = Long.parseLong(dateTimeComponent);
                break;
            
            case CIM_DATETIME:
                
                if (dateTimeComponent.indexOf("+") == 21 || dateTimeComponent.indexOf("-") == 21)
                {
                    String offsetInMinutesAsString = dateTimeComponent.substring(22);
                    long offsetInMinutes = Long.parseLong(offsetInMinutesAsString);
                    LocalTime offsetAsLocalTime = LocalTime.MIN.plusMinutes(offsetInMinutes);
                    String offsetAsString = offsetAsLocalTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
                    String dateTimeComponentStringModified = (dateTimeComponent.substring(0, 22) + offsetAsString);
                    
                    dateTimeFormat = DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSSSSSZZZZZ", Locale.US);
                    
                    try
                    {
                        LocalDateTime formattedDateTime = LocalDateTime.parse(dateTimeComponentStringModified,
                                                                              dateTimeFormat);
                        secondsSinceEpoch = formattedDateTime.toEpochSecond(ZoneOffset.UTC);
                    }
                    catch (DateTimeParseException exception)
                    {
                        logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                        throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    }
                }
                else
                {
                    dateTimeFormat = new DateTimeFormatterBuilder().appendPattern(
                            "yyyy-MM-dd HH:mm:ss:mmm").toFormatter();
                    try
                    {
                        LocalDateTime formattedDateTime = LocalDateTime.parse(dateTimeComponent, dateTimeFormat);
                        secondsSinceEpoch = formattedDateTime.toEpochSecond(ZoneOffset.UTC);
                    }
                    catch (DateTimeParseException exception)
                    {
                        logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                        throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    }
    
                }
                break;
    
            case WIN_FILETIME:
                try
                {
                    final long FILETIME_EPOCH_DIFF_IN_MS = 11644473600000L;
    
                    if (!dateTimeComponent.startsWith("0x"))
                    {
                        dateTimeComponent = "0x" + dateTimeComponent;
                    }
                    long milliSeconds = Long.decode(dateTimeComponent) / 10000L - FILETIME_EPOCH_DIFF_IN_MS;
                    FileTime fileTime = FileTime.fromMillis(milliSeconds);
                    Instant fileTimeAsInstant = fileTime.toInstant();
                    secondsSinceEpoch = fileTimeAsInstant.getEpochSecond();
                }
                catch (Exception exception)
                {
                    logger.error("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                    throw new UnexpectedOVALEvaluationError("Date Time Component: " + dateTimeComponent + ", with the format" + dateTimeFormatEnum.toString()  +", cannot be converted to seconds since epoch." );
                }
                break;
            
        }
        return secondsSinceEpoch;
    }
    
    private long getInstantEpoch()
    {
        Instant dateTimeOfInstant = Instant.now();
        return dateTimeOfInstant.getEpochSecond();
    }
    
    private long findTimeDifference (String firstDateTime, DateTimeFormatEnumeration firstFormat, String secondDateTime, DateTimeFormatEnumeration secondFormat) throws UnexpectedOVALEvaluationError
    {
        long firstEpoch = convertDateTimeToSecondsSinceEpoch(firstDateTime,firstFormat);
        long secondEpoch = convertDateTimeToSecondsSinceEpoch(secondDateTime,secondFormat);
        
        return firstEpoch - secondEpoch;
    }
    private List <ComponentGroup> evaluateSingleDateTime (List<ComponentGroup> timeValues) throws UnexpectedOVALEvaluationError
    {
        ArrayList<ComponentGroup> rv = new ArrayList<>();
        DateTimeFormatEnumeration format;
        if(functionType.getFormat1() == DateTimeFormatEnumeration.YEAR_MONTH_DAY && functionType.getFormat2() != DateTimeFormatEnumeration.YEAR_MONTH_DAY)
        {
            format = functionType.getFormat2();
        }
        else if (functionType.getFormat1() != DateTimeFormatEnumeration.YEAR_MONTH_DAY && functionType.getFormat2() == DateTimeFormatEnumeration.YEAR_MONTH_DAY)
        {
            format = functionType.getFormat1();
        }
        else
        {
            format = functionType.getFormat1();
        }
    
        for (ComponentGroup timeValue : timeValues)
        {
            ComponentGroup result = new ComponentGroup();
            result.setDataType(SimpleDatatypeEnumeration.INT);
            long dateTimeEpoch = convertDateTimeToSecondsSinceEpoch(timeValue.getValue(), format);
            long instantEpoch = getInstantEpoch();
            Long timeDifference = instantEpoch - dateTimeEpoch;
            result.setValue(String.valueOf(timeDifference.intValue()));
            rv.add(result);
        }
    
        return rv;
    }
    
    private List <ComponentGroup> evaluateTwoDateTimes (List<ComponentGroup> timeValues) throws UnexpectedOVALEvaluationError
    {
        ArrayList<ComponentGroup> rv = new ArrayList<>();
        DateTimeFormatEnumeration firstFormat = functionType.getFormat1();
        DateTimeFormatEnumeration secondFormat = functionType.getFormat2();
    
        if (timeValues.size() != 2)
        {
            return rv;
        }
        ComponentGroup firstDateTime = timeValues.get(0);
        ComponentGroup secondDateTime = timeValues.get(1);
        Long timeDifference = findTimeDifference(firstDateTime.getValue(), firstFormat, secondDateTime.getValue(),
                                                 secondFormat);
        ComponentGroup result = new ComponentGroup();
        result.setDataType(SimpleDatatypeEnumeration.INT);
        result.setValue(String.valueOf(timeDifference.intValue()));
        rv.add(result);
    
        return rv;
    }
    
    private List<ComponentGroup> evaluateTimeDifferenceFunction(List<List<ComponentGroup>> cartesianProduct) throws UnexpectedOVALEvaluationError
    {
        List<ComponentGroup> rv = new ArrayList<>();
    
        for (List<ComponentGroup> componentGroups : cartesianProduct)
        {
            if (componentGroups.size() == 1)
            {
                List<ComponentGroup> result = evaluateSingleDateTime(componentGroups);
                rv.addAll(result);
            }
            else if (componentGroups.size() == 2)
            {
                List<ComponentGroup> result = evaluateTwoDateTimes(componentGroups);
                rv.addAll(result);
            }
            else
            {
                throw new UnexpectedOVALEvaluationError("No more than two time values can be compared.");
            }
        }
        return rv;
    }
    
    @Override
    protected List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError
    {
        List<List<ComponentGroup>> componentGroups = resolveComponentGroups();
        List<List<ComponentGroup>> cartesianProduct = findCartesianProduct(componentGroups);
        
        if (childResults.isEmpty())
        {
            return evaluateTimeDifferenceFunction(cartesianProduct);
        }
        else
        {
            List<List<ComponentGroup>> childGroups = new ArrayList<>();
            childGroups.add(childResults);
            if (componentGroups.size() > 0)
            {
                for (List<ComponentGroup> groups : cartesianProduct)
                {
                    childGroups.add(groups);
                }
            }
            List<List<ComponentGroup>> cartesianWithChildValues = findCartesianProduct(childGroups);
            return evaluateTimeDifferenceFunction(cartesianWithChildValues);
        }
    }
    
    @Override
    protected List<Object> getComponents()
    {
        return functionType.getObjectComponentOrVariableComponentOrLiteralComponent();
    }
}
