/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package moirottoiec.salesmanagement;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import moirottoiec.salesmanagement.DAL.testDAL;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;
import moirottoiec.salesmanagement.Entity.Category;
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
            testDAL tDAL = new testDAL();
            //Add
//            Category newCategory = new Category();
//            newCategory.setName("test");
//            newCategory.setDescription("des test");
//            tDAL.addCategory(newCategory);
            //getList
           List results = tDAL.getListCategory();
            for (Iterator iterator = results.iterator(); iterator.hasNext();) {
                Category category= (Category) iterator.next();
                System.out.println("NameV: " + category.getName());
                
            } 
            //close Session
            tDAL.close();
//        }
    }
}
