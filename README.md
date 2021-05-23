# Auto-generated VocaDB OpenAPI Java Client

[![](https://jitpack.io/v/CXwudi/vocadb-openapi-client-java.svg)](https://jitpack.io/#CXwudi/vocadb-openapi-client-java)

A sample VocaDB API Java Client that is auto-generated by [OpenAPI](https://github.com/OpenAPITools/openapi-generator) and is auto-fixed by my [VocaDB OpenAPI Java Client Autofixer](https://github.com/CXwudi/vocadb-openapi-java-client-autofixer)

The original README file coming from this auto-generated client is in [README Original.md](./README%20Original.md)

This client is generated by:

``` shell
openapi-generator-cli generate \
  --api-package mikufan.cx.vocadbapiclient.api \
  --model-package mikufan.cx.vocadbapiclient.model \
  --invoker-package mikufan.cx.vocadbapiclient.client \
  -i https://vocadb.net/swagger/v1/swagger.json \
  --group-id mikufan.cx \
  --artifact-id vocadb-api-client \
  --artifact-version 1.0.0 \
  -g java  \
    -p java8=true \
    -p dateLibrary=java8-localdatetime \
    -p useRuntimeException=true \
    -p openApiNullable=false \
    -p serializationLibrary=jackson \
  --library resttemplate \
  -o vocadb-api-client-resttemplate
```

## Installation

Refer to [jitpack](https://jitpack.io/#CXwudi/vocadb-openapi-client-java/1.0.1)

## How to use

Please read VocaDB API Usage [Rules](https://github.com/VocaDB/vocadb/wiki/Public-API#api-usage-rules) before using this API client.

Refer to the [generated documentation](./README%20Original.md#documentation-for-api-endpoints) for how to use this client

## Notes

- Highly recommended to set your custom User-Agent in `ApiClient` for VocaDB to identity you
- This client probably won't work well for any non-GET requests. Base on VocaDB [document](https://github.com/VocaDB/vocadb/wiki/Public-API#authenticated-apis), you need to set some custom header to be able to use it.
