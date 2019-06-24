
package javastdapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncStu {
    public static int count(String tableName){
       int total = 0;
       Connection conn = connection.getConnection();
       Statement sta;
       
       try{
           sta = conn.createStatement();
           ResultSet rs = sta.executeQuery("SELECT count(*) AS 'total' FROM "+tableName);
           while(rs.next()){
               total =rs.getInt(1);
           }
       }catch(SQLException ex){
           Logger.getLogger(FuncStu.class.getName()).log(Level.SEVERE, null, ex);
           
       }
     
       
       
    
    return total;
    }
}
