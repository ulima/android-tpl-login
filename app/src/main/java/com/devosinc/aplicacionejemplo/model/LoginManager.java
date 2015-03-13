package com.devosinc.aplicacionejemplo.model;

/**
 * Created by hquintana on 13/03/15.
 */
public class LoginManager {
    private static LoginManager manager;

    public static LoginManager getInstance(){
        if (manager == null){
            manager = new LoginManager();
        }
        return manager;
    }

    private LoginManager(){}

    public boolean login(String username, String password){
        if (username.equals("android") && password.equals("123")){
            return true;
        }
        return false;
    }
}
