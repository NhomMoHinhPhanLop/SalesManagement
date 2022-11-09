/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.salesmanagement.DAL;

import java.util.List;
import java.util.Vector;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;
import org.hibernate.Session;

/**
 *
 * @author anhph
 */
public class CustomerDAL extends ManagerDAL{
    public CustomerDAL(){
        super();
    }
    
    public List getListCustomer(){
        List results=null;
        try {
            beginTransaction();
            String hql = " FROM Customer c";
            results = getSession().createQuery(hql,Customer.class).list();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
    
    public List search(String keyword){
        List results = null;
        try{
            beginTransaction();
            String hql = "FROM Customer c WHERE FullName like '%"+keyword+"%'";
            results = getSession().createQuery(hql, Customer.class).list();
            getTransaction().commit();
        }catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
    
    public void addCustomer(Customer customer){
        try {
            beginTransaction();
            getSession().save(customer);
            getTransaction().commit();
            getSession().flush();
        } 
        catch (Exception e) {
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
    }
    
    public void updateCustomer(Customer customer){
        try{
            beginTransaction();
            getSession().update(customer);
            getTransaction().commit();
            getSession().flush();
        }catch(Exception e){
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
    }
    
    public void deleteCustomer(Customer customer){
        try {
            beginTransaction();
            getSession().delete(customer);
            getTransaction().commit();
            getSession().flush();
        } 
        catch (Exception e) {
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
    }
}
