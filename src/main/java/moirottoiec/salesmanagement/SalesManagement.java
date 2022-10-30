/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package moirottoiec.salesmanagement;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;
import moirottoiec.salesmanagement.Entity.Vegetable;
import moirottoiec.salesmanagement.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Admin
 */
public class SalesManagement {

    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
//            String hql = " FROM Vegetable V";
//            List results = session.createQuery(hql,Vegetable.class).list();
//            for (Iterator iterator = results.iterator(); iterator.hasNext();) {
//                Vegetable vegetable= (Vegetable) iterator.next();
//                System.out.println("NameV: " + vegetable.getVegetableName());
//                
//            }
//            Category category = new Category();
//            Vegetable vegetable = new Vegetable();
//            category.setName("hoa");
//            vegetable.setCategory(category);
//            vegetable.setVegetableName("hoa dao");
//            session.save(category);
//            session.save(vegetable);
            session.getTransaction().commit();
            session.close();
        }
    }
}
