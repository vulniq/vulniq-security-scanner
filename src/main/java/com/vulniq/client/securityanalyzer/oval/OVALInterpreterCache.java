
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

package com.vulniq.client.securityanalyzer.oval;

import com.vulniq.client.securityanalyzer.datacollection.DataCollectionTarget;
import com.vulniq.client.securityanalyzer.oval.analyze.tests.objects.ObjectCollectionResult;
import org.mitre.oval.xmlschema.oval_results_5.ResultEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.FlagEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OVALInterpreterCache
{
    private static Logger logger = LoggerFactory.getLogger(OVALInterpreterCache.class);
    private static Map<DataCollectionTarget, Map<String, CollectedObjectCacheEntry>> collectedObjectValuesCache = new HashMap();
    private static Map<DataCollectionTarget, Map<String, ResultEnumerationCacheEntry>> evaluatedTestResultsCache = new HashMap();
    private static Map<DataCollectionTarget, Map<String, ResultEnumerationCacheEntry>> evaluatedDefinitionResultsCache = new HashMap();

    public static long getObjectCacheExpirationMillis()
    {
        //30 minutes
        return 30*60*60*1000;
    }

    public static synchronized CollectedObjectCacheEntry getCollectedObjectFromCache(DataCollectionTarget target, String objectId)
    {
        if(collectedObjectValuesCache.containsKey(target))
        {
            Map<String, CollectedObjectCacheEntry> secondMap = collectedObjectValuesCache.get(target);
            CollectedObjectCacheEntry cacheEntry = secondMap.get(objectId);
            
            if(cacheEntry == null)
            {
                logger.debug("The object is not cached. target=" + target + " objectId=" + objectId);
                return null;
            }
            if(System.currentTimeMillis() - cacheEntry.created > getObjectCacheExpirationMillis())
            {
                //expired
                logger.debug("Expired cache entry. target=" + target + " objectId=" + objectId);
                secondMap.remove(objectId);
                return null;
            }
            logger.debug("Returning cached collected object. target=" + target + " objectId=" + objectId);
            return cacheEntry;
        }
        return null;
    }

    public static void addCollectedObjectToCache(DataCollectionTarget target, String objectId, FlagEnumeration collectionStatus, ObjectCollectionResult collectionResult)
    {
        CollectedObjectCacheEntry cacheEntry = new CollectedObjectCacheEntry(collectionResult, collectionStatus);
        if(!collectedObjectValuesCache.containsKey(target))
        {
            Map<String, CollectedObjectCacheEntry> secondMap = new HashMap<>();
            collectedObjectValuesCache.put(target, secondMap);
        }
        Map<String, CollectedObjectCacheEntry> secondMap = collectedObjectValuesCache.get(target);
        secondMap.put(objectId, cacheEntry);
    }


    public static synchronized ResultEnumeration getCachedTestResult(DataCollectionTarget target, String testId)
    {
        if(evaluatedTestResultsCache.containsKey(target))
        {
            Map<String, ResultEnumerationCacheEntry> secondMap = evaluatedTestResultsCache.get(target);
            ResultEnumerationCacheEntry cacheEntry = secondMap.get(testId);
    
            if(cacheEntry == null)
            {
                logger.debug("The test result is not cached. target=" + target + " testId=" + testId);
                return null;
            }
            if(System.currentTimeMillis() - cacheEntry.created > getObjectCacheExpirationMillis())
            {
                //expired
                logger.debug("Expired cache entry. target=" + target + " testId=" + testId);
                secondMap.remove(testId);
                return null;
            }
            logger.debug("Returning cached test result. target=" + target + " testId=" + testId + " result=" + cacheEntry.result);
            return cacheEntry.result;
        }
        return null;
    }

    public static void addTestResultToCache(DataCollectionTarget target, String testId, ResultEnumeration result)
    {
        ResultEnumerationCacheEntry cacheEntry = new ResultEnumerationCacheEntry(result);
        if(!evaluatedTestResultsCache.containsKey(target))
        {
            Map<String, ResultEnumerationCacheEntry> secondMap = new HashMap<>();
            evaluatedTestResultsCache.put(target, secondMap);
        }
        Map<String, ResultEnumerationCacheEntry> secondMap = evaluatedTestResultsCache.get(target);
        secondMap.put(testId, cacheEntry);
    }


    public static synchronized ResultEnumeration getCachedDefinitionResult(DataCollectionTarget target, String definitionId)
    {
        if(evaluatedDefinitionResultsCache.containsKey(target))
        {
            Map<String, ResultEnumerationCacheEntry> secondMap = evaluatedDefinitionResultsCache.get(target);
            ResultEnumerationCacheEntry cacheEntry = secondMap.get(definitionId);
            if(cacheEntry == null)
            {
                logger.debug("The definition is not cached. target=" + target + " definitionId=" + definitionId);
                return null;
            }
            if(System.currentTimeMillis() - cacheEntry.created > getObjectCacheExpirationMillis())
            {
                //expired
                logger.debug("Expired cache entry. target=" + target + " definitionId=" + definitionId);
                secondMap.remove(definitionId);
                return null;
            }
            logger.debug("Returning cached definition result. target=" + target + " definitionId=" + definitionId + " result=" + cacheEntry.result);
            return cacheEntry.result;
        }
        return null;
    }

    public static void addDefinitionResultToCache(DataCollectionTarget target, String definitionId, ResultEnumeration result)
    {
        ResultEnumerationCacheEntry cacheEntry = new ResultEnumerationCacheEntry(result);
        if(!evaluatedDefinitionResultsCache.containsKey(target))
        {
            Map<String, ResultEnumerationCacheEntry> secondMap = new HashMap<>();
            evaluatedDefinitionResultsCache.put(target, secondMap);
        }
        Map<String, ResultEnumerationCacheEntry> secondMap = evaluatedDefinitionResultsCache.get(target);
        secondMap.put(definitionId, cacheEntry);
    }

    /**
     * collected objects are cached
     */
    public static class CollectedObjectCacheEntry
    {
        public long created = System.currentTimeMillis();
        public FlagEnumeration collectionStatus = null;
        public ObjectCollectionResult collectionResult;

        public CollectedObjectCacheEntry(ObjectCollectionResult collectionResult, FlagEnumeration collectionStatus)
        {
            this.collectionResult = collectionResult;
            this.collectionStatus = collectionStatus;
        }
    }

    public static class ResultEnumerationCacheEntry
    {
        public long created = System.currentTimeMillis();
        public ResultEnumeration result;

        public ResultEnumerationCacheEntry(ResultEnumeration result)
        {
            this.result = result;
        }
    }



}
