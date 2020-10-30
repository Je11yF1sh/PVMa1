/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sam
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = new Message("Meet up at the Galley, 7:00", "Anon", 1);
        String expResult = "Meet up at the Galley, 7:00";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class Message.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Message instance = null;
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class Message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = new Message ("Where you at?", "FBI Agent", 11);
        int expResult = 133420;
        String result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRecipient method, of class Message.
     */
    @Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        String recipient = "";
        Message instance = null;
        instance.setRecipient(recipient);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
