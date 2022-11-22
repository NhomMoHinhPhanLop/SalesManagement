/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;

import moirottoiec.salesmanagement.Entity.Vegetable;
import org.hibernate.Session;
import java.util.List;
import java.util.Vector;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
/**
 *
 * @author Duy
 */
public class VegetableDAL extends ManagerDAL {
    public VegetableDAL(){
        super();
    }
    
   public List getListVegetable(){
        List results=null;
        try {
            beginTransaction();
            String hql = " FROM Vegetable v";
            results = getSession().createQuery(hql,Vegetable.class).list();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
   public List getListCategory(){
        List results=null;
        try {
            beginTransaction();
            String hql = " FROM Category c";
            results = getSession().createQuery(hql,Category.class).list();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
    public void addVegetable(Vegetable v){
        try{
            beginTransaction();
            getSession().save(v);
            getTransaction().commit();
            getSession().flush();
        }
        catch(Exception e){
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
        
    }
    public void updateVegetable(Vegetable vegetable){
        try{
            beginTransaction();
            getSession().update(vegetable);
            getTransaction().commit();
            getSession().flush();
        }catch(Exception e){
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
    }
    public void deleteVegetable(Vegetable v){
        try {
            beginTransaction();
            getSession().delete(v);
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
