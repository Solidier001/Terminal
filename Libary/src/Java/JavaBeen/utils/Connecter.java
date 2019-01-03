package Java.JavaBeen.utils;
import java.sql.*;
public class Connecter {
    public Connection Connecte(String DatabaseName){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;DatabaseName="+DatabaseName;
            Connection con=DriverManager.getConnection(url,"sa","123456");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
