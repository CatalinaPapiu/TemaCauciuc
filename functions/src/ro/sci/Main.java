package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucSearchRequest;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("john", "doe");

        User result = loginController.handleLoginRequest(loginRequest);

        CauciucController cauciucController = new CauciucController();

        CauciucSearchRequest searchRequest = new CauciucSearchRequest("van", "R15");

        Cauciuc produs = cauciucController.handleCauciucSearchRequest(searchRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        } else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }

        if (produs != null) {
            System.out.println("produsul se afla in lista de produse");
        } else {
            System.out.println("nu comercializam produse cu urmatoarele caracteristici: " + searchRequest.vehicleType + " " + searchRequest.diameter);
        }

    }
}
