package Java.JavaBeen.from;

public class Informations {
    private Object result=null;
    private String addtion=null;
    public Informations() {
    }

    public Informations(Object result, String addtion) {
        this.result = result;
        this.addtion = addtion;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setAddtion(String addtion) {
        this.addtion = addtion;
    }

    public Object getResult() {
        return result;
    }

    public String getAddtion() {
        return addtion.trim();
    }
}
