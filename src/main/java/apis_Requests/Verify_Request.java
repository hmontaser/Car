package apis_Requests;

import apis_Parameters.Verify_Parameters;
import basic_Configuration.BasicConfiguration;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class Verify_Request
        extends BasicConfiguration {

    public Response response;
@Test
public void verifyRequest(Verify_Parameters verifyParameters) {


this.requestSpecification
            .param("mobile",
                    verifyParameters.mobile)
            .param("verification_code",
                    verifyParameters.verification_code);


     this.response = requestSpecification.when()
            .post("/v1/auth/verify");


}

}
