package Java.JavaBeen.operator;
import Java.JavaBeen.utils.*;
import java.sql.*;
public class deleter {
    private Connection connection=new Connecter().Connecte("LibaryDataBase");
    public boolean write_off(String Uno){
        boolean rel= false;
        try {
            Statement statement=connection.createStatement();
            rel=!statement.execute("delete from Users where Uno=\'"+Uno+'\'');
            statement.close();
            return rel;
        } catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
    public boolean deleterrecorde(String Uno,String Bno){
        boolean rel= false;
        try {
            Statement statement=connection.createStatement();
            rel=!statement.execute("delete from Rent where Uno=\'"+Uno+"\'and Bno=\'"+Bno+'\'');
            statement.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
    public boolean deleterBooks(String Bno){
        boolean rel= false;
        try {
            Statement statement=connection.createStatement();
            rel=!statement.execute("delete from Books where Bno=\'"+Bno+'\'');
            statement.close();
            return rel;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return rel;
        }
    }
}
