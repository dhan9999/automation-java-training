package com.aw.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRestAssuredTest {

    @Test
    public void usersPageQueryShouldReturnPage2() {
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .queryParam("page", 2)
                .when()
                .get();

        Assert.assertEquals(response.getStatusCode(), 200);
        int page = response.jsonPath().getInt("page");
        Assert.assertEquals(page, 2);
    }
}


