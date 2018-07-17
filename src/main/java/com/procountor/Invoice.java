package com.procountor;

import java.util.List;

public class Invoice {

    private Integer invoiceId;
    private List<Product> products;

    public Invoice(Integer invoiceId, List<Product> products) {
        this.invoiceId = invoiceId;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", products=" + products +
                '}';
    }
}

