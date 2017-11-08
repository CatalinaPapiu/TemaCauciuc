package ro.sci.domain;

public class User {

    public String firstName;
    public String lastName;
    public String email;
    public String loginName;
    public String psasword;

    public User(String loginName) {
        this.loginName = loginName;
    }
}
