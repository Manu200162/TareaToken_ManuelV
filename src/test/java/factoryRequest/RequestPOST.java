package factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPOST implements IRequest {
    @Override
    public Response send(RequestInformation requestInformation, String token) {

       Response response= given()
    		   				.header("Token", token)
    		   				.log().all()
                          .when()
                            .post(requestInformation.getUrl());

       response.then().log().all();
       return response;
    }
}