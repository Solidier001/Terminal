package service;

/*
 * 登录和注册业务功能，封装到这个JavaBean
 */

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import dao.UserInfoPO;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.swing.*;
import java.util.List;

public class LoginRegisterInfo {

    private Session session;
    private Transaction transaction;
    private Query query;

    public LoginRegisterInfo(){
    }

    public String saveInfo(UserInfoPO info){
        String mess="error";
        ServletContext context=ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        session=orm.getSession();
        try{
            transaction=session.beginTransaction();
            session.save(info);
            transaction.commit();
            session.close();
            mess="success";
            return mess;
        }catch(Exception e){
            message("RegisterInfo.error:"+e);
            e.printStackTrace();
            return null;
        }
    }

    public List queryInfo(String type,Object value){
        ServletContext context= ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        session=orm.getSession();
        try{
            String hqlsql="from UserInfoPO as u where u.userName=?";
            transaction=session.beginTransaction();
            query=session.createQuery(hqlsql);
            query.setParameter(0, value);
            List list=query.list();
            transaction.commit();
            session.close();
            return list;
        }catch(Exception e){
            message("LoginRegisterInfo类中有异常，异常为：:"+e);
            e.printStackTrace();
            return null;
        }
    }


    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess,title,type);
    }

}
