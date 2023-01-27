package apis_Parameters;

import basic_Configuration.BasicConfiguration;

public class Login_Parameters extends BasicConfiguration {

    public String mobile;
    public String password;

    public Login_Parameters(String mobile,String password){

        this.mobile=mobile;
        this.password= password;


    }
}
