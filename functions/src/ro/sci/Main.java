package ro.sci;

import ro.sci.controller.LoginController;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("john", "doe");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        } else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }

    }
}
