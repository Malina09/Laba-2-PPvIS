package library.controller;

import library.model.Model;
import library.model.User;

public class ControllerAuthorization {

    private Model model;

    public ControllerAuthorization(Model model) {
        this.model = model;
    }

    public boolean authorizePassword(String pass) {

        return true;
    }

    public boolean authorizeLogin(User user, String login) {
        return true;

    }

    public boolean authorizeUser(String login, String pass){
        return true;
    }

}
