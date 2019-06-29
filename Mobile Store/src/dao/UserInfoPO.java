package dao;
/*
 * PO对象(持久化对象)的类，与数据库相对应
 */
public class UserInfoPO {

    private String id;
    private String userName;
    private String password;
    private Integer Money;
    private String Role;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Integer getMoney() {
        return Money;
    }
    public void setMoney(Integer money) {
        Money = money;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }




}