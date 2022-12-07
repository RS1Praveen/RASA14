package Scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import Generics.specAPi;
import io.restassured.response.Response;

public class Test1 {
									
	public static void main(String[] args) throws IOException {
		
		
		Response res = given().spec(specAPi.req_builder()).when().get("/api/users/2")
				.then().spec(specAPi.res_builder(200)).extract().response();
		System.out.println(res.asString());

	}

}
