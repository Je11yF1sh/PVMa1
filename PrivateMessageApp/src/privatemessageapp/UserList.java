/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

import java.io.*;
import java.util.*;

/**
 *
 * @author Sam
 */
public class UserList {
    private ArrayList<LogIn> userList = new ArrayList<>();
    private String userListFileName;
    public UserList() {
        this.readUserListFile();
        if(userList.isEmpty() || userList == null){
            this.createTestUserList();
            this.writeUserListFile();
            this.readUserListFile();
        }
        this.printUserList();        
    }

   /* public void createList(){ 
        LogIn usr1 = new LogIn("BiqqBoi","1234567");
        LogIn usr2 = new LogIn("Yoshi","133420");
        LogIn usr3 = new LogIn("BigYosh","0000000");
        LogIn usr4 = new LogIn("Spy123","AxbD241215#");
        UserList.add(usr1);
        UserList.add(usr2);
        UserList.add(usr3);
        UserList.add(usr4);
    }*/
        public void readUserListFile(){
        FileInputStream  fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(userListFileName);
            in = new ObjectInputStream(fis);
            userList = (ArrayList)in.readObject();
            in.close();
            if(!userList.isEmpty())
                System.out.println("File was not found. new one was created");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public void writeUserListFile(){
    FileOutputStream fos = null;
    ObjectOutputStream out = null;
    try {
        fos = new FileOutputStream(userListFileName);
        out = new ObjectOutputStream(fos);
        out.writeObject(userList);
        out.close();
    }
    catch(IOException ex){
        ex.printStackTrace();
    }        
    }
    public void createTestUserList(){
    for (int i = 0; i < 20; i++){
        userList.add(new LogIn ("Test User" + i, "Password" + i));
    }
    System.out.println("Test UserList created");
    System.out.println("The UserList is: "+userList);        
    }
    public void printUserList(){
        System.out.println("The Convo List has these convos: ");
        for(int i = 0; i < userList.size(); i++){
            LogIn u1 = (LogIn) userList.get(i);
            System.out.println(u1.getLogInDetails());        
        }
    }
   
    public ArrayList<LogIn> getUserList(){
        return userList;
    }

    public void setConvoList(ArrayList<LogIn> userList) {
        this.userList = userList;
    }
 
}
