package Java.JavaBeen.operator;
import Java.JavaBeen.utils.Connecter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
    Connection connection = new Connecter().Connecte("LibaryDataBase");
    Statement stmt = null;
    ResultSet set = null;
    public boolean ResetPassword(String Uno,String passowrd){
        boolean rel= false;
        try {
            Statement statement=connection.createStatement();
            rel=!statement.execute("update Users set password=\'" +passowrd+ "\' where Uno=\'"+Uno+'\'');
            statement.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
    public boolean ReturnBook(String Bno){
        boolean rel= false;
        try {
            Statement statement=connection.createStatement();
            rel=!statement.execute("update Rent set Backtime=Getdate() where Bno='" +Bno+
                    "';\n" +
                    "update Books set Statu='在馆' where Bno='" +Bno+
                    "';");
            statement.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
}
