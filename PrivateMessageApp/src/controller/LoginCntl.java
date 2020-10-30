/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import privatemessageapp.LogIn;
import privatemessageapp.UserList;
import view.LoginUI;

/**
 *
 * @author Sam
 */
public class LoginCntl implements ActionListener{
    
    /*theLoginUI theLoginUI;
    theUserList theUserList;
    NavigationCntl navCntl;    
    getUserList getUserList;
    showLoginUI showLoginUI;
    requestAuth requestAuth;
    */
    
    NavigationCntl navCntl;    
    UserList userList;
    ArrayList<LogIn> listOfUsers;
    LoginCntl(NavigationCntl navCntl){
        this.navCntl = navCntl;
        listOfUsers = userList.getUserList();
        LoginUI loginUI = new LoginUI(this, listOfUsers.get(0));
        loginUI.setVisible(true);
    }

    LoginCntl() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
