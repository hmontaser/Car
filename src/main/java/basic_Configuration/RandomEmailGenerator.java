package basic_Configuration;

import org.testng.annotations.Test;

//To generate different random emails.
public class RandomEmailGenerator {

        public String getEmail(String suffix,String domainName){
            int randomNo = (int)(Math.random() * 1000);
            return suffix + randomNo + "@" + domainName;
    }
}
