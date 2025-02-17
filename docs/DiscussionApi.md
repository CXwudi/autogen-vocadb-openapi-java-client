# DiscussionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDiscussionsCommentsCommentIdDelete**](DiscussionApi.md#apiDiscussionsCommentsCommentIdDelete) | **DELETE** /api/discussions/comments/{commentId} |  |
| [**apiDiscussionsCommentsCommentIdPost**](DiscussionApi.md#apiDiscussionsCommentsCommentIdPost) | **POST** /api/discussions/comments/{commentId} |  |
| [**apiDiscussionsFoldersFolderIdTopicsGet**](DiscussionApi.md#apiDiscussionsFoldersFolderIdTopicsGet) | **GET** /api/discussions/folders/{folderId}/topics |  |
| [**apiDiscussionsFoldersFolderIdTopicsPost**](DiscussionApi.md#apiDiscussionsFoldersFolderIdTopicsPost) | **POST** /api/discussions/folders/{folderId}/topics |  |
| [**apiDiscussionsFoldersGet**](DiscussionApi.md#apiDiscussionsFoldersGet) | **GET** /api/discussions/folders |  |
| [**apiDiscussionsFoldersPost**](DiscussionApi.md#apiDiscussionsFoldersPost) | **POST** /api/discussions/folders |  |
| [**apiDiscussionsTopicsGet**](DiscussionApi.md#apiDiscussionsTopicsGet) | **GET** /api/discussions/topics |  |
| [**apiDiscussionsTopicsTopicIdCommentsPost**](DiscussionApi.md#apiDiscussionsTopicsTopicIdCommentsPost) | **POST** /api/discussions/topics/{topicId}/comments |  |
| [**apiDiscussionsTopicsTopicIdDelete**](DiscussionApi.md#apiDiscussionsTopicsTopicIdDelete) | **DELETE** /api/discussions/topics/{topicId} |  |
| [**apiDiscussionsTopicsTopicIdGet**](DiscussionApi.md#apiDiscussionsTopicsTopicIdGet) | **GET** /api/discussions/topics/{topicId} |  |
| [**apiDiscussionsTopicsTopicIdPost**](DiscussionApi.md#apiDiscussionsTopicsTopicIdPost) | **POST** /api/discussions/topics/{topicId} |  |



## apiDiscussionsCommentsCommentIdDelete

> apiDiscussionsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiDiscussionsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsCommentsCommentIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsCommentsCommentIdPost

> apiDiscussionsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiDiscussionsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsCommentsCommentIdPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **commentId** | **Integer**|  | |
| **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsFoldersFolderIdTopicsGet

> List&lt;DiscussionTopicContract&gt; apiDiscussionsFoldersFolderIdTopicsGet(folderId, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer folderId = 56; // Integer | 
        DiscussionTopicOptionalFields fields = DiscussionTopicOptionalFields.fromValue("None"); // DiscussionTopicOptionalFields | 
        try {
            List<DiscussionTopicContract> result = apiInstance.apiDiscussionsFoldersFolderIdTopicsGet(folderId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsFoldersFolderIdTopicsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**|  | |
| **fields** | [**DiscussionTopicOptionalFields**](.md)|  | [optional] [enum: None, Comments, CommentCount, Content, LastComment, All] |

### Return type

[**List&lt;DiscussionTopicContract&gt;**](DiscussionTopicContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsFoldersFolderIdTopicsPost

> DiscussionTopicContract apiDiscussionsFoldersFolderIdTopicsPost(folderId, discussionTopicContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer folderId = 56; // Integer | 
        DiscussionTopicContract discussionTopicContract = new DiscussionTopicContract(); // DiscussionTopicContract | 
        try {
            DiscussionTopicContract result = apiInstance.apiDiscussionsFoldersFolderIdTopicsPost(folderId, discussionTopicContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsFoldersFolderIdTopicsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**|  | |
| **discussionTopicContract** | [**DiscussionTopicContract**](DiscussionTopicContract.md)|  | [optional] |

### Return type

[**DiscussionTopicContract**](DiscussionTopicContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsFoldersGet

> List&lt;DiscussionFolderContract&gt; apiDiscussionsFoldersGet(fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        DiscussionFolderOptionalFields fields = DiscussionFolderOptionalFields.fromValue("None"); // DiscussionFolderOptionalFields | 
        try {
            List<DiscussionFolderContract> result = apiInstance.apiDiscussionsFoldersGet(fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsFoldersGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | [**DiscussionFolderOptionalFields**](.md)|  | [optional] [enum: None, LastTopic, TopicCount] |

### Return type

[**List&lt;DiscussionFolderContract&gt;**](DiscussionFolderContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsFoldersPost

> DiscussionFolderContract apiDiscussionsFoldersPost(discussionFolderContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        DiscussionFolderContract discussionFolderContract = new DiscussionFolderContract(); // DiscussionFolderContract | 
        try {
            DiscussionFolderContract result = apiInstance.apiDiscussionsFoldersPost(discussionFolderContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsFoldersPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **discussionFolderContract** | [**DiscussionFolderContract**](DiscussionFolderContract.md)|  | [optional] |

### Return type

[**DiscussionFolderContract**](DiscussionFolderContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsTopicsGet

> DiscussionTopicContractPartialFindResult apiDiscussionsTopicsGet(folderId, start, maxResults, getTotalCount, sort, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer folderId = 56; // Integer | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        DiscussionTopicSortRule sort = DiscussionTopicSortRule.fromValue("None"); // DiscussionTopicSortRule | 
        DiscussionTopicOptionalFields fields = DiscussionTopicOptionalFields.fromValue("None"); // DiscussionTopicOptionalFields | 
        try {
            DiscussionTopicContractPartialFindResult result = apiInstance.apiDiscussionsTopicsGet(folderId, start, maxResults, getTotalCount, sort, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsTopicsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **folderId** | **Integer**|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **getTotalCount** | **Boolean**|  | [optional] [default to false] |
| **sort** | [**DiscussionTopicSortRule**](.md)|  | [optional] [enum: None, Name, DateCreated, LastCommentDate] |
| **fields** | [**DiscussionTopicOptionalFields**](.md)|  | [optional] [enum: None, Comments, CommentCount, Content, LastComment, All] |

### Return type

[**DiscussionTopicContractPartialFindResult**](DiscussionTopicContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsTopicsTopicIdCommentsPost

> CommentForApiContract apiDiscussionsTopicsTopicIdCommentsPost(topicId, commentForApiContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer topicId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiDiscussionsTopicsTopicIdCommentsPost(topicId, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsTopicsTopicIdCommentsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topicId** | **Integer**|  | |
| **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional] |

### Return type

[**CommentForApiContract**](CommentForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsTopicsTopicIdDelete

> apiDiscussionsTopicsTopicIdDelete(topicId)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer topicId = 56; // Integer | 
        try {
            apiInstance.apiDiscussionsTopicsTopicIdDelete(topicId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsTopicsTopicIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topicId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsTopicsTopicIdGet

> DiscussionTopicContract apiDiscussionsTopicsTopicIdGet(topicId, fields)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer topicId = 56; // Integer | 
        DiscussionTopicOptionalFields fields = DiscussionTopicOptionalFields.fromValue("None"); // DiscussionTopicOptionalFields | 
        try {
            DiscussionTopicContract result = apiInstance.apiDiscussionsTopicsTopicIdGet(topicId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsTopicsTopicIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topicId** | **Integer**|  | |
| **fields** | [**DiscussionTopicOptionalFields**](.md)|  | [optional] [enum: None, Comments, CommentCount, Content, LastComment, All] |

### Return type

[**DiscussionTopicContract**](DiscussionTopicContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiDiscussionsTopicsTopicIdPost

> apiDiscussionsTopicsTopicIdPost(topicId, discussionTopicContract)



### Example

```java
// Import classes:
import mikufan.cx.vocadbapiclient.client.ApiClient;
import mikufan.cx.vocadbapiclient.client.ApiException;
import mikufan.cx.vocadbapiclient.client.Configuration;
import mikufan.cx.vocadbapiclient.client.models.*;
import mikufan.cx.vocadbapiclient.api.DiscussionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DiscussionApi apiInstance = new DiscussionApi(defaultClient);
        Integer topicId = 56; // Integer | 
        DiscussionTopicContract discussionTopicContract = new DiscussionTopicContract(); // DiscussionTopicContract | 
        try {
            apiInstance.apiDiscussionsTopicsTopicIdPost(topicId, discussionTopicContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscussionApi#apiDiscussionsTopicsTopicIdPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topicId** | **Integer**|  | |
| **discussionTopicContract** | [**DiscussionTopicContract**](DiscussionTopicContract.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
