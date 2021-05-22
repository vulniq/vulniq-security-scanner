

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

package com.vulniq.client.securityanalyzer.utils.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CommandOutStreamConsumer implements Runnable
{
    private Logger logger = LoggerFactory.getLogger(CommandOutStreamConsumer.class);

    private StringBuilder sb = new StringBuilder();
    private InputStream inputStream;
    private List<String> command;

    public CommandOutStreamConsumer(InputStream inputStream, List<String> command)
    {
        this.command = command;
        this.inputStream = inputStream;
    }

    public String getOutput()
    {
        return sb.toString();
    }

    @Override
    public void run()
    {
        logger.debug("Entering CommandOutStreamConsumer.run");
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while((line = reader.readLine())!=null)
            {
                sb.append(line);
                sb.append("\n");
            }
            reader.close();
        }
        catch (Exception ex)
        {
            logger.error("Error in CommandOutStreamConsumer for command:'"+command+"'", ex);
        }

    }
}