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
public class DirectChat extends NewConvo {

    public DirectChat(String convoName, int newMessages) {
        super(convoName, newMessages);
    }

 
    private String recipient = "";

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
}
