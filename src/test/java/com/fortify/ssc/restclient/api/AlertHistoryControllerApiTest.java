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
import com.fortify.ssc.restclient.model.AlertSetStatusRequest;
import com.fortify.ssc.restclient.model.ApiCollectionActionlong;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultListAlertHistoryEntry;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlertHistoryControllerApi
 */
@Ignore
public class AlertHistoryControllerApiTest {

    private final AlertHistoryControllerApi api = new AlertHistoryControllerApi();

    
    /**
     * doAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doActionAlertHistoryTest() throws ApiException {
        ApiCollectionActionlong collectionAction = null;
        ApiResultApiActionResponse response = api.doActionAlertHistory(collectionAction);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAlertHistoryTest() throws ApiException {
        Integer start = null;
        Integer limit = null;
        String q = null;
        String orderby = null;
        ApiResultListAlertHistoryEntry response = api.listAlertHistory(start, limit, q, orderby);

        // TODO: test validations
    }
    
    /**
     * setStatusFor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setStatusForAlertHistoryTest() throws ApiException {
        AlertSetStatusRequest resource = null;
        ApiResultVoid response = api.setStatusForAlertHistory(resource);

        // TODO: test validations
    }
    
}
