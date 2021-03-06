# AaTrainingStatusOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAaTrainingStatusOfProjectVersion**](AaTrainingStatusOfProjectVersionControllerApi.md#listAaTrainingStatusOfProjectVersion) | **GET** /projectVersions/{parentId}/auditAssistantTrainingStatus | list


<a name="listAaTrainingStatusOfProjectVersion"></a>
# **listAaTrainingStatusOfProjectVersion**
> ApiResultListAATrainingStatus listAaTrainingStatusOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AaTrainingStatusOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AaTrainingStatusOfProjectVersionControllerApi apiInstance = new AaTrainingStatusOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListAATrainingStatus result = apiInstance.listAaTrainingStatusOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AaTrainingStatusOfProjectVersionControllerApi#listAaTrainingStatusOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListAATrainingStatus**](ApiResultListAATrainingStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

