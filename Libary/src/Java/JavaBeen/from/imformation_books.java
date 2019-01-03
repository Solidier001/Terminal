package Java.JavaBeen.from;

public class imformation_books {
    private String Bname=null;
    private String Statu=null;
    private String Location=null;
    public imformation_books() {
    }



    public void setBname(String bname) {
        Bname = bname;
    }
    public void setStatu(String statu) {
        Statu = statu;
    }
 public void setLocation(String location) {
        Location = location;
    }
    public String getBname() {
        return Bname.trim();
    }
    public String getStatu() {
        return Statu.trim();
    }
    public String getLocation() {
        return Location.trim();
    }


}
