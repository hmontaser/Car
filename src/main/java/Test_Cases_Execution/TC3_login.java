package Test_Cases_Execution;
import apis_Parameters.Login_Parameters;
import apis_Parameters.Verify_Parameters;
import apis_Requests.Login_Request;
import apis_Requests.Verify_Request;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_login
        extends Login_Request {


//Separate testCase.
    public String mobileNumber =randomMobileNumber;
@Test
    public void execute(){
//actual testCases values.
Login_Parameters loginParameters = new Login_Parameters(mobileNumber,
        "123456");

        loginRequest(loginParameters);

//extract response body.
    ResponseBody responseBody = this.response.getBody();
    String bodyAsString = responseBody.asString();
    System.out.println("ResponseBody is" + bodyAsString);
//validate that the response status code is 200.
    Assertions.assertEquals(200, response.statusCode());
//validate that the response body contains Success:True.
    Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);


}
}
