/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;

import java.util.List;
import moirottoiec.salesmanagement.Entity.Vegetable;

/**
 *
 * @author Admin
 */
public class testDAL extends ManagerDAL{
    
    public testDAL() {
        super();
    }
    public List getListVegetable(){
        List results=null;
        try {
            beginTransaction();
            String hql = " FROM Vegetable V";
            results = getSession().createQuery(hql,Vegetable.class).list();
            getTransaction().commit();
        } catch (Exception e) {
            getTransaction().rollback();
        } finally {
            close();
        }
        return results;
    }
}
