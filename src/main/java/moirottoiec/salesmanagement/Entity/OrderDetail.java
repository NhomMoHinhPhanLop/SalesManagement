/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity(name = "OrderDetail")
@Table(name = "orderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID",
            nullable = false,
            updatable = false,
            foreignKey = @ForeignKey(name = "OrderID")
    )
    private Order order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VegetableID",
            nullable = false,
            updatable = false,
            foreignKey = @ForeignKey(name = "VegetableID")
    )
    private Vegetable vegetable;
    private int quantity;
    private float price;


    public OrderDetail() {
    }

    public OrderDetail(int id, Order order, Vegetable vegetable, int quantity, float price) {
        this.id = id;
        this.order = order;
        this.vegetable = vegetable;
        this.quantity = quantity;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * @return the vegetable
     */
    public Vegetable getVegetable() {
        return vegetable;
    }

    /**
     * @param vegetable the vegetable to set
     */
    public void setVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }


    
}
