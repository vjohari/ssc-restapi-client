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
import com.fortify.ssc.restclient.model.ApiResourceAction;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultApiActionResponse;
import com.fortify.ssc.restclient.model.ApiResultCloudJob;
import com.fortify.ssc.restclient.model.ApiResultListCloudJob;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.CloudJobCancelRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CloudJobControllerApi
 */
@Ignore
public class CloudJobControllerApiTest {

    private final CloudJobControllerApi api = new CloudJobControllerApi();

    
    /**
     * cancel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelCloudJobTest() throws ApiException {
        CloudJobCancelRequest resource = null;
        ApiResultVoid response = api.cancelCloudJob(resource);

        // TODO: test validations
    }
    
    /**
     * doAction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void doActionCloudJobTest() throws ApiException {
        String jobToken = null;
        ApiResourceAction resourceAction = null;
        ApiResultApiActionResponse response = api.doActionCloudJob(jobToken, resourceAction);

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
    public void listCloudJobTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        String orderby = null;
        ApiResultListCloudJob response = api.listCloudJob(fields, start, limit, q, orderby);

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
    public void readCloudJobTest() throws ApiException {
        String jobToken = null;
        String fields = null;
        ApiResultCloudJob response = api.readCloudJob(jobToken, fields);

        // TODO: test validations
    }
    
}
