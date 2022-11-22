/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;

import java.util.List;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Vegetable;

/**
 *
 * @author Admin
 */
public class testDAL extends ManagerDAL{
    
    public testDAL() {
        super();
    }
    public Vegetable setVegetable(){
        Vegetable v = new Vegetable();
        
        Category c = getSession().get(Category.class, 2);
        v.setCategory(c);
        v.setVegetableName("duythem");
        v.setUnit("kg");
        v.setAmount(100);
        v.setImage("duy.png");
        v.setPrice(10000);
        return  v;
    }
    public void addVegetable(Vegetable vegetable){
        try{
            beginTransaction();
            getSession().save(vegetable);
            getTransaction().commit();
            getSession().flush();  
        }
        catch(Exception e){
            if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        }
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
