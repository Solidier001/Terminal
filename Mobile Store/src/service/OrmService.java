package service;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import java.util.ArrayList;
import java.util.List;
public class OrmService extends HibernateDaoSupport {
    public void save(Object object){
        this.getHibernateTemplate().save(object);
    }
    public List select(String hql, ArrayList<String> parameters){
        Session session=null;
        try{
        session=this.currentSession();
        }catch (HibernateException e){
            for(int i=0;i<10;i++)System.out.println("报错");
            session=this.getHibernateTemplate().getSessionFactory().openSession();
        }
        Transaction tx = session.beginTransaction();
        Query query=session.createQuery(hql);
        for (int i=0;i<parameters.size();i++)
            query.setParameter(i,parameters.get(i));
        List list=query.list();
        tx.commit();
        session.close();
        return list;
    }
    public Session getSession(){
        return this.getHibernateTemplate().getSessionFactory().openSession();
    }
}
