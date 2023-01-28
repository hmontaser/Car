package Test_Cases_Execution;


import apis_Parameters.Register_Parameters;
import apis_Requests.Register_Request;
import io.restassured.response.ResponseBody;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1_registration
        extends Register_Request {

    //Separate testCase.
public static String mobileNumber =randomMobileNumber;

@Test
    public static void execute(){

//actual testCases values.
    Register_Parameters parameters = new Register_Parameters("123456",
            "123456","en",
            "Hmontaser",1,
           randomName,mobileNumber
            ,randomEmail);
    Register_Request registerRequest = new Register_Request();
       registerRequest.registerRequest(parameters);

//extract response body.
   ResponseBody responseBody = response.getBody();
    System.out.println("registration response body is " + responseBody.asString());
    String bodyAsString = responseBody.asString();

    //validate that the response status code is 200.
   Assertions.assertEquals(200, response.statusCode());
   //validate that the response body contains Success:True.
   Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);

    }
}
