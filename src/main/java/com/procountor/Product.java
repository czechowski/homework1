 package com.procountor;

public class Product {

   private String productName;
   private Integer amount;
   private Double price;


   public Product ( String productName, Integer amount, Double price){
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "product name=" + productName +
                ", amount=" + amount + ", price=" + price ;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }

}
