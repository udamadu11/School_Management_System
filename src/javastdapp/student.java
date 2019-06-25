
package javastdapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class student {
    public void insertUpdateDelete(char operation, Integer id, String fname, String lname, String sex, String bdate, String phone, String address){
        Connection conn = connection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = conn.prepareStatement("INSERT INTO student(fname,lname,sex,birthdate,phone,adress) VALUES(?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(1, sex);
                ps.setString(1, bdate);
                ps.setString(1, phone);
                ps.setString(1, address);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New student Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
