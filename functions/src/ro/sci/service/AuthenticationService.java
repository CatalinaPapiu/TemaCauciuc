package ro.sci.service;

import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;


public class AuthenticationService {

    private UserService userService = new UserService();

    public User authenticate(LoginRequest loginRequest) {
        User validUser = null;

        if (loginRequest != null) {
            User user = this.userService.findUser(loginRequest.loginName);

            if (user != null && isPasswordMatching(loginRequest.pass, user)) {
                validUser = user;
            }
        }

        return validUser;
    }

    private boolean isPasswordMatching(String pass, User user) {
        return pass != null && pass.equals(user.psasword);
    }

}
