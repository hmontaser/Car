package basic_Configuration;
import org.apache.commons.lang3.RandomStringUtils;

//GlobalVariables to store all of common variables which will use multiple times.
public class GlobalVariables {

    //To generate different random mobile number for ex: Registration.
    public String randomMobileNumber = "96655" + RandomStringUtils.randomNumeric(7);

    //To generate random usernames.
    public String randomName = RandomStringUtils.randomAlphabetic(4);

    //To generate different random emails.
    RandomEmailGenerator randomEmailGenerator = new RandomEmailGenerator();
    public String randomEmail = randomEmailGenerator.getEmail(randomName,
            "gmail.com");


}
