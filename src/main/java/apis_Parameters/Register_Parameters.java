package apis_Parameters;

public class Register_Parameters {


    public String password;
    public String password_confirmation;
    public String favorite_language;
    public String responsible_person;
    public int is_accept_terms_and_conditions;
    public String name;
    public String mobile;
    public String email;

    public Register_Parameters(String password,
                               String password_confirmation,
                               String favorite_language,
                               String responsible_person,
                               int is_accept_terms_and_conditions,
                               String name,
                               String mobile,
                               String email) {
        this.password = password;
        this.password_confirmation = password_confirmation;
        this.favorite_language = favorite_language;
        this.responsible_person = responsible_person;
        this.is_accept_terms_and_conditions = is_accept_terms_and_conditions;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }
}
