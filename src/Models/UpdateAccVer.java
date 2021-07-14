/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author erand
 */
public class UpdateAccVer {
    
    private String CurrentUserName;
    private String NewUserName;
    private String UpPassword;
    
    
    public String getNewUserName() {
        return NewUserName;
    }

    public void setNewUserName(String NewUserName) {
        this.NewUserName = NewUserName;
    }

    public String getUpPassword() {
        return UpPassword;
    }

    public void setUpPassword(String UpPassword) {
        this.UpPassword = UpPassword;
    }

    public String getCurrentUserName() {
        return CurrentUserName;
    }

    public void setCurrentUserName(String CurrentUserName) {
        this.CurrentUserName = CurrentUserName;
    }
  
}
