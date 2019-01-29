/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultListPerformanceIndicatorHistory;
import com.fortify.ssc.restclient.model.ApiResultPerformanceIndicatorHistory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PerformanceIndicatorHistoryOfProjectVersionControllerApi
 */
@Ignore
public class PerformanceIndicatorHistoryOfProjectVersionControllerApiTest {

    private final PerformanceIndicatorHistoryOfProjectVersionControllerApi api = new PerformanceIndicatorHistoryOfProjectVersionControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPerformanceIndicatorHistoryOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        ApiResultListPerformanceIndicatorHistory response = api.listPerformanceIndicatorHistoryOfProjectVersion(parentId, fields, start, limit, q);

        // TODO: test validations
    }
    
    /**
     * read
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPerformanceIndicatorHistoryOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String id = null;
        String fields = null;
        ApiResultPerformanceIndicatorHistory response = api.readPerformanceIndicatorHistoryOfProjectVersion(parentId, id, fields);

        // TODO: test validations
    }
    
}