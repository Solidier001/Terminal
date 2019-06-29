package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.OrderList;
import org.apache.struts2.ServletActionContext;
import service.Imp.OrderListServiceImp;
import service.OrderListService;

import javax.servlet.http.HttpSession;

public class SetorderAction extends ActionSupport implements ModelDriven<OrderList> {
    private OrderListService os=new OrderListServiceImp();

    private OrderList orderList=new OrderList();

    public String Setorder(){
        ActionContext.getContext().getSession().put("OrderList",os.getAllOrderList());
        return SUCCESS;
    }
    public String add(){
        HttpSession session= ServletActionContext.getRequest().getSession();
        orderList.setUsername((String) session.getAttribute("id"));
        orderList.setState("未付款");
        System.out.println(orderList);
        os.insertOrder(orderList);
        return SUCCESS;
    }
    public String push(){
        HttpSession session= ServletActionContext.getRequest().getSession();
        orderList.setUsername((String) session.getAttribute("id"));
        orderList.setState("已付款");
        System.out.println(orderList);
        os.insertOrder(orderList);
        return SUCCESS;
    }

    public OrderList getModel(){
        return orderList;
    }
}
