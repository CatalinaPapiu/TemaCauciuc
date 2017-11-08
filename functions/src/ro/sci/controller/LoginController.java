package ro.sci.controller;

import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;
import ro.sci.service.AuthenticationService;

public class LoginController {
    private AuthenticationService authenticationService = new AuthenticationService();

    public User handleLoginRequest(LoginRequest loginRequest) {
        User user = this.authenticationService.authenticate(loginRequest);
        return user;

    }
}
