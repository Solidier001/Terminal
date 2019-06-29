package dao;
import java.util.Date;
public class Message {
    private String Content;
    private String Sender;
    private String Reciver;
    private Integer Id;
    private Date sendtime;
    public Date getSendtime() {
        return sendtime;
    }
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
    public String getContent() {
        return Content.trim();
    }
    public void setContent(String content) {
        Content = content;
    }
    public String getSender() {
        return Sender.trim();
    }
    public void setSender(String sender) {
        Sender = sender;
    }
    public String getReciver() {
        return Reciver;
    }
    public void setReciver(String reciver) {
        Reciver = reciver;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
}
