/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

public class Message extends Conversations {

    public  Message(String message, java.lang.String convoName, int newMessages) {
        super(convoName, newMessages);
        this.message = message;
    }

    private String message = "";
    private String recipient = "";

    public void sendMessage (){
    
        System.out.println ("Message class sendMessage method.");
        // ******FINISH*********

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }


    public String getConvoDetails(){
        System.out.println("getConvoDetails in NewConvo class.");
        return "Conversation Details go here";
        
    }
    


}
