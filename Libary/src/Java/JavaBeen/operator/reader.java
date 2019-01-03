package Java.JavaBeen.operator;
import Java.JavaBeen.table.*;
import Java.JavaBeen.from.*;
import Java.JavaBeen.utils.Connecter;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class reader {
    Connection connection = new Connecter().Connecte("LibaryDataBase");
    Statement stmt = null;
    ResultSet set = null;

    public List  getUsersTable(String Uname) {
        List<Users> list = new ArrayList<Users>();
        String SQL="select * from Users";
        if (Uname==null||Uname==""){}
        else {
            SQL="select * from Users where UserName like \'"+Uname+"\'";
        }
        {
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    Users users = new Users();
                    users.setUno(set.getString("Uno"));
                    users.setAcademy(set.getString("Academy"));
                    users.setClasses(set.getString("Class"));
                    users.setRole(set.getString("Role"));
                    users.setUserName(set.getString("UserName"));
                    list.add(users);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public Users getUser(String Uno){
        String SQL="select * from Users";
        Users user =null;
        if (Uno==null||Uno==""){}
        else {
            SQL="select * from Users where Uno= \'"+Uno+"\'";
        }
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                set.next();
                user = new Users();
                user.setUno(Uno);
                user.setRole(set.getString("Role"));
                user.setUserName(set.getString("UserName"));
                user.setPassword(set.getString("password"));
                stmt.close();
                connection.close();
                set.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return user;
        }
        public List<imformation_books> getBooksTable(String name) {
        List<imformation_books> list = new ArrayList<imformation_books>();
        int i=0;
        String SQL = "select Bname,Location,Statu from Books where Bname like \'%"+name+"%\'";
        if(name==null||name.equals(""))
            SQL = "select Bname,Location,Statu,Bno from Books;";
        {
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    imformation_books books = new imformation_books();
                    books.setBname(set.getString("Bname"));
                    books.setLocation(set.getString("Location"));
                    books.setStatu(set.getString("Statu"));
                    list.add(books);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public List<Books> getBooks(String BookName) {
        List<Books> list = new ArrayList<Books>();
        String SQL=null;
        if (BookName==null||BookName.equals("")) {
            SQL = "select * from Books";
        }
        else{
            SQL = "select * from Books where Bname like \'%"+BookName+"%\'";
        };
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    Books books = new Books();
                    books.setAuthor(set.getString("Author"));
                    books.setCondition(set.getString("Condition"));
                    books.setBname(set.getString("Bname"));
                    books.setLocation(set.getString("Location"));
                    books.setStatu(set.getString("Statu"));
                    books.setPrice(set.getString("price"));
                    books.setBno(set.getString("Bno"));
                    list.add(books);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return list;
    }
    public List  getRcord(String Uno,String Bno) {
        List<Rent> list = new ArrayList<Rent>();
        String SQL="select * from Rent";
        if ((Uno==null&&Bno==null)||(Uno==""&&Bno=="")){}
        else {
            if (Uno==null||Uno==""){
                SQL="select * from Rent where Uno= \'"+Uno+"\'";
            }
            if (Bno==null||Bno==""){
                SQL="select * from Rent where Uno= \'"+Bno+"\'";
            }
            else {
            SQL="select * from Rent where Uno= \'"+Uno+"\'and Bno=\'"+Bno+'\'';
            }
        }
        {
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    Rent rent=new Rent();
                    rent.setBacktime(set.getString("renttime"));
                    rent.setBacktime(set.getString("Backtime"));
                    rent.setBno(set.getString("Bno"));
                    rent.setUno(set.getString("Uno"));
                    rent.getBName(set.getString("BName"));
                    list.add(rent);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;

    }
    public List<Books> forRent(String BookName) {
        List<Books> list = new ArrayList<Books>();
        String SQL=null;
        if (BookName==null||BookName.equals("")) {
            SQL = "select * from Books where Statu='在馆'";
        }
        else{
            SQL = "select * from Books where Bname like \'%"+BookName+"%\'where Statu='在馆'";
        };
        {
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    Books books = new Books();
                    books.setAuthor(set.getString("Author"));
                    books.setCondition(set.getString("Condition"));
                    books.setBname(set.getString("Bname"));
                    books.setLocation(set.getString("Location"));
                    books.setStatu(set.getString("Statu"));
                    books.setPrice(set.getString("price"));
                    books.setBno(set.getString("Bno"));
                    list.add(books);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public List<forReturn> forReturnBooks(String BookName) {
        List<forReturn> list = new ArrayList<>();
        String SQL=null;
        if (BookName==null||BookName.equals("")) {
            SQL = "select Books.Author, Books.Condition, Books.Bno, Books.Bname, Books.price, Books.Statu, Books.Location,Renttime from Books,Rent where Statu='离馆'";
        }
        else{
            SQL = "select Books.Author,Books.Condition,Books.Bno,Books.Bname,Books.price,Books.Statu,Books.Location,Renttime from Books,Rent where Bname like \'%"+BookName+"%\'Statu='离馆'";
        };
        {
            try {
                stmt = connection.createStatement();
                set = stmt.executeQuery(SQL);
                while (set.next()) {
                    forReturn books = new forReturn();
                    books.setAuthor(set.getString("Author"));
                    books.setCondition(set.getString("Condition"));
                    books.setBname(set.getString("Bname"));
                    books.setLocation(set.getString("Location"));
                    books.setStatu(set.getString("Statu"));
                    books.setPrice(set.getString("price"));
                    books.setBno(set.getString("Bno"));
                    books.setRenttime(set.getString("Renttime"));
                    list.add(books);
                }
                stmt.close();
                connection.close();
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}