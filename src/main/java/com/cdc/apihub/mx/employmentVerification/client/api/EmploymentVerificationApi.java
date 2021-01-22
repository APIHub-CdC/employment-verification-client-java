package com.cdc.apihub.mx.employmentVerification.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.cdc.apihub.mx.employmentVerification.client.ApiCallback;
import com.cdc.apihub.mx.employmentVerification.client.ApiClient;
import com.cdc.apihub.mx.employmentVerification.client.ApiException;
import com.cdc.apihub.mx.employmentVerification.client.ApiResponse;
import com.cdc.apihub.mx.employmentVerification.client.Configuration;
import com.cdc.apihub.mx.employmentVerification.client.Pair;
import com.cdc.apihub.mx.employmentVerification.client.ProgressRequestBody;
import com.cdc.apihub.mx.employmentVerification.client.ProgressResponseBody;
import com.cdc.apihub.mx.employmentVerification.client.model.AckEVRequest;
import com.cdc.apihub.mx.employmentVerification.client.model.AckSuccessEVConsumption;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerification;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerificationMetadata;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerificationWithPrivacyNotice;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.threeten.bp.OffsetDateTime;

public class EmploymentVerificationApi {
	private ApiClient apiClient;

	public EmploymentVerificationApi() {
		this(Configuration.getDefaultApiClient());
	}

