package ro.sci.service;

import ro.sci.domain.User;


public class UserService {

    private User[] users;

    public UserService() {
        initLocalUsers();
    }

    public User findUser(String loginName) {
        User foundUser = null;
        for (User user: users) {
            if (loginName != null && loginName.equals(user.loginName)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    private void initLocalUsers() {
        // declaring some test users so that we can search through them
        User u1 = new User("gigi");
        u1.psasword = "alegeoaia";

        User u2 = new User("john");
        u2.psasword = "doe";

        User u3 = new User("mary");
        u3.psasword = "";

        users = new User[]{u1, u2, u3};
    }
}
