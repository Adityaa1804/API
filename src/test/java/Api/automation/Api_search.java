package Api.automation;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class Api_search 
{
	@Test
	public void getsearch()
	{
		Response res=RestAssured.get("http://services.groupkt.com/country/get/iso2code/IN ");
	System.out.println(res.asString());
	}
	}

