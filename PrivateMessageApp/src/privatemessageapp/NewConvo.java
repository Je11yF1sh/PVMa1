/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

/**
 *
 * @author Sam
 */
public class NewConvo extends Conversations{

    public NewConvo(String convoName, int newMessages) {
        super(convoName, newMessages);
    }
    

    
    private String convoType = "";
    private String convoName = "";

    public String getConvoType() {
        return convoType;
    }

    public void setConvoType(String convoType) {
        this.convoType = convoType;
    }

    public String getConvoName() {
        return convoName;
    }

    public void setConvoName(String convoName) {
        this.convoName = convoName;
    }
    
        public String getConvoDetails(){
        System.out.println("getConvoDetails in NewConvo class.");
        return "Conversation Details go here";
        
    }
    
    public void createNewConvo(){
        System.out.println("Creating New Convo.");
    }
    
}
