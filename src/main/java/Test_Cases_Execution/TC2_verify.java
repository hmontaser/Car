package Test_Cases_Execution;
import apis_Parameters.Verify_Parameters;
import apis_Requests.Verify_Request;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Test_Cases_Execution.TC1_registration.mobileNumber;

public class TC2_verify
        extends Verify_Request {

@Test
    public static void execute(){
//actual testCases values.
TC1_registration registration = new TC1_registration();

Verify_Parameters verify = new Verify_Parameters(mobileNumber,
        "9531");

 verifyRequest(verify);


    ResponseBody responseBody = response.getBody();
    String bodyAsString = responseBody.asString();
    System.out.println("verify response body is " + bodyAsString);
//validate that the response status code is 200.
    Assertions.assertEquals(200, response.statusCode());
//validate that the response body contains Success:True.
    Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);

    }
}
