package Test_Suites;

import Test_Cases_Execution.TC1_registration;
import apis_Parameters.Login_Parameters;
import apis_Parameters.Register_Parameters;
import apis_Parameters.Verify_Parameters;
import apis_Requests.Login_Request;
import apis_Requests.Register_Request;
import apis_Requests.Verify_Request;
import basic_Configuration.GlobalVariables;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

//The full scenario of the registration process (Register, Verify then Login)
public class Validate_Full_Happy_Scenario
        extends GlobalVariables {

    public String mobileNumber =randomMobileNumber;
    @Test(priority = 1)
    public void registerExecute(){
        Register_Request registerRequest = new Register_Request();
        Register_Parameters parameters = new Register_Parameters("123456",
                "123456","en",
                "HeshamMontaser",1,
                randomName,this.mobileNumber
                ,randomEmail);

        registerRequest.registerRequest(parameters);

        ResponseBody responseBody = registerRequest.response.getBody();
        String bodyAsString = responseBody.asString();
        System.out.println("ResponseBody is" + bodyAsString);
        Assertions.assertEquals(200, registerRequest.response.statusCode());
        Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);


    }
    @Test(priority = 2)
    public void verifyExecute(){


        Verify_Request verifyRequest = new Verify_Request();
        Verify_Parameters verifyParameters = new Verify_Parameters(mobileNumber,
                "9531");

        verifyRequest.verifyRequest(verifyParameters);

        ResponseBody responseBody = verifyRequest.response.getBody();
        String bodyAsString = responseBody.asString();
        System.out.println("ResponseBody is " + bodyAsString);
        Assertions.assertEquals(200, verifyRequest.response.statusCode());
        Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);
    }

    @Test(priority = 3)
    public void loginExecute(){
        Login_Request loginRequest = new Login_Request();
        Login_Parameters loginParameters = new Login_Parameters(mobileNumber,
                "123456");
        loginRequest.loginRequest(loginParameters);

        ResponseBody responseBody = loginRequest.response.getBody();
        String bodyAsString = responseBody.asString();
        System.out.println("ResponseBody is" + bodyAsString);
        Assertions.assertEquals(200, loginRequest.response.statusCode());
        Assert.assertEquals(bodyAsString.contains("Success") /*Expected value*/, true /*Actual Value*/,bodyAsString);


    }

}
