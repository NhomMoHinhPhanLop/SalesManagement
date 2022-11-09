/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.jaxen.pattern.NameTest;

/**
 *
 * @author Admin
 */
@Data
@Entity(name = "`Order`")
@Table(name = "`order`")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID",
            nullable = false,
            foreignKey = @ForeignKey(name = "CustomerID")
    )
    private Customer customer;
    @Column(name = "Date")
    @Temporal(value = TemporalType.DATE)
    private Date date;
    @Column
    private float total;
    @Column
    private String note;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "order")
    private Set<OrderDetail> orderDetails = new HashSet<>();
    public Order(){
        
    }

    public Order(int orderID, Customer customer, Date date, float total, String note) {
        this.orderID = orderID;
        this.customer = customer;
        this.date = date;
        this.total = total;
        this.note = note;
    }


    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
}
