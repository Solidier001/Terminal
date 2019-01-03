package Java.JavaBeen.table;

public class Rent {
    private String uno;
    private String bno;
    private String backtime;
    private String renttime;
    private String BName;
    public Rent() {
        super();
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }
    public void setBno(String bno) {
        this.bno = bno;
    }
    public void setBacktime(String backtime) {
        this.backtime = backtime;
    }
    public void setRenttime(String renttime) {
        this.renttime = renttime;
    }
    public String getUno() {
        return uno;
    }
    public String getBno() {
        return bno;
    }
    public String getBacktime() {
        return backtime;
    }
    public String getRenttime() {
        return renttime;
    }

    public String getBName(String bName) {
        return BName.trim();
    }
}
