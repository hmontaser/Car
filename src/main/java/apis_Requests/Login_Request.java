package apis_Requests;

import apis_Parameters.Login_Parameters;
import basic_Configuration.BasicConfiguration;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Login_Request
        extends BasicConfiguration {

public static Response response;

    public static void loginRequest(Login_Parameters loginParameters) {

        requestSpecification.param("mobile",loginParameters.mobile)
                .param("password",loginParameters.password);

//login URL Path
         response = requestSpecification.when()
                .post("/v1/auth/login");


    }
}