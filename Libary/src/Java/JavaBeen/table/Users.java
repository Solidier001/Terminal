package Java.JavaBeen.table;
public class Users {
    private String Uno;
    private String classes;
    private String Academy;
    private String Role;
    private  String UserName;
    private String password;
    public Users(){super();}

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUno(String uno) {
        Uno = uno;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public void setClasses(String Classes) {
        classes = Classes;
    }
    public void setAcademy(String academy) {
        Academy = academy;
    }
    public void setRole(String role) {
        Role = role;
    }

    public String getUno() {if (Uno==null)return "null";
        return Uno.trim();
    }

    public String getClasses() {if (classes==null)return "null";
        return classes.trim();
    }

    public String getAcademy() {if (Academy==null)return "null";
        return Academy.trim();
    }

    public String getRole() {if (Role==null)return "null";
        return Role.trim();
    }

    public String getUserName() {if (UserName==null)return "null";
        return UserName.trim();
    }

    public String getPassword() {if (password==null)return "null";
        return password.trim();
    }
}
