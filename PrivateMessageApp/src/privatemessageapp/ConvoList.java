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
public class ConvoList{
    ArrayList<Conversations> convoList = new ArrayList<>();
    private String convoListFileName = "convo.ser";
    
    public ConvoList() {
        this.readConvoListFile();
        if(convoList.isEmpty() || convoList == null){
            this.createTestConvoList();
            this.writeConvoListFile();
            this.readConvoListFile();
        }
        this.printUserList();
    }


 
    /*public void createList(){
        Conversations c1 = new Conversations("Jared", 2);
        Conversations c2 = new Conversations("XxCoolManxX", 3);
        Conversations c3 = new Conversations("FBI", 0);
        Conversations c4 = new Conversations("ANON", 50);
        convoList.add(c1);
        convoList.add(c2);
        convoList.add(c3);
        convoList.add(c4);
    }*/
    public void readConvoListFile(){
        FileInputStream  fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(convoListFileName);
            in = new ObjectInputStream(fis);
            convoList = (ArrayList)in.readObject();
            in.close();
            if(!convoList.isEmpty())
                System.out.println("File was not found. new one was created");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public void writeConvoListFile(){
    FileOutputStream fos = null;
    ObjectOutputStream out = null;
    try {
        fos = new FileOutputStream(convoListFileName);
        out = new ObjectOutputStream(fos);
        out.writeObject(convoList);
        out.close();
    }
    catch(IOException ex){
        ex.printStackTrace();
    }        
    }
    public void createTestConvoList(){
    for (int i = 0; i < 20; i++){
        convoList.add(new Conversations ("Test User" + i, 0 + i));
    }
    System.out.println("Test UserList created");
    System.out.println("The UserList is: "+convoList);        
    }
    public void printUserList(){
        System.out.println("The Convo List has these convos: ");
        for(int i = 0; i < convoList.size(); i++){
            Conversations convo1 = (Conversations) convoList.get(i);
            System.out.println(convo1.getConvoName());        
        }
    }
   
    public ArrayList<Conversations> getConvoList(){
        return convoList;
    }

    public void setConvoList(ArrayList<Conversations> convoList) {
        this.convoList = convoList;
    }
    
}
