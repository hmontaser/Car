package basic_Configuration;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BasicConfiguration
        extends GlobalVariables {

//RequestSpecifications which contains BaseURI and Headers
  public RequestSpecification requestSpecification;
  public BasicConfiguration(){
      this.requestSpecification = RestAssured.given()
            .baseUri("https://provider.test.carefer.co/api/provider")
            .header("Platform",
                    "careferProviderApplication2Ej!%")
            .header("Accept",
                    "application/json");


  }
}
