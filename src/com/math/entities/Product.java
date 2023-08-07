package com.math.entities;

public class Product {
    private String name;
    private int quantity;
    private ProductType productType;

    public Product(String name, int quantity, ProductType productType) {
        this.name = name;
        this.quantity = quantity;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductType getProductType() {
        return productType;
    }
}
