# AccountBalanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doCheckBalance**](AccountBalanceApi.md#doCheckBalance) | **GET** /account/checkAccountBalance/{accountNumber} | Transfer funds from one account to other account


<a name="doCheckBalance"></a>
# **doCheckBalance**
> List&lt;Account&gt; doCheckBalance(accountNumber)

Transfer funds from one account to other account

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountBalanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AccountBalanceApi apiInstance = new AccountBalanceApi(defaultClient);
    String accountNumber = "available"; // String | Status values that need to be considered for filter
    try {
      List<Account> result = apiInstance.doCheckBalance(accountNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountBalanceApi#doCheckBalance");
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
 **accountNumber** | **String**| Status values that need to be considered for filter | [default to available]

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid status value |  -  |

