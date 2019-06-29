package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class DetermineLoginAction extends ActionSupport {
    String  dir;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String DetermineLogin(){
        HttpSession session= ServletActionContext.getRequest().getSession();
        if (session.getAttribute("id")!=null){
            if (dir.equals("Xcontent34"))
                return SUCCESS;
            else
                return INPUT;
        }
        else return LOGIN;
    }
    public String unLogin(){
        ServletContext context= ServletActionContext.getRequest().getSession().getServletContext();
        return SUCCESS;
    }
}
