# TagApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiTagsByNameNameGet**](TagApi.md#apiTagsByNameNameGet) | **GET** /api/tags/byName/{name} | 
[**apiTagsCategoryNamesGet**](TagApi.md#apiTagsCategoryNamesGet) | **GET** /api/tags/categoryNames | 
[**apiTagsCommentsCommentIdDelete**](TagApi.md#apiTagsCommentsCommentIdDelete) | **DELETE** /api/tags/comments/{commentId} | 
[**apiTagsCommentsCommentIdPost**](TagApi.md#apiTagsCommentsCommentIdPost) | **POST** /api/tags/comments/{commentId} | 
[**apiTagsGet**](TagApi.md#apiTagsGet) | **GET** /api/tags | 
[**apiTagsIdDelete**](TagApi.md#apiTagsIdDelete) | **DELETE** /api/tags/{id} | 
[**apiTagsIdGet**](TagApi.md#apiTagsIdGet) | **GET** /api/tags/{id} | 
[**apiTagsNamesGet**](TagApi.md#apiTagsNamesGet) | **GET** /api/tags/names | 
[**apiTagsPost**](TagApi.md#apiTagsPost) | **POST** /api/tags | 
[**apiTagsTagIdChildrenGet**](TagApi.md#apiTagsTagIdChildrenGet) | **GET** /api/tags/{tagId}/children | 
[**apiTagsTagIdCommentsGet**](TagApi.md#apiTagsTagIdCommentsGet) | **GET** /api/tags/{tagId}/comments | 
[**apiTagsTagIdCommentsPost**](TagApi.md#apiTagsTagIdCommentsPost) | **POST** /api/tags/{tagId}/comments | 
[**apiTagsTagIdReportsPost**](TagApi.md#apiTagsTagIdReportsPost) | **POST** /api/tags/{tagId}/reports | 
[**apiTagsTopGet**](TagApi.md#apiTagsTopGet) | **GET** /api/tags/top | 



## apiTagsByNameNameGet

> TagForApiContract apiTagsByNameNameGet(name, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String name = "name_example"; // String | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            TagForApiContract result = apiInstance.apiTagsByNameNameGet(name, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsByNameNameGet");
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
 **name** | **String**|  |
 **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**TagForApiContract**](TagForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsCategoryNamesGet

> List&lt;String&gt; apiTagsCategoryNamesGet(query, nameMatchMode)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String query = "\"\""; // String | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        try {
            List<String> result = apiInstance.apiTagsCategoryNamesGet(query, nameMatchMode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsCategoryNamesGet");
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
 **query** | **String**|  | [optional] [default to &quot;&quot;]
 **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsCommentsCommentIdDelete

> apiTagsCommentsCommentIdDelete(commentId)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer commentId = 56; // Integer | 
        try {
            apiInstance.apiTagsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsCommentsCommentIdDelete");
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
 **commentId** | **Integer**|  |

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


## apiTagsCommentsCommentIdPost

> apiTagsCommentsCommentIdPost(commentId, commentForApiContract)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer commentId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            apiInstance.apiTagsCommentsCommentIdPost(commentId, commentForApiContract);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsCommentsCommentIdPost");
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
 **commentId** | **Integer**|  |
 **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsGet

> TagForApiContractPartialFindResult apiTagsGet(query, allowChildren, categoryName, start, maxResults, getTotalCount, nameMatchMode, sort, preferAccurateMatches, fields, lang, target)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String query = "\"\""; // String | 
        Boolean allowChildren = true; // Boolean | 
        String categoryName = "\"\""; // String | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        Boolean getTotalCount = false; // Boolean | 
        NameMatchMode nameMatchMode = NameMatchMode.fromValue("Auto"); // NameMatchMode | 
        TagSortRule sort = TagSortRule.fromValue("Nothing"); // TagSortRule | 
        Boolean preferAccurateMatches = false; // Boolean | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        TagTargetTypes target = TagTargetTypes.fromValue("Nothing"); // TagTargetTypes | 
        try {
            TagForApiContractPartialFindResult result = apiInstance.apiTagsGet(query, allowChildren, categoryName, start, maxResults, getTotalCount, nameMatchMode, sort, preferAccurateMatches, fields, lang, target);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsGet");
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
 **query** | **String**|  | [optional] [default to &quot;&quot;]
 **allowChildren** | **Boolean**|  | [optional] [default to true]
 **categoryName** | **String**|  | [optional] [default to &quot;&quot;]
 **start** | **Integer**|  | [optional] [default to 0]
 **maxResults** | **Integer**|  | [optional] [default to 10]
 **getTotalCount** | **Boolean**|  | [optional] [default to false]
 **nameMatchMode** | [**NameMatchMode**](.md)|  | [optional] [enum: Auto, Partial, StartsWith, Exact, Words]
 **sort** | [**TagSortRule**](.md)|  | [optional] [enum: Nothing, Name, AdditionDate, UsageCount]
 **preferAccurateMatches** | **Boolean**|  | [optional] [default to false]
 **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]
 **target** | [**TagTargetTypes**](.md)|  | [optional] [enum: Nothing, Album, Artist, AlbumArtist, Event, Song, AlbumSong, ArtistSong, All]

### Return type

[**TagForApiContractPartialFindResult**](TagForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsIdDelete

> apiTagsIdDelete(id, notes, hardDelete)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer id = 56; // Integer | 
        String notes = "\"\""; // String | 
        Boolean hardDelete = false; // Boolean | 
        try {
            apiInstance.apiTagsIdDelete(id, notes, hardDelete);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsIdDelete");
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
 **id** | **Integer**|  |
 **notes** | **String**|  | [optional] [default to &quot;&quot;]
 **hardDelete** | **Boolean**|  | [optional] [default to false]

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


## apiTagsIdGet

> TagForApiContract apiTagsIdGet(id, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer id = 56; // Integer | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            TagForApiContract result = apiInstance.apiTagsIdGet(id, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsIdGet");
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
 **id** | **Integer**|  |
 **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**TagForApiContract**](TagForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsNamesGet

> List&lt;String&gt; apiTagsNamesGet(query, allowAliases, maxResults)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String query = "\"\""; // String | 
        Boolean allowAliases = true; // Boolean | 
        Integer maxResults = 10; // Integer | 
        try {
            List<String> result = apiInstance.apiTagsNamesGet(query, allowAliases, maxResults);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsNamesGet");
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
 **query** | **String**|  | [optional] [default to &quot;&quot;]
 **allowAliases** | **Boolean**|  | [optional] [default to true]
 **maxResults** | **Integer**|  | [optional] [default to 10]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsPost

> TagBaseContract apiTagsPost(name)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            TagBaseContract result = apiInstance.apiTagsPost(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsPost");
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
 **name** | **String**|  | [optional]

### Return type

[**TagBaseContract**](TagBaseContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdChildrenGet

> List&lt;TagForApiContract&gt; apiTagsTagIdChildrenGet(tagId, fields, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer tagId = 56; // Integer | 
        TagOptionalFields fields = TagOptionalFields.fromValue("None"); // TagOptionalFields | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<TagForApiContract> result = apiInstance.apiTagsTagIdChildrenGet(tagId, fields, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsTagIdChildrenGet");
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
 **tagId** | **Integer**|  |
 **fields** | [**TagOptionalFields**](.md)|  | [optional] [enum: None, AdditionalNames, AliasedTo, Description, MainPicture, Names, Parent, RelatedTags, TranslatedDescription, WebLinks]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**List&lt;TagForApiContract&gt;**](TagForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdCommentsGet

> CommentForApiContractPartialFindResult apiTagsTagIdCommentsGet(tagId)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer tagId = 56; // Integer | 
        try {
            CommentForApiContractPartialFindResult result = apiInstance.apiTagsTagIdCommentsGet(tagId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsTagIdCommentsGet");
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
 **tagId** | **Integer**|  |

### Return type

[**CommentForApiContractPartialFindResult**](CommentForApiContractPartialFindResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdCommentsPost

> CommentForApiContract apiTagsTagIdCommentsPost(tagId, commentForApiContract)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer tagId = 56; // Integer | 
        CommentForApiContract commentForApiContract = new CommentForApiContract(); // CommentForApiContract | 
        try {
            CommentForApiContract result = apiInstance.apiTagsTagIdCommentsPost(tagId, commentForApiContract);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsTagIdCommentsPost");
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
 **tagId** | **Integer**|  |
 **commentForApiContract** | [**CommentForApiContract**](CommentForApiContract.md)|  | [optional]

### Return type

[**CommentForApiContract**](CommentForApiContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiTagsTagIdReportsPost

> apiTagsTagIdReportsPost(tagId, reportType, notes, versionNumber)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        Integer tagId = 56; // Integer | 
        TagReportType reportType = TagReportType.fromValue("InvalidInfo"); // TagReportType | 
        String notes = "notes_example"; // String | 
        Integer versionNumber = 56; // Integer | 
        try {
            apiInstance.apiTagsTagIdReportsPost(tagId, reportType, notes, versionNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsTagIdReportsPost");
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
 **tagId** | **Integer**|  |
 **reportType** | [**TagReportType**](.md)|  | [optional] [enum: InvalidInfo, Duplicate, Inappropriate, Other]
 **notes** | **String**|  | [optional]
 **versionNumber** | **Integer**|  | [optional]

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


## apiTagsTopGet

> List&lt;TagBaseContract&gt; apiTagsTopGet(categoryName, entryType, maxResults, lang)



### Example

```java
// Import classes:
import cx.mikufan.vocadbapiclient.client.ApiClient;
import cx.mikufan.vocadbapiclient.client.ApiException;
import cx.mikufan.vocadbapiclient.client.Configuration;
import cx.mikufan.vocadbapiclient.client.models.*;
import cx.mikufan.vocadbapiclient.api.TagApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TagApi apiInstance = new TagApi(defaultClient);
        String categoryName = "categoryName_example"; // String | 
        EntryType entryType = EntryType.fromValue("Undefined"); // EntryType | 
        Integer maxResults = 15; // Integer | 
        ContentLanguagePreference lang = ContentLanguagePreference.fromValue("Default"); // ContentLanguagePreference | 
        try {
            List<TagBaseContract> result = apiInstance.apiTagsTopGet(categoryName, entryType, maxResults, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagApi#apiTagsTopGet");
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
 **categoryName** | **String**|  | [optional]
 **entryType** | [**EntryType**](.md)|  | [optional] [enum: Undefined, Album, Artist, DiscussionTopic, PV, ReleaseEvent, ReleaseEventSeries, Song, SongList, Tag, User, Venue]
 **maxResults** | **Integer**|  | [optional] [default to 15]
 **lang** | [**ContentLanguagePreference**](.md)|  | [optional] [enum: Default, Japanese, Romaji, English]

### Return type

[**List&lt;TagBaseContract&gt;**](TagBaseContract.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
