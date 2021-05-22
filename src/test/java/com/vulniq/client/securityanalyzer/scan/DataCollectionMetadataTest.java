
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

package com.vulniq.client.securityanalyzer.scan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vulniq.client.securityanalyzer.datacollection.DataCollectionMetadata;
import org.junit.Test;

public class DataCollectionMetadataTest
{

    @Test
    public void start()
    {
        DataCollectionMetadata sm = new DataCollectionMetadata();
        sm.start();
        sm.end(true, "11");
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        System.out.println(gson.toJson(sm));
    }
}