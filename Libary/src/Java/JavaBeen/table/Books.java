package Java.JavaBeen.table;
public class Books {
    private String Author=null;
    private String Condition=null;
    private String Bno=null;
    private String Bname=null;
    private String price=null;
    private String Statu=null;
    private String Location=null;
    public Books() {}
    public void setAuthor(String author) { Author = author; }
    public void setCondition(String condition) { Condition = condition; }
    public void setBno(String bno) {
        Bno = bno;
    }
    public void setBname(String bname) {
        Bname = bname;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setStatu(String statu) {
        Statu = statu;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public String getBno() {
        return Bno.trim();
    }
    public String getBname() {
        return Bname.trim();
    }
    public String getPrice() {
        return price.trim();
    }
    public String getStatu() {
        return Statu.trim();
    }
    public String getLocation() {
        return Location.trim();
    }
    public String getAuthor() { return Author.trim(); }
    public String getCondition() { return Condition.trim(); }
}
