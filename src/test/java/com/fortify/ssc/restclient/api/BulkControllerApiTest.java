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
import com.fortify.ssc.restclient.model.ApiResultListBulkResponseItem;
import com.fortify.ssc.restclient.model.BulkRequestData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BulkControllerApi
 */
@Ignore
public class BulkControllerApiTest {

    private final BulkControllerApi api = new BulkControllerApi();

    
    /**
     * post
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBulkTest() throws ApiException {
        BulkRequestData apiBulkRequestData = null;
        ApiResultListBulkResponseItem response = api.postBulk(apiBulkRequestData);

        // TODO: test validations
    }
    
}
