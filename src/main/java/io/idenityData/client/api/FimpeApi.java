/*
 * API Identity Data
 * <p>Identity Data API es un facilitador de funcionalidades que engloba información de distintas fuentes de acceso públicas y privadas en el progreso del producto para realizar la validación de identidad del Cliente. El objetivo es que a través de una sola API, el usuario puede acceder, corroborar y validar la identidad de la persona haciendo la solicitud de un producto o servicio.</p><br/>
 *
 * OpenAPI spec version: 1.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.idenityData.client.api;

import io.idenityData.client.ApiCallback;
import io.idenityData.client.ApiClient;
import io.idenityData.client.ApiException;
import io.idenityData.client.ApiResponse;
import io.idenityData.client.Configuration;
import io.idenityData.client.Pair;
import io.idenityData.client.ProgressRequestBody;
import io.idenityData.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.idenityData.client.model.InlineResponse200;
import io.idenityData.client.model.Request;
import io.idenityData.client.model.ResponseINE;
import io.idenityData.client.model.ResponseRenapo;
import io.idenityData.client.model.ResponseSEP;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FimpeApi {
    private ApiClient apiClient;

    public FimpeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FimpeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCredential
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call createCredentialCall(String xApiKey, String username, String password, Request body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/identityData/identity-data/validations";

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private Call createCredentialValidateBeforeCall( String xApiKey, String username, String password, Request body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling createCredential(Async)");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling createCredential(Async)");
        }
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling createCredential(Async)");
        }
        
        Call call = createCredentialCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;





    }

    /**
     *
     *
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body  (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 createCredential( String xApiKey, String username, String password, Request body) throws ApiException {
        ApiResponse<InlineResponse200> resp = createCredentialWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }
    /**
     * Call INE
     *
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseINE> callIneWithHttpInfo( String xApiKey, String username, String password, Request body) throws ApiException {
        Call call = createCredentialValidateBeforeCall(xApiKey,username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseINE>(){}.getType();

        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Call Renapo from CURP
     *
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseRenapo> callRENAPO(String xApiKey,String username, String password, Request body) throws ApiException {
        Call call = createCredentialValidateBeforeCall(xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseRenapo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Call SEP
     *
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseSEP> callSEP(String xApiKey, String username, String password, Request body) throws ApiException {
        Call call = createCredentialValidateBeforeCall(xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseSEP>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }


    /**
     *
     *
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body  (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> createCredentialWithHttpInfo( String xApiKey, String username, String password, Request body) throws ApiException {
        Call call = createCredentialValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xSignature Firma generada con la llave privada (required)
     * @param xApiKey ConsumerKey obtenido desde el portal de desarrolladores (required)
     * @param username Usuario de Círculo de Crédito (required)
     * @param password Contraseña de Círculo de Crédito (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call createCredentialAsync(String xSignature, String xApiKey, String username, String password, Request body, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        Call call = createCredentialValidateBeforeCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
//        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
