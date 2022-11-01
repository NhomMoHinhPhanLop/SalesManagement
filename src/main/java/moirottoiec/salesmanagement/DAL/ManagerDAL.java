/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;

import moirottoiec.salesmanagement.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class ManagerDAL {
    private Session session;

    public ManagerDAL() {
        session=HibernateUtil.getSessionFactory().openSession();
    }
    public Session getSession(){
        return session;
    }
    public void beginTransaction(){
        session.beginTransaction();
    }
    public Transaction getTransaction(){
        return session.getTransaction();
    }
    public void close(){
        session.close();
    }
}
