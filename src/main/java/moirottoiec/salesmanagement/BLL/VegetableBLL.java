/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.BLL;

import java.util.List;
import moirottoiec.salesmanagement.DAL.CustomerDAL;
import moirottoiec.salesmanagement.DAL.VegetableDAL;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;
import moirottoiec.salesmanagement.Entity.Vegetable;

/**
 *
 * @author Duy
 */
public class VegetableBLL {
       private VegetableDAL vegetableDAL ;
// List Vegetable
       public List getListVegetable(){
       vegetableDAL = new VegetableDAL();
            
            //getList
        List results = vegetableDAL.getListVegetable();
        
        //close Session
        vegetableDAL.close();
        return results;
        }
// List Category
        public List getListCategory(){
       vegetableDAL = new VegetableDAL();
            
            //getList
        List results = vegetableDAL.getListCategory();
        
        //close Session
        vegetableDAL.close();
        return results;
        }
       
       
       public void addVegetable( int cateid, String name, String unit, int amount, String img, float price){
            vegetableDAL = new VegetableDAL();
            Vegetable v = new Vegetable();
            Category c = vegetableDAL.getSession().get(Category.class, cateid);
            v.setCategory(c);
            v.setVegetableName(name);
            v.setUnit(unit);
            v.setAmount(amount);
            v.setImage(img);
            v.setPrice(price);
            vegetableDAL.addVegetable(v);
           
        }
       public void updateVegetable( int vegeid,int cateid, String name, String unit, int amount, String img, float price){
            vegetableDAL = new VegetableDAL();
            Vegetable v = new Vegetable();
            v.setVegetableID(vegeid);
            Category c = vegetableDAL.getSession().get(Category.class, cateid);
            v.setCategory(c);
            v.setVegetableName(name);
            v.setUnit(unit);
            v.setAmount(amount);
            v.setImage(img);
            v.setPrice(price);
            vegetableDAL.updateVegetable(v);
           
        }
       public void deleteVegetable(int vegeid, int cateid, String name, String unit, int amount, String img, float price){
//           set vegetable
            vegetableDAL = new VegetableDAL();
            Vegetable v = new Vegetable();
            v.setVegetableID(vegeid);
            Category c = vegetableDAL.getSession().get(Category.class, cateid);
            v.setCategory(c);
            v.setVegetableName(name);
            v.setUnit(unit);
            v.setAmount(amount);
            v.setImage(img);
            v.setPrice(price);
            vegetableDAL.deleteVegetable(v);        
       }
      
    
}
