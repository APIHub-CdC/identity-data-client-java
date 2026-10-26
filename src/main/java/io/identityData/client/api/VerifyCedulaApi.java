package io.identityData.client.api;



import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.identityData.client.ApiClient;
import io.identityData.client.ApiException;
import io.identityData.client.model.IdentityCedulaValidationRequest;
import io.identityData.client.model.IdentityCedulaValidationResponse;
import io.identityData.client.model.VerifyCedulaGetResponse;
import io.identityData.client.Configuration;
import io.identityData.client.Pair;
import io.identityData.client.ProgressRequestBody;
import io.identityData.client.ProgressResponseBody;
import io.identityData.client.ApiResponse;
import io.identityData.client.ApiCallback;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyCedulaApi {
    private ApiClient apiClient;
    private Map<String, String> headers;
    public VerifyCedulaApi() {
        this(Configuration.getDefaultApiClient());
    }
    public VerifyCedulaApi(ApiClient apiClient) {
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
    
    public okhttp3.Call retrieveVerifyCedulaCall(String xApiKey, String username, String password, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/identity-data/v1/professional-license-inquiries/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    
    private okhttp3.Call retrieveVerifyCedulaValidateBeforeCall(String xApiKey, String username, String password,  String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling retrieveVerifyCedula(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling retrieveVerifyCedula(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling retrieveVerifyCedula(Async)");
        }
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling retrieveVerifyCedula(Async)");
        }
        
        okhttp3.Call call = retrieveVerifyCedulaCall(xApiKey, username, password, inquiryId, progressListener, progressRequestListener);
        return call;
        
        
        
        
    }
    
    public VerifyCedulaGetResponse retrieveVerifyCedula(String xApiKey, String username, String password, String inquiryId) throws ApiException {
        ApiResponse<VerifyCedulaGetResponse> resp = retrieveVerifyCedulaWithHttpInfo(xApiKey, username, password, inquiryId);
        return resp.getData();
    }
    
    public ApiResponse<VerifyCedulaGetResponse> retrieveVerifyCedulaWithHttpInfo(String xApiKey, String username, String password,  String inquiryId) throws ApiException {
        okhttp3.Call call = retrieveVerifyCedulaValidateBeforeCall(xApiKey, username, password, inquiryId, null, null);
        Type localVarReturnType = new TypeToken<VerifyCedulaGetResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call retrieveVerifyCedulaAsync(String xApiKey, String username, String password,  String inquiryId, final ApiCallback<VerifyCedulaGetResponse> callback) throws ApiException {
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
        okhttp3.Call call = retrieveVerifyCedulaValidateBeforeCall(xApiKey, username, password, inquiryId, progressListener, progressRequestListener);
        
        return call;
    }
    
    public okhttp3.Call verifyCedulaCall(IdentityCedulaValidationRequest body, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/identity-data/v1/professional-license-inquiries";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    
    private okhttp3.Call verifyCedulaValidateBeforeCall(IdentityCedulaValidationRequest body, String xApiKey, String username, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling verifyCedula(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling verifyCedula(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling verifyCedula(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling verifyCedula(Async)");
        }
        
        okhttp3.Call call = verifyCedulaCall(body, xApiKey, username, password, progressListener, progressRequestListener);
        return call;
        
        
        
        
    }
    
    public IdentityCedulaValidationResponse verifyCedula(IdentityCedulaValidationRequest body, String xApiKey, String username, String password) throws ApiException {
        ApiResponse<IdentityCedulaValidationResponse> resp = verifyCedulaWithHttpInfo(body, xApiKey, username, password);
        return resp.getData();
    }
    
    public ApiResponse<IdentityCedulaValidationResponse> verifyCedulaWithHttpInfo(IdentityCedulaValidationRequest body,  String xApiKey, String username, String password) throws ApiException {
        okhttp3.Call call = verifyCedulaValidateBeforeCall(body, xApiKey, username, password, null, null);
        Type localVarReturnType = new TypeToken<IdentityCedulaValidationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call verifyCedulaAsync(IdentityCedulaValidationRequest body, String xSignature, String xApiKey, String username, String password, final ApiCallback<IdentityCedulaValidationResponse> callback) throws ApiException {
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
        okhttp3.Call call = verifyCedulaValidateBeforeCall(body, xApiKey, username, password, progressListener, progressRequestListener);
        
        return call;
    }
}
