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
public class DoctorVer {
    
    private String DocName;
    private int DocPhNumber;
    private String DEmail;
    private int DId;
    private String NIC;

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public int getDocPhNumber() {
        return DocPhNumber;
    }

    public void setDocPhNumber(int DocPhNumber) {
        this.DocPhNumber = DocPhNumber;
    }

    public String getDEmail() {
        return DEmail;
    }

    public void setDEmail(String DEmail) {
        this.DEmail = DEmail;
    }

    public int getDId() {
        return DId;
    }

    public void setDId(int DId) {
        this.DId = DId;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
   
}
