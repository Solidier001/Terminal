package Java.JavaBeen.operator;

import Java.JavaBeen.utils.Connecter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class writer {
    Connection connection = new Connecter().Connecte("LibaryDataBase");
    Statement stmt = null;
    public boolean sign_up(String Uno,String Class,String Academy,String Role,String UserName){
        boolean rel= false;
        try {
            stmt=connection.createStatement();
            rel=!stmt.execute("insert " +
                    "into Users(Uno,password,Class,Academy,Role,UserName) " +
                    "values (\'" +Uno+"\',\'"+Uno+"\',\'"+Class+"\',\'"+
                    Academy+"\',\'"+Role+"\',\'"+UserName+
                    "\')");
            stmt.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
    public boolean add_Book(String Bno,String BName,String Price,String Location,String Author){
        boolean rel= false;
        try {
            stmt=connection.createStatement();
            rel=!stmt.execute("insert " +
                    "into Books(Bno,BName,Price,Location,Statu,Author,Condition) " +
                    "values (\'" +Bno+"\',\'"+BName+"\',\'"+Price+"\',\'"+
                    Location+"\',\'在馆\',\'"+Author+"\',\'完好\')");
            stmt.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
    public boolean rent_book(String Uno,String Bno,String BName){
        boolean rel= false;
        try {
            stmt=connection.createStatement();
            rel=!stmt.execute("insert " +
                    "into Rent(Uno,Bno,BName) " +
                    "values (\'" +Uno+"\',\'"+Bno+"\',\'"+BName+"\');"+
                    "update Books set Statu=\'离馆\' where Bno=\'"+Bno+"\';"
            );
            stmt.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
}
