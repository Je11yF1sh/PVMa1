/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

import java.io.Serializable;

public class LogIn implements Serializable{

    public LogIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LogIn{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private String username = "";
    private String password = "";
    
    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogInDetails() {
        return "LogInDetails here";
    }

}
