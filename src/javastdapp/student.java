
package javastdapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class student {
    public void insertUpdateDelete(char operation, Integer id, String fname, String lname, String sex, String bdate, String phone, String address){
        Connection conn = connection.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = conn.prepareStatement("INSERT INTO student(fname,lname,sex,birthdate,phone,address) VALUES(?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New student Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'u'){
            try {
                ps = conn.prepareStatement("UPDATE `student` SET `fname` = ?, `lname` = ?, `sex` = ?, `birthdate` = ?, `phone` = ?, `address` = ?  WHERE `sid` = ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);
                ps.setInt(7, id);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Student Updated");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'd'){
            try {
                ps = conn.prepareStatement("DELETE FROM student WHERE `sid` = ?");
                ps.setInt(1, id);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Student Delete");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    void FillStdTable(JTable table, String value){
        Connection conn = connection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM student WHERE CONCAT ('f_name','l_name','phone','address')LIKE ?");
            ps.setString(1, "%"+value+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            while(rs.next()){
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                
                model.addRow(row);
          
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insertUpdateDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
