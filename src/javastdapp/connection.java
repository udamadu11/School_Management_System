package javastdapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/stuDB";
        String uname = "root";
        String pass = "";
        String query = "SELECT * FROM user";
 
            Connection conn = null;
        
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,uname,pass);
            }
            catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
            }
        return conn;
    }
}