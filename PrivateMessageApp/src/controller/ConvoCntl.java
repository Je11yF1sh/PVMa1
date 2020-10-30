/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import privatemessageapp.Conversations;
import privatemessageapp.ConvoList;
import privatemessageapp.ConvoTableModel;
import view.ConvoListUI;
import view.ConvoUI;
import view.MainMenuUI;

/**
 *
 * @author Sam
 */
public class ConvoCntl implements ActionListener{
    private NavigationCntl navCntl;
    private ConvoList convoList;
    private ArrayList<Conversations> listOfConvos;    
    private ConvoUI convoUI;
    private ConvoListUI convoListUI;
    private Conversations convo1;
    private int convoIndex = 0;
    private ConvoTableModel theConvoTM;
    private MainMenuUI theMainMenuUI;

    ConvoCntl(NavigationCntl navCntl){
        convoList = new ConvoList();
      
        // allows navigation back to main menu
        this.navCntl = navCntl;
        // Get individual convos
        listOfConvos = convoList.getConvoList();
        // Show list in UI 
        theConvoTM = new ConvoTableModel(convoList.getConvoList());
        createConvoUI();
        createConvoListUI();

        // Now you see me
        convoUI.setVisible(true);
        // now u don't
        convoListUI.setVisible(false);
    }
    
    public void createConvoUI(){
        convoUI = new ConvoUI(this, listOfConvos.get(convoIndex));
        convoUI.nextbtn.addActionListener(this);
        convoUI.prevbtn.addActionListener(this);
        convoUI.deleteConvo.addActionListener(this);
        convoUI.sendMessage.addActionListener(this);
        convoUI.doneButton.addActionListener(this);
    }
    public void createConvoListUI(){
        convoListUI = new ConvoListUI(this);
        convoListUI.doneButton.addActionListener(this);
        convoListUI.newButton.addActionListener(this);
        convoListUI.detailsButton.addActionListener(this);
        
    }
    public void createMainMenuUI(){
//        theMainMenuUI = new MainMenuUI(this);
        
    }

    public ConvoTableModel getConvoTableModel(){
        return theConvoTM;
    }
    public Conversations getConvo(int selectedRow){
        return listOfConvos.get(selectedRow);
    }
    public void getConvoUI(int selectedRow){
        convoUI = new ConvoUI(this,selectedRow);
        
        convoUI.setVisible(true);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == convoUI.nextbtn)
        {
            if(convoIndex >= listOfConvos.size()-1)
                System.out.println("You are at the end");
            else
            {
                convoIndex ++;
                convoUI.updateData(listOfConvos.get(convoIndex));         
            }
        }
        else if(obj == convoUI.prevbtn)
        {
            if(convoIndex == 0)
                System.out.println("You are at the first convo");
            else
            {
                convoIndex --;
                convoUI.updateData(listOfConvos.get(convoIndex)); 
            }
           // System.out.println("Previous Button has been pressed.");
        }        
        else if(obj == convoUI.deleteConvo)
        {
            listOfConvos.remove(convoIndex);
        }
        else if(obj == convoUI.sendMessage)
        {
            System.out.println("Send Message Button has been pressed.");
        }
        else if (obj == convoUI.doneButton) {
            convoUI.setVisible(false);
            convoListUI.setVisible(true);
            
        }
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        if (obj == convoListUI.doneButton)
        {
            System.exit(0);
            //convoListUI.setVisible(false);
            //theMainMenuUI.setVisible(true);
        }
        else if(obj == convoListUI.newButton)
        {
            System.out.println("New Button (convolistui)");
        }
        else if(obj == convoListUI.detailsButton)
        {
            convoListUI.setVisible(false);
            convoUI.setVisible(true);
        }
       
    }

}
