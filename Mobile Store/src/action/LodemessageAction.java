package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.Message;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.OrmService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class LodemessageAction extends ActionSupport {
    private String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String Lodemessage(){
        HttpServletRequest request=ServletActionContext.getRequest();
        HttpSession session= request.getSession();
        session.setAttribute("id",request.getParameter("id"));
        ServletContext context=ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        ArrayList<String> parameter=new ArrayList<String>();
        parameter.add(id);
        ArrayList<Message> messageList=(ArrayList<Message>)orm.select("from Message message where message.sender=? and message.reciver is null",parameter);
        session.setAttribute("messageList",messageList);
        return SUCCESS;
    }
}
