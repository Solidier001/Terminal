package domain.Imp;

import dao.OrderList;
import domain.OrderListDao;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.OrmService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class OrderListDaoImp implements OrderListDao {
    @Override
    public List<OrderList> getAllOrderList() {
        ServletContext context= ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        HttpSession session =ServletActionContext.getRequest().getSession();
        ArrayList<String> parameter=new ArrayList<String>();
        parameter.add((String)session.getAttribute("id"));
        parameter.add("未付款");
        List<OrderList> list= orm.select("from dao.OrderList where username=? and state=?",parameter);
//        Session session= orm.getSession();
//        Criteria criteria=session.createCriteria(OrderList.class);
//        //比hql更加面向对象的查询方式
//        List<OrderList> list=criteria.list();
//        session.close();
        return list;
    }

    public OrderList getOrderByIdandAccount(int id,String account){
        ServletContext context= ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        Session session= orm.getSession();
        SQLQuery query=session.createSQLQuery("select * from s_order where id='"+id+"'and account='"+account+"'");
        query.addEntity(OrderList.class);
        OrderList ol=(OrderList)query.uniqueResult();
        session.close();
        return ol;
    }

    @Override
    public void insertOrder(OrderList orderList) {
        ServletContext context= ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        Session session= orm.getSession();
        session.save(orderList);
        session.close();
    }
}
