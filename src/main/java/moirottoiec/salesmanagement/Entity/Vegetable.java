/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.salesmanagement.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Admin
 */
@Data
@Entity
@Table
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VegetableID")
    private int vegetableID;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID",
            nullable = false,
            foreignKey = @ForeignKey(name = "CategoryID")
    )  
    private Category category;
    @Column
    private String vegetableName;
    @Column
    private String unit;
    @Column (nullable = false)
    private int amount;
    @Column
    private String image;
    @Column (nullable = false)
    private float price;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "vegetable")
    private Set<OrderDetail> orderDetails = new HashSet<>();
    public Vegetable(){
        
    }

    public Vegetable(int vegetableID, Category category, String vegetableName, String unit, int amount, String image, float price) {
        this.vegetableID = vegetableID;
        this.category = category;
        this.vegetableName = vegetableName;
        this.unit = unit;
        this.amount = amount;
        this.image = image;
        this.price = price;
    }

    /**
     * @return the vegetableID
     */
    public int getVegetableID() {
        return vegetableID;
    }

    /**
     * @param vegetableID the vegetableID to set
     */
    public void setVegetableID(int vegetableID) {
        this.vegetableID = vegetableID;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the vegetableName
     */
    public String getVegetableName() {
        return vegetableName;
    }

    /**
     * @param vegetableName the vegetableName to set
     */
    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
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
