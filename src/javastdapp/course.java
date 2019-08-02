/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastdapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TROJAN
 */
public class course {
    public void insertUpdateDelete(char operation, Integer id, String cname, String ccode){
        Connection conn = connection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = conn.prepareStatement("INSERT INTO course(cname,ccode) VALUES(?,?)");
                ps.setString(1, cname);
                ps.setString(2, ccode);
              
           
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Course Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
 }  

}