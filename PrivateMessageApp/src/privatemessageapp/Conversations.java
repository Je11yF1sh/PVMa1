package privatemessageapp;

// This will be for the current private message conversations the user has going on, listing

import java.io.Serializable;

// them from most recently active to least which is done in another class.

public class Conversations implements Serializable{


    @Override
    public String toString() {
        return "Conversations{" + "newMessages=" + newMessages + ", deleteConvo=" + deleteConvo + ", convoName=" + convoName + '}';
    }

    public Conversations(String convoName, int newMessages) {
        this.convoName = convoName;
        this.newMessages = newMessages;
    }


    
    public int newMessages = 0;
    public String deleteConvo = "";
    public String convoName = "";

    // Getters
    public String getConvoName() {
        return convoName;
    }
    public String getDeleteConvo() {
        return deleteConvo;
    }
    public int getNewMessages() {
        return newMessages;
    }
        
    public String getConvoDetails(){
        System.out.println("getConvoDetails in Conversations class.");
        return "Conversation Details go here";
        
    }

    // Setters
    public void setConvoName(String convoName) {
        this.convoName = convoName;
    }
    public void setDeleteConvo(String deleteConvo) {
        this.deleteConvo = deleteConvo;
    }
    public void setNewMessages(int newMessages) {
        this.newMessages = newMessages;
    }

    

}
