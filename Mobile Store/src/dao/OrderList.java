package dao;

import java.io.Serializable;

public class OrderList implements Serializable {
    private Integer id;
    private String account;
    private String phone;
    private String address;
    private String price;
    private String username;
    private Integer mun;
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getMun() {
        return mun;
    }
    public void setMun(Integer mun) {
        this.mun = mun;
    }
    public OrderList() {
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getAccount(){
        return account;
    }
    public void setAccount(String account){
        this.account=account;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price=price;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    @Override
    public String toString() {
        return "OrderList{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

