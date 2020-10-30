package controller;

import view.ConvoListUI;

/**
 *
 * @author Sam
 */
public class NavigationCntl {
    ConvoListUI convoListUI;
    public NavigationCntl () {
        ConvoCntl convoCntl = new ConvoCntl(this);
        
    }

}
