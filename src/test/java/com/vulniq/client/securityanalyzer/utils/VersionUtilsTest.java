

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

import org.junit.Test;

import static org.junit.Assert.*;

public class VersionUtilsTest {

    @Test
    public void getEpochFromEVR() {
        {
            String evr = "0:2.4.25-3+deb9u5";
            assertEquals("0", VersionUtils.getEpochFromEVR(evr));
        }
        {
            String evr = "2.4.25-3+deb9u5";
            assertEquals("0", VersionUtils.getEpochFromEVR(evr));
        }
        {
            String evr = "1111:2.4.25-3+deb9u5";
            assertEquals("1111", VersionUtils.getEpochFromEVR(evr));
        }

    }

    @Test
    public void getVersionFromEVR() {
        {
            String evr = "0:2.4.25-3+deb9u5";
            assertEquals("2.4.25", VersionUtils.getVersionFromEVR(evr));
        }
        {
            String evr = "2.4.25-3+deb9u5";
            assertEquals("2.4.25", VersionUtils.getVersionFromEVR(evr));
        }
        {
            String evr = "2.4.25";
            assertEquals("2.4.25", VersionUtils.getVersionFromEVR(evr));
        }
    }

    @Test
    public void getReleaseFromEVR() {
        {
            String evr = "0:2.4.25-3+deb9u5";
            assertEquals("3+deb9u5", VersionUtils.getReleaseFromEVR(evr));
        }
        {
            String evr = "2.4.25-3+deb9u5";
            assertEquals("3+deb9u5", VersionUtils.getReleaseFromEVR(evr));
        }
        {
            String evr = "2.4.25";
            assertEquals("", VersionUtils.getReleaseFromEVR(evr));
        }
    }
}