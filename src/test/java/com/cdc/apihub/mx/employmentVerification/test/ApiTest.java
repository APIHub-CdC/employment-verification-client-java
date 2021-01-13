package com.cdc.apihub.mx.employmentVerification.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

import com.cdc.apihub.mx.employmentVerification.client.ApiClient;
import com.cdc.apihub.mx.employmentVerification.client.ApiException;
import com.cdc.apihub.mx.employmentVerification.client.api.EmploymentVerificationApi;
import com.cdc.apihub.mx.employmentVerification.client.model.AckEVRequest;
import com.cdc.apihub.mx.employmentVerification.client.model.AckSuccessEVConsumption;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerification;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerificationMetadata;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;

import java.util.UUID;

public class ApiTest {
    
    private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
    
    private final EmploymentVerificationApi api = new EmploymentVerificationApi();

    private ApiClient apiClient = null;

    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String usernameCDC = "your_username_otrorgante";
    private String passwordCDC = "your_password_otorgante"; 
    
    private String url = "the_url";
    private String xApiKey = "X_Api_Key";
    
    
    private SignerInterceptor interceptor;
    
    @Before()
    public void setUp() {
        interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
        apiClient.setHttpClient(okHttpClient);
    }

    
      @Test
      public void getEmploymentVerificationTest() throws ApiException {
    	  
          String inquiryId = null;
          AckSuccessEVConsumption response = api.getEmploymentVerification(this.xApiKey, this.usernameCDC, this.passwordCDC,  inquiryId);
          

          Assert.assertNotNull(response);
          logger.info(response.toString());
      }
     
      @Test
      public void getEmploymentVerificationsTest() throws ApiException {
   

          String page = null;
          String perPage = null;
          OffsetDateTime startAt = null;
          OffsetDateTime endAt = null;
          String inquiryStatus = null;
          String successCheck = null;
          EmploymentVerificationMetadata response = api.getEmploymentVerifications(this.xApiKey, this.usernameCDC, this.passwordCDC, page, perPage, startAt, endAt, inquiryStatus, successCheck);


          Assert.assertNotNull(response);
          logger.info(response.toString());
      }

      @Test
      public void postEmploymentVerificationTest() throws ApiException {
          EmploymentVerification body = new EmploymentVerification();
          body.setCurp(null);
          body.setEmail(null);
          body.setEmploymentVerificationRequestId(UUID.randomUUID());
          body.setNss(null);
          body.setSubscriptionId(UUID.fromString("uuid"));
     
          
          AckEVRequest response = api.postEmploymentVerification(body, this.xApiKey, this.usernameCDC, this.passwordCDC);


          Assert.assertNotNull(response);
          logger.info(response.toString());
      }
}