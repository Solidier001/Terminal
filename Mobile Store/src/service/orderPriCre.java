package service;


import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * @author sjmei 2011-6-26
 */
public class orderPriCre implements IdentifierGenerator {

    // 主键生成方法
    @SuppressWarnings("rawtypes")
    public synchronized String createKey(String hql){
        Session session ;
        ServletContext context= ServletActionContext.getServletContext();
        WebApplicationContext wac= WebApplicationContextUtils.getWebApplicationContext(context);
        OrmService orm=(OrmService)wac.getBean("OrmService");
        session=orm.getSession();
        //查询数据库中最大值主键
        String sql = "select top 1 userId from Orders order by userId desc ";
        try {
            session.beginTransaction();
            List list = session.createQuery(hql).list();
            String RecordId = null;
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            if(list.size()>0){
                RecordId = (String) session.createSQLQuery(sql).uniqueResult();

            }else {
                Date date = new Date();
                //格式化日期

                String datestr = format.format(date);
                //格式化十进制数
                String sequence = new DecimalFormat("0000").format(0);
                RecordId = datestr+sequence;

            }


            //截取日期字符串
            String dateStr = RecordId.substring(0,8);
            //截取序号
            int count = Integer.parseInt(RecordId.substring(8));
            System.out.println(count);
            Date date = new Date();
            String nowString = format.format(date);
            if(!dateStr.equals(nowString)){
                count = 0;
            }
            //格式化日期
            String datestr = format.format(date);
            //格式化十进制数
            String sequence = new DecimalFormat("0000").format(count+1);
            session.getTransaction().commit();
            session.clear();

            return datestr+sequence;
        }catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();

        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return createKey("from dao.OrderList");
    }
}


