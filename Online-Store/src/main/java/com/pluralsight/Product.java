package com.pluralsight;

public class Product {
    private String sku;
    private String productName;
    private double price;
    private String department;


    public Product(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;

    }

    public String getSku() {
        return this.sku;
    }

    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }

}
