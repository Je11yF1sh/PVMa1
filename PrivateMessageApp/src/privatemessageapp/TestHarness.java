// For testing meethods
package privatemessageapp;

import java.util.ArrayList;

/**
 *
 * @author jllyfsh ~ sam rouni
 */

public class TestHarness {

    private String convoName;

    public TestHarness() {
        testInterface();
        testClassHierarchy();    
    }
  
   public void testInterface(){
       ArrayList<Printable> accounts = new ArrayList<>();
       Printable a1 = new ForgotPassword("a3kFsdkx(=3qAS", false, 0, "Anon", "password111");
       Printable a2 = new ForgotPassword("39fAhjfA)#8s", false, 1, "Obama", "password123");
       
       for (Printable account : accounts) {
           account.printSetup();
         
       }
   }

    public void testClassHierarchy(){
        ArrayList<Conversations> convos = new ArrayList<>();
        Conversations c1 = new NewConvo ("FBI Agent Terry", 5);
        Conversations c2 = new NewConvo ("Anon", 3);
        Conversations c3 = new Message("Yo waddup","xx1337xx", 1);
        Conversations c4 = new Message("Im right outside!","BOB", 1);
        
        
        convos.add(c1);
        convos.add(c2);
        convos.add(c3);
        convos.add(c4);
        
        for (Conversations convo : convos) {
            System.out.println(convo.getConvoDetails());
        }
    }

    public void testChatPin() {
        ChatPin cP1 = new ChatPin (0,"AllMight",3);
        System.out.println(cP1.toString());
        cP1.setChatPin(133420);
        System.out.println(cP1.toString());

        if (cP1 != null) {
            // Test ChatPin class
            System.out.println("~ Test ChatPin created successfully ~");
            System.out.println(cP1.toString());
            cP1.setChatPin(99999999);
            System.out.println(cP1.toString());
            cP1.setChatPin(001010);
            System.out.println(cP1.toString());
            cP1.setChatPin(30000);
            System.out.println(cP1.toString());

        } else {
            System.out.println("ChatPin is null, you fool...");
        }
    }

    public void testLogin() {
        LogIn usr1 = new LogIn("SnowedIn", "1xL%126fho02cc(2");
        System.out.println(usr1.toString());
        usr1.setPassword("12345678");
        System.out.println(usr1.toString());

        if (usr1 != null) {
            // Test LogIn class
            System.out.println("~ Test LogIn created successfully ~");
            System.out.println(usr1.toString());
            usr1.setUsername("SELECT --1 = true '';");
            System.out.println(usr1.toString());
            usr1.setPassword("AAAAAAAAA");
            System.out.println(usr1.toString());
        } else {
            System.out.println("LogIn is null, come on dude...");
        }

    }
    




}
