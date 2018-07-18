package com.procountor;

import java.util.List;

public class Invoice {

    private Integer invoiceId;
    private List<Product> products;
    private Double totalValue;




    public Invoice(Integer invoiceId, List<Product> products) {
        this.invoiceId = invoiceId;
        this.products = products;
        this.totalValue = calculateTotalValue();

    }

    @Override
    public String toString() {
        return "invoiceId=" + invoiceId +
                " products=" + products;
    }



    public Double calculateTotalValue() {
        totalValue = 0d;
        for (Product product : products) {
            totalValue += product.getAmount() * product.getPrice();
        }
        return totalValue;
        }

    public Double getTotal() {
        return totalValue;
    }

}