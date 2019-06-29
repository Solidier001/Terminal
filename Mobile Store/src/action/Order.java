package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.OrderList;
import service.Imp.OrderListServiceImp;
import service.OrderListService;

public class Order extends ActionSupport{
    private int id;
    private String account;

    private OrderListService os=new OrderListServiceImp();

    public String chaxun(){
//        System.out.println(id+"=="+account);
        //从数据库查询订单号和商品名是否存在
OrderList ol=os.getOrderByIdandAccount(id,account);
if(ol==null){
    ActionContext.getContext().getSession().put("searchError","无所查询产品");
    return ERROR;
}else {
    ActionContext.getContext().getSession().put("searchError","");
    ActionContext.getContext().getSession().put("OrderList",ol);
    return SUCCESS;
}
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
