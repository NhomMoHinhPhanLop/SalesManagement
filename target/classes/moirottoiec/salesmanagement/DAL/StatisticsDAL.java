/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.DAL;
import java.util.List;
import moirottoiec.salesmanagement.Entity.Order;
import moirottoiec.salesmanagement.Entity.OrderDetail;
import moirottoiec.salesmanagement.Entity.Vegetable;
import org.hibernate.SQLQuery;
import org.hibernate.query.Query;

/**
 *
 * @author Admin
 */
public class StatisticsDAL extends ManagerDAL{
    private Order order;
    private OrderDetail orderDetail;
    private Vegetable vegetable;
    public StatisticsDAL() {
        super();
    }
    public List getRevenueByMouth(int month,int year){
        List results=null;
        try {
            beginTransaction();

            String hql = "FROM Order"
                    +" WHERE YEAR(date)=:year"
                    + " AND MONTH(date)=:month";
            Query query = getSession().createQuery(hql,Order.class);
            query.setParameter("year", year);
            query.setParameter("month", month);
            results = query.getResultList();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;
    }
    public List getRevenueByYear(int year){
        List results=null;
        try {
            beginTransaction();

            String hql = "FROM Order o"
                    +" WHERE YEAR(date)=:year"
                    + " ORDER BY date";
            Query query = getSession().createQuery(hql,Order.class);
            query.setParameter("year", year);
            results = query.getResultList();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results;     
    }
    public List ListSellingProducts(int month,int year){
        List results=null;
        try {
            beginTransaction();

            String hql = "SELECT detail.* FROM Orderdetail detail , `Order` o"
                    +" WHERE YEAR(date)=:year AND MONTH(date)=:month "
                    + "ORDER BY vegetableID,quantity DESC";
            SQLQuery query = getSession().createSQLQuery(hql);
            query.addEntity(OrderDetail.class);
            query.setParameter("year", year);
            query.setParameter("month", month);
            results = query.getResultList();
            getTransaction().commit();
        } catch (Exception e) {
           if(getTransaction()!=null && getTransaction().isActive()){
                getTransaction().rollback();
            }
        } 
        return results; 
    }
}
