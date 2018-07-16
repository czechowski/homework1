package com.procountor;

import java.util.List;

public class Product {

   private String productName;
   private Integer amount;
   private Double price;


   public Product ( String productName, Integer amount, Double price){
        this.productName = productName;
        this.amount = amount;
        this.price = price;


       public Integer getAmount() {
           return amount;
       }


       public String getProductName() {
           return productName;
       }


       public Double getPrice() {
           return price;
       }
    }

    @Override
    public String toString() {
        return "Product{" +
                "product name=" + productName +
                ", amount=" + amount + ", price=" + price +
                '}';
    }

}
