/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privatemessageapp;

/* This will be for any users who forget their passwords and have a recovery key.
 * The class will ask for the user's username and one of his/her recovery codes. If both
 * were input correctly, the user will then be directed to a page allowing them to change
 * their password. Similar with the login attempts, the user will also have a limited
 *  amount of attempts to log in before being locked.
 */

public class ForgotPassword extends LogIn implements Printable{

    public ForgotPassword(String recoveryKey, boolean lockAcc, int loginAttempts, String username, String password) {
        super(username, password);
    }


    private String recoveryKey = "";
    private String username = "";
    private boolean lockAcc = false;
    private int loginAttempts = 0;
    private String password = "";
    public String getRecoveryKey() {
        return recoveryKey;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public boolean isLockAcc() {
        return lockAcc;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    // Setters
    public void setRecoveryKey(String recoveryKey) {
        this.recoveryKey = recoveryKey;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLockAcc(boolean lockAcc) {
        this.lockAcc = lockAcc;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    @Override
    public void printSetup() {
        System.out.println("This is printsetup in ForgotPassword.");
    }

    @Override
    public void print() {
        System.out.println("This is print in ForgotPassword.");
    }



}
