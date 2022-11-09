/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;

import java.util.List;
import moirottoiec.salesmanagement.Entity.Category;

/**
 *
 * @author Admin
 */
public class testDAL extends ManagerDAL{
    
    public testDAL() {
        super();
    }
    public void addCategory(Category category){
        try {
            beginTransaction();
            getSession().save(category);
            getTransaction().commit();
            getSession().flush();
        } 
        catch (Exception e) {
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
    }
    public List getListCategory(){
        List results=null;
        try {
            beginTransaction();
            String hql = " FROM Category V";
            results = getSession().createQuery(hql,Category.class).list();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
    
}
