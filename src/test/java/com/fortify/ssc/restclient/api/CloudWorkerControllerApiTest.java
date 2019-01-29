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
import com.fortify.ssc.restclient.model.ApiResultCloudWorker;
import com.fortify.ssc.restclient.model.ApiResultListCloudWorker;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CloudWorkerControllerApi
 */
@Ignore
public class CloudWorkerControllerApiTest {

    private final CloudWorkerControllerApi api = new CloudWorkerControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudWorkerTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        Boolean fulltextsearch = null;
        String orderby = null;
        ApiResultListCloudWorker response = api.listCloudWorker(fields, start, limit, q, fulltextsearch, orderby);

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
    public void readCloudWorkerTest() throws ApiException {
        String uuid = null;
        String fields = null;
        ApiResultCloudWorker response = api.readCloudWorker(uuid, fields);

        // TODO: test validations
    }
    
}