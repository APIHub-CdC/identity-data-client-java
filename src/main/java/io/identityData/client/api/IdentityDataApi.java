package io.identityData.client.api;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.identityData.client.ApiClient;
import io.identityData.client.ApiException;
import io.identityData.client.Configuration;
import io.identityData.client.Pair;
import io.identityData.client.ProgressRequestBody;
import io.identityData.client.ProgressResponseBody;
import io.identityData.client.model.IdentityValidationRequest;
import io.identityData.client.model.InlineResponse200;
import io.identityData.client.ApiResponse;
import io.identityData.client.ApiCallback;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdentityDataApi {
    private ApiClient apiClient;
    private Map<String, String> headers;
    public IdentityDataApi() {
        this(Configuration.getDefaultApiClient());
    }
    public IdentityDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }
    
    public okhttp3.Call createValidationCall(IdentityValidationRequest body, String xSignature, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/queries";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xSignature != null)
        localVarHeaderParams.put("x-signature", apiClient.parameterToString(xSignature));
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call createValidationValidateBeforeCall(IdentityValidationRequest body, String xSignature, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createValidation(Async)");
        }
        if (xSignature == null) {
            throw new ApiException("Missing the required parameter 'xSignature' when calling createValidation(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling createValidation(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling createValidation(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling createValidation(Async)");
        }
        
        okhttp3.Call call = createValidationCall(body, xSignature, xApiKey, username, password, progressListener, progressRequestListener);
        return call;
        
        
        
        
    }
    
    public InlineResponse200 createValidation(IdentityValidationRequest body, String xSignature, String xApiKey, String username, String password) throws ApiException {
        ApiResponse<InlineResponse200> resp = createValidationWithHttpInfo(body, xSignature, xApiKey, username, password);
        return resp.getData();
    }
    
    public ApiResponse<InlineResponse200> createValidationWithHttpInfo(IdentityValidationRequest body, String xSignature, String xApiKey, String username, String password) throws ApiException {
        okhttp3.Call call = createValidationValidateBeforeCall(body, xSignature, xApiKey, username, password, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call createValidationAsync(IdentityValidationRequest body, String xSignature, String xApiKey, String username, String password, final ApiCallback<InlineResponse200> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = createValidationValidateBeforeCall(body, xSignature, xApiKey, username, password, progressListener, progressRequestListener);
        
        return call;
    }
}
