package apis_Requests;

import apis_Parameters.Verify_Parameters;
import basic_Configuration.BasicConfiguration;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class Verify_Request
        extends BasicConfiguration {

    public static Response response;
@Test
public static void verifyRequest(Verify_Parameters verifyParameters) {


requestSpecification
            .param("mobile",
                    verifyParameters.mobile)
            .param("verification_code",
                    verifyParameters.verification_code);


     response = requestSpecification.when()
            .post("/v1/auth/verify");


}

}
