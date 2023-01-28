package test_Suites;

import test_Cases_Execution.TC1_registration;
import test_Cases_Execution.TC2_verify;
import test_Cases_Execution.TC3_login;
import org.testng.annotations.Test;

public class Execute_Full_Registration_Scenario {

@Test
    public void execute(){
        TC1_registration.execute();
        TC2_verify.execute();
        TC3_login.execute();
    }
}
