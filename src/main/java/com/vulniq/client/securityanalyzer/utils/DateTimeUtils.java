

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

package com.vulniq.client.securityanalyzer.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeUtils
{
    private static Logger logger = LoggerFactory.getLogger(DateTimeUtils.class);

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String formatDateTime(Date date)
    {
        if(date==null)
        {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return sdf.format(date);
    }

    public static Date parseDateTime(String dateString)
    {
        if(dateString==null)
        {
            return null;
        }
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
            return sdf.parse(dateString);
        }
        catch (Exception e)
        {
            logger.error("parseIsoDateTime: Unparsable date value '"+ dateString +"''", e);
            return null;
        }
    }

    public static Date parseWindowsInstallDate(String dateString)
    {
        Date rv = parseYYYYMMDD(dateString);
        if(rv!=null)
        {
            return rv;
        }
        rv = parseIsoDateTime(dateString);
        if(rv!=null)
        {
            return rv;
        }
        rv = parseIsoDateTimeNoTimezone(dateString);
        if(rv!=null)
        {
            return rv;
        }
        return null;
    }

    public static Date parseYYYYMMDD(String dateString)
    {
        if(dateString==null)
        {
            return null;
        }
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            return sdf.parse(dateString);
        }
        catch (Exception e)
        {
            logger.debug("parseYYYYMMDD: Unparsable date value '"+ dateString +"''", e);
            return null;
        }
    }

    /**
     * first tries as ZonedDateTime
     * then as LocalDateTime (converted to UTC instant)
     * @param dateString ISO date ending with a timezone offset or Z
     * @return
     */
    public static Date parseIsoDateTime(String dateString)
    {
        if(dateString==null)
        {
            return null;
        }
        try
        {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString);
            return Date.from(zonedDateTime.toInstant());
        }
        catch (Exception e)
        {
            logger.debug("parseIsoDateTime: Unparsable date value '"+ dateString +"''", e);
            return parseIsoDateTimeNoTimezone(dateString);
        }
    }


    public static Date parseIsoDateTimeNoTimezone(String dateString)
    {
        if(dateString==null)
        {
            return null;
        }
        try
        {
            LocalDateTime localDateTime = LocalDateTime.parse(dateString);
            return Date.from(localDateTime.toInstant(ZoneOffset.UTC));
        }
        catch (Exception e)
        {
            logger.debug("parseIsoDateTimeNoTimezone: Unparsable date value '"+ dateString +"'", e);
            return null;
        }
    }
}
