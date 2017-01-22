
package com.sg.vendingmachine.dto;

/**
 *
 * @author Paul Peterson
 */
public class Product {
    
    private int productId;
    private String productName;
    private double unitCost;
    private double price;
    private int quantity;
    
    public Product(){
        
    }

    public Product(int productId, String productName, double unitCost, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.unitCost = unitCost;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the priductName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the priductName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the unitCost
     */
    public double getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Product\n" + "\tProduct ID:  " + productId + "\n\tProduct Name:  " 
                + productName + "\n\tUnit Cost:  " + String.format("$%.2f", unitCost)
                + "\n\tPrice:  " +String.format("$%.2f", price) 
                + "\n\tQuantity:  " + quantity + "\n\n";
    }
    
}
