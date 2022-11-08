/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.salesmanagement.BLL;

import java.util.Iterator;
import java.util.List;
import moirottoiec.salesmanagement.DAL.CustomerDAL;
import moirottoiec.salesmanagement.DAL.testDAL;
import moirottoiec.salesmanagement.Entity.Category;
import moirottoiec.salesmanagement.Entity.Customer;

/**
 *
 * @author anhph
 */
public class CustomerBLL {
    private CustomerDAL customerDAL;
    public List getListCustomer(){
        customerDAL = new CustomerDAL();
            
            //getList
        List results = customerDAL.getListCustomer();
        
        //close Session
        customerDAL.close();
        return results;
    }
    
    public void addCustomer(Customer customer){
        customerDAL = new CustomerDAL();
        customerDAL.addCustomer(customer);
    }
    
    public void updateCustomer(Customer customer){
        customerDAL = new CustomerDAL();
        customerDAL.updateCustomer(customer);
    }
    
    public void deleteCustomer(Customer customer){
        customerDAL = new CustomerDAL();
        customerDAL.deleteCustomer(customer);
    }
}