	public EmploymentVerificationApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call getEmploymentVerificationCall(String xApiKey, String username, String password,
			String inquiryId, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/v1/eva/employmentverifications/{inquiryId}".replaceAll("\\{" + "inquiryId" + "\\}",
				apiClient.escapeString(inquiryId.toString()));

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));

		localVarHeaderParams.put("Content-Type", "application/json");

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "*/*" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getEmploymentVerificationValidateBeforeCall(String xApiKey, String username, String password,
			String inquiryId, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		// verify the required parameter 'xApiKey' is set
		if (xApiKey == null) {
			throw new ApiException(
					"Missing the required parameter 'xApiKey' when calling getEmploymentVerification(Async)");
		}
		// verify the required parameter 'username' is set
		if (username == null) {
			throw new ApiException(
					"Missing the required parameter 'username' when calling getEmploymentVerification(Async)");
		}
		// verify the required parameter 'password' is set
		if (password == null) {
			throw new ApiException(
					"Missing the required parameter 'password' when calling getEmploymentVerification(Async)");
		}

		// verify the required parameter 'inquiryId' is set
		if (inquiryId == null) {
			throw new ApiException(
					"Missing the required parameter 'inquiryId' when calling getEmploymentVerification(Async)");
		}

		okhttp3.Call call = getEmploymentVerificationCall(xApiKey, username, password, inquiryId, progressListener,
				progressRequestListener);
		return call;

	}

	public AckSuccessEVConsumption getEmploymentVerification(String xApiKey, String username, String password,
			String inquiryId) throws ApiException {
		ApiResponse<AckSuccessEVConsumption> resp = getEmploymentVerificationWithHttpInfo(xApiKey, username, password,
				inquiryId);
		return resp.getData();
	}

	public ApiResponse<AckSuccessEVConsumption> getEmploymentVerificationWithHttpInfo(String xApiKey, String username,
			String password, String inquiryId) throws ApiException {
		okhttp3.Call call = getEmploymentVerificationValidateBeforeCall(xApiKey, username, password, inquiryId, null,
				null);
		Type localVarReturnType = new TypeToken<AckSuccessEVConsumption>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getEmploymentVerificationAsync(String xApiKey, String username, String password,
			String inquiryId, final ApiCallback<AckSuccessEVConsumption> callback) throws ApiException {

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

		okhttp3.Call call = getEmploymentVerificationValidateBeforeCall(xApiKey, username, password, inquiryId,
				progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<AckSuccessEVConsumption>() {
		}.getType();
		apiClient.execute(call, localVarReturnType);
		return call;
	}

	public okhttp3.Call getEmploymentVerificationsCall(String xApiKey, String username, String password, String page,
			String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/v1/eva/employmentverifications";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		if (page != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
		if (perPage != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("perPage", perPage));
		if (startAt != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
		if (endAt != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("endAt", endAt));
		if (inquiryStatus != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("inquiryStatus", inquiryStatus));
		if (successCheck != null)
			localVarQueryParams.addAll(apiClient.parameterToPair("successCheck", successCheck));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call getEmploymentVerificationsValidateBeforeCall(String xApiKey, String username, String password,
			String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus,
			String successCheck, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		// verify the required parameter 'xApiKey' is set
		if (xApiKey == null) {
			throw new ApiException(
					"Missing the required parameter 'xApiKey' when calling getEmploymentVerifications(Async)");
		}
		// verify the required parameter 'username' is set
		if (username == null) {
			throw new ApiException(
					"Missing the required parameter 'username' when calling getEmploymentVerifications(Async)");
		}
		// verify the required parameter 'password' is set
		if (password == null) {
			throw new ApiException(
					"Missing the required parameter 'password' when calling getEmploymentVerifications(Async)");
		}

		okhttp3.Call call = getEmploymentVerificationsCall(xApiKey, username, password, page, perPage, startAt, endAt,
				inquiryStatus, successCheck, progressListener, progressRequestListener);
		return call;

	}

	public EmploymentVerificationMetadata getEmploymentVerifications(String xApiKey, String username, String password,
			String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus,
			String successCheck) throws ApiException {
		ApiResponse<EmploymentVerificationMetadata> resp = getEmploymentVerificationsWithHttpInfo(xApiKey, username,
				password, page, perPage, startAt, endAt, inquiryStatus, successCheck);
		return resp.getData();
	}

	public ApiResponse<EmploymentVerificationMetadata> getEmploymentVerificationsWithHttpInfo(String xApiKey,
			String username, String password, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt,
			String inquiryStatus, String successCheck) throws ApiException {
		okhttp3.Call call = getEmploymentVerificationsValidateBeforeCall(xApiKey, username, password, page, perPage,
				startAt, endAt, inquiryStatus, successCheck, null, null);
		Type localVarReturnType = new TypeToken<EmploymentVerificationMetadata>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call getEmploymentVerificationsAsync(String xApiKey, String username, String password, String page,
			String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck,
			final ApiCallback<EmploymentVerificationMetadata> callback) throws ApiException {

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

		okhttp3.Call call = getEmploymentVerificationsValidateBeforeCall(xApiKey, username, password, page, perPage,
				startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<EmploymentVerificationMetadata>() {
		}.getType();
		apiClient.execute(call, localVarReturnType);
		return call;
	}

	public okhttp3.Call postEmploymentVerificationCall(EmploymentVerification body, String xApiKey, String username,
			String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/v1/eva/employmentverifications";

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

		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call postEmploymentVerificationValidateBeforeCall(EmploymentVerification body, String xApiKey,
			String username, String password, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		// verify the required parameter 'body' is set
		if (body == null) {
			throw new ApiException(
					"Missing the required parameter 'body' when calling postEmploymentVerification(Async)");
		}
		// verify the required parameter 'xApiKey' is set
		if (xApiKey == null) {
			throw new ApiException(
					"Missing the required parameter 'xApiKey' when calling postEmploymentVerification(Async)");
		}
		// verify the required parameter 'username' is set
		if (username == null) {
			throw new ApiException(
					"Missing the required parameter 'username' when calling postEmploymentVerification(Async)");
		}
		// verify the required parameter 'password' is set
		if (password == null) {
			throw new ApiException(
					"Missing the required parameter 'password' when calling postEmploymentVerification(Async)");
		}

		okhttp3.Call call = postEmploymentVerificationCall(body, xApiKey, username, password, progressListener,
				progressRequestListener);
		return call;
	}

	public AckEVRequest postEmploymentVerification(EmploymentVerification body, String xApiKey, String username,
			String password) throws ApiException {
		ApiResponse<AckEVRequest> resp = postEmploymentVerificationWithHttpInfo(body, xApiKey, username, password);
		return resp.getData();
	}

	public ApiResponse<AckEVRequest> postEmploymentVerificationWithHttpInfo(EmploymentVerification body, String xApiKey,
			String username, String password) throws ApiException {
		okhttp3.Call call = postEmploymentVerificationValidateBeforeCall(body, xApiKey, username, password, null, null);
		Type localVarReturnType = new TypeToken<AckEVRequest>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	public okhttp3.Call postEmploymentVerificationAsync(EmploymentVerification body, String xApiKey, String username,
			String password, final ApiCallback<AckEVRequest> callback) throws ApiException {

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

		okhttp3.Call call = postEmploymentVerificationValidateBeforeCall(body, xApiKey, username, password,
				progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<AckEVRequest>() {
		}.getType();
		apiClient.execute(call, localVarReturnType);
		return call;
	}

	public AckEVRequest employmentverificationsWithPrivacyNotice(EmploymentVerificationWithPrivacyNotice body,
			String xApiKey, String username, String password) throws ApiException {
		ApiResponse<AckEVRequest> resp = employmentverificationsWithPrivacyNoticeWithHttpInfo(body, xApiKey, username,
				password);
		return resp.getData();
	}

	public ApiResponse<AckEVRequest> employmentverificationsWithPrivacyNoticeWithHttpInfo(
			EmploymentVerificationWithPrivacyNotice body, String xApiKey, String username, String password)
			throws ApiException {
		okhttp3.Call call = employmentverificationsWithPrivacyNoticeValidateBeforeCall(body, xApiKey, username,
				password, null, null);
		Type localVarReturnType = new TypeToken<AckEVRequest>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	private okhttp3.Call employmentverificationsWithPrivacyNoticeValidateBeforeCall(
			EmploymentVerificationWithPrivacyNotice body, String xApiKey, String username, String password,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (body == null) {
			throw new ApiException(
					"Missing the required parameter 'body' when calling employmentverificationsWithPrivacyNotice(Async)");
		}
		// verify the required parameter 'xApiKey' is set
		if (xApiKey == null) {
			throw new ApiException(
					"Missing the required parameter 'xApiKey' when calling getEmploymentVerification(Async)");
		}
		// verify the required parameter 'username' is set
		if (username == null) {
			throw new ApiException(
					"Missing the required parameter 'username' when calling getEmploymentVerification(Async)");
		}
		// verify the required parameter 'password' is set
		if (password == null) {
			throw new ApiException(
					"Missing the required parameter 'password' when calling getEmploymentVerification(Async)");
		}

		okhttp3.Call call = employmentverificationsWithPrivacyNoticeCall(body, xApiKey, username, password,
				progressListener, progressRequestListener);
		return call;

	}

	public okhttp3.Call employmentverificationsWithPrivacyNoticeCall(EmploymentVerificationWithPrivacyNotice body,
			String xApiKey, String username, String password,
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;
		String localVarPath = "/v1/eva/employmentverifications/withPrivacyNotice";
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
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}
}
