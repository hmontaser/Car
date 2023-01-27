package Test_Cases_Execution;


import apis_Parameters.Register_Parameters;
import apis_Requests.Register_Request;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1_registration
        extends Register_Request {

    //Separate testCase.
public String mobileNumber =randomMobileNumber;
@Test
    public void registerExecute(){

//actual testCases values.
    Register_Parameters parameters = new Register_Parameters("123456",
            "123456","en",
            "Hmontaser",1,
           randomName,this.mobileNumber
            ,randomEmail);
       registerRequest(parameters);

//extract response body.
   ResponseBody responseBody = response.getBody();
    System.out.println("ResponseBody is" + responseBody.asString());
    String bodyAsString = responseBody.asString();

    //validate that the response status code is 200.
   Assertions.assertEquals(200, response.statusCode());
   //validate that the response body contains Success:True.
   Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);

    }
}
