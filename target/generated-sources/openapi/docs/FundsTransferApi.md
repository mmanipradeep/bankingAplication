# FundsTransferApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doFundTransfer**](FundsTransferApi.md#doFundTransfer) | **POST** /transaction/{sourceAccount}/{targetAccount}/{amount} | Check the Account Balance


<a name="doFundTransfer"></a>
# **doFundTransfer**
> ModelApiResponse doFundTransfer(sourceAccount, targetAccount, amount)

Check the Account Balance

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FundsTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    FundsTransferApi apiInstance = new FundsTransferApi(defaultClient);
    Long sourceAccount = 56L; // Long | ID of pet to update
    Long targetAccount = 56L; // Long | ID of pet to update
    String amount = "amount_example"; // String | Updated status of the pet
    try {
      ModelApiResponse result = apiInstance.doFundTransfer(sourceAccount, targetAccount, amount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FundsTransferApi#doFundTransfer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceAccount** | **Long**| ID of pet to update |
 **targetAccount** | **Long**| ID of pet to update |
 **amount** | **String**| Updated status of the pet |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

