/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import Models.AddUserVer;
import Models.DonorVer;
import Models.UpdateAccVer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erand
 */
public class DBUserConnection {

    public int checkUser(Models.User user1) {
        
        DBConnection con = new DBConnection();
        int retVal = -1;

        String sql = "SELECT * FROM LoginAdmin WHERE AdminName=? AND AdminPw=?;";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.setString(1, user1.getUserName());// set values
            prep.setString(2, user1.getPassword());// set values

            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                retVal = 1;// if user is there
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return retVal;
    }

    public void AddDonor(DonorVer Don) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Donor(DName,DAge,DEmail,DAddress,DPhNum,DWeight,DBloodPressure,DDisease,DBloodGrp,DGender,NIC) "
                + " Values(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Don.getDname());
            prep.setInt(2, Don.getDage());
            prep.setString(3, Don.getDemail());
            prep.setString(4, Don.getDaddress());
            prep.setInt(5, Don.getDphoneNo());
            prep.setInt(6, Don.getDWeight());
            prep.setInt(7, Don.getDBloodPressure());
            prep.setString(8, Don.getDdiseases());
            prep.setString(9, Don.getDbloodGroup());
            prep.setString(10, Don.getDgender());
             prep.setString(11, Don.getNIC());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void AddPatient(Models.PatientVer Pat) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Patient(PName,PAge,PEmail,PAddress,PPhNum,PWeight,PBloodPressure,PDisease,PBloodGrp,PGender,PBedNo,NIC) "
                + " Values(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Pat.getPname());
            prep.setInt(2, Pat.getPage());
            prep.setString(3, Pat.getPemail());
            prep.setString(4, Pat.getPaddress());
            prep.setInt(5, Pat.getPphoneNo());
            prep.setInt(6, Pat.getPWeight());
            prep.setInt(7, Pat.getPBloodPressure());
            prep.setString(8, Pat.getPdiseases());
            prep.setString(9, Pat.getPbloodGroup());
            prep.setString(10, Pat.getPgender());
            prep.setInt(11, Pat.getPBedNo());
            prep.setString(12, Pat.getNIC());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void AddDoctor(Models.DoctorVer Doc) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Doctor(DocName,DPhNumber,DEmail,DocNIC) "
                + " Values(?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Doc.getDocName());
            prep.setInt(2, Doc.getDocPhNumber());
            prep.setString(3, Doc.getDEmail());
            prep.setString(4, Doc.getNIC());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void AddNurse(Models.NurseVer Nur) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Nurse(NurName,NPhNUmber,NEmail,NurNIC) "
                + " Values(?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Nur.getNurName());
            prep.setInt(2, Nur.getNurPhNumber());
            prep.setString(3, Nur.getNurEmail());
            prep.setString(4, Nur.getNIC());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void AddUser(Models.AddUserVer Admin) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO LoginAdmin(AdminName,AdminPw) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Admin.getNewUserName());
            prep.setString(2, Admin.getUpdatedPw());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}
