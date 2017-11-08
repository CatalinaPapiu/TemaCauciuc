package ro.sci.domain;

public class LoginRequest {

    public String loginName;
    public String pass;

    public LoginRequest(String userName, String password) {
        this.loginName = userName;
        this.pass = password;
    }
}
