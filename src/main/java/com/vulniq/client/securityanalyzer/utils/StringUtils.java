
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StringUtils
{
    public static boolean isNullOrBlank (Object object)
    {
        return object == null || object.toString().isBlank();
    }
    public static String emptyStringIfNull(String maybeNull)
    {
        if(maybeNull==null)
        {
            return "";
        }
        return maybeNull;
    }

    public static String substringBeforeFirstOf(String haystack, String needle)
    {
        if(haystack==null)
        {
            return null;
        }
        if(needle==null)
        {
            return haystack;
        }
        int pos = haystack.indexOf(needle);
        if(pos>-1)
        {
            return haystack.substring(0, pos);
        }
        return "";
    }

    public static String substringAfterFirstOf(String haystack, String needle)
    {
        if(haystack==null)
        {
            return null;
        }
        if(needle==null)
        {
            return haystack;
        }
        int pos = haystack.indexOf(needle);
        if(pos>-1)
        {
            return haystack.substring(pos + needle.length());
        }
        return "";
    }

    /**
     * returned value does NOT include startStr or endStr
     * @param haystack
     * @param startStr
     * @param endStr
     * @return
     */
    public static String substringBetween(String haystack, String startStr, String endStr)
    {
        if(haystack==null || startStr==null || endStr==null)
        {
            return null;
        }

        int pos1 = haystack.indexOf(startStr);
        if(pos1>-1)
        {
            int pos2 = haystack.indexOf(endStr, pos1 + startStr.length());
            if(pos2>-1)
            {
                return haystack.substring(pos1 + startStr.length(), pos2);
            }
        }
        return null;
    }


    public static int parseInt(String str, int defaultValue)
    {
        try
        {
            return Integer.parseInt(str);
        }
        catch (Exception ex)
        {
            return defaultValue;
        }
    }

    public static long parseLong(String str, int defaultValue)
    {
        try
        {
            return Long.parseLong(str);
        }
        catch (Exception ex)
        {
            return defaultValue;
        }
    }
    public static Float parseFloat (String str, float defaultValue)
    {
        try
        {
            return Float.parseFloat(str);
        }
        catch (Exception ex)
        {
            return defaultValue;
        }
    }

    public static Double parseDouble(String str, double defaultValue)
    {
        try
        {
            return Double.parseDouble(str);
        }
        catch (Exception ex)
        {
            return defaultValue;
        }
    }

    public static boolean isASCIILetter(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static String convertToAlnumUnderscore(String str)
    {
        if(str == null || str.isEmpty())
        {
            return str;
        }
        String newStr = str.replaceAll("[^a-zA-Z0-9]+", "_");
        return newStr;
    }

    public static String toJson(Object obj, boolean prettyPrint)
    {
        GsonBuilder builder = new GsonBuilder().disableHtmlEscaping();
        if(prettyPrint)
        {
            builder.setPrettyPrinting();
        }
        Gson gson = builder.create();
        return gson.toJson(obj);
    }

    public static String getQuotedStringIfNotEmpty(String openString, String maybeNullString, String closeString)
    {
        if(maybeNullString==null || maybeNullString.isEmpty() || maybeNullString.isBlank())
        {
            return "";
        }
        return openString + maybeNullString + closeString;
    }

    public static String leftPad(String str, int desiredLength, String padStr)
    {
        if(str==null || padStr==null)
        {
            return str;
        }
        if(str.length()>=desiredLength)
        {
            return str;
        }
        if(padStr.length()<1)
        {
            return str;
        }
        int requiredPadLen = desiredLength - str.length();
        int currentLen = 0;
        StringBuilder sb = new StringBuilder(desiredLength);
        while(true)
        {
            if(currentLen + padStr.length()>requiredPadLen)
            {
                sb.append(padStr.substring(0, requiredPadLen - currentLen));
                currentLen = requiredPadLen;
            }
            else
            {
                sb.append(padStr);
                currentLen = currentLen + padStr.length();
            }
            if(currentLen>=requiredPadLen)
            {
                break;
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public static String rightPad(String str, int desiredLength, String padStr)
    {
        if(str==null || padStr==null)
        {
            return str;
        }
        if(str.length()>=desiredLength)
        {
            return str;
        }
        if(padStr.length()<1)
        {
            return str;
        }
        int requiredPadLen = desiredLength - str.length();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<requiredPadLen; i = i + padStr.length())
        {
            sb.append(padStr);
        }
        return sb.toString().substring(0, desiredLength);
    }
    
    /**
     *  This method takes a single string and escapes all of the regular expression characters.
     */
    public static String escapeRegex(String stringToEscape)
    {
        String[] specialCharacters = {"\\", "^", "$", ".", "[", "]", "(", ")", "{", "}", "*", "+", "?", "|"};
        
        for (int index = 0; index < specialCharacters.length; index++)
        {
            if (stringToEscape.contains(specialCharacters[index]))
            {
                stringToEscape = stringToEscape.replace(specialCharacters[index], "\\" + specialCharacters[index]);
            }
        }
        return stringToEscape;
    }

    public static String trim(String str)
    {
        if(str==null)
        {
            return null;
        }
        return str.trim();
    }
}
