package apis_Requests;

import apis_Parameters.Register_Parameters;
import basic_Configuration.BasicConfiguration;
import io.restassured.response.Response;


public class Register_Request
        extends BasicConfiguration {
    public static Response response;

    public void registerRequest(Register_Parameters registerParameters) {


requestSpecification.param("password",registerParameters.password)
                .param("password_confirmation",
                        registerParameters.password_confirmation)
                .param("favorite_language",
                        registerParameters.favorite_language)
                .param("responsible_person",
                        registerParameters.responsible_person)
                .param("is_accept_terms_and_conditions",
                        registerParameters.is_accept_terms_and_conditions)
                .param("name",
                        registerParameters.name)
                .param("mobile",
                        registerParameters.mobile)
                .param("email",
                        registerParameters.email);


         response = requestSpecification.when()
                .post("/v1/auth/register");



    }
}