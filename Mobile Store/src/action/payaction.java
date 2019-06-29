package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.OrderList;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.OrmService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

public class payaction extends ActionSupport {
    private String address;
    private String phone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String pay(){
        HttpSession session=ServletActionContext.getRequest().getSession();
        List<OrderList> list= (List<OrderList>) session.getAttribute("OrderList");
        for (OrderList orderList: list){
            orderList.setPhone(phone);
            orderList.setAddress(address);
            orderList.setState("已付款");
        }
        ServletContext context=ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        Session session1=orm.getSession();
        Transaction transaction=session1.beginTransaction();
        for (OrderList orderList: list){
            session1.update(orderList);
        }
        transaction.commit();
        session1.close();
        return SUCCESS;
    }
}
