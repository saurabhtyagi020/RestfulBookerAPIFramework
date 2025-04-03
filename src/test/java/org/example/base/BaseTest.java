package org.example.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.endpoints.APIConstants;
import org.example.modules.PayloadManager;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public RequestSpecification requestSpecification;
    public Response response;
    public ValidatableResponse validatableResponse;
    public PayloadManager payloadManager;

    @BeforeTest
    public void commantoAll()
    {
       requestSpecification= RestAssured.given();
        requestSpecification.baseUri(APIConstants.BASE_URL);
        requestSpecification.contentType(ContentType.JSON);

    }

}
