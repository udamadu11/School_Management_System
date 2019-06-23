

import <any?>;
import java.sql.Connection;
import java.sql.DriverManager;
public class connection {
    public static Connection getConnection(){
        Connection con = null;
        try {
        class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/stuDB","root","");
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
                return con;
    }
}