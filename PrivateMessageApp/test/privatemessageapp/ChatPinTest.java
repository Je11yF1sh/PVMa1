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
public class ChatPinTest {
    
    public ChatPinTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class ChatPin.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChatPin instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChatPin method, of class ChatPin.
     */
    @Test
    public void testGetChatPin() {
        System.out.println("getChatPin");
        ChatPin instance = new ChatPin (133420, "Anon", 1);
        int expResult = 133420;
        int result = instance.getChatPin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setChatPin method, of class ChatPin.
     */
    @Test
    public void testSetChatPin() {
        System.out.println("setChatPin");
        int chatPin = 0;
        ChatPin instance = null;
        instance.setChatPin(chatPin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
