package tests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.concurrent.TimeUnit;

public class TestsExamples {
	
	@Test
	public void test_1(){
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Status code:"+ response.statusCode());
		System.out.println("Response time:"+ response.getTimeIn(TimeUnit.MICROSECONDS));		
	}

}
