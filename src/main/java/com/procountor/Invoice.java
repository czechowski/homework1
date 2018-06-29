package com.procountor;

import java.util.List;

public class Invoice {

    private Integer invoiceId;
    private List<String> products;

    public Invoice(Integer invoiceId, List<String> products) {
        this.invoiceId = invoiceId;
        this.products = products;
    }


    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }


    //    private String companyName;
//
//
//    private String accountNumber;
//    private Integer amount;
//    private String productName;
//    private Double price;
//    private String payDate;
//
//    Invoice(Integer invoiceId, String companyName, String accountNumber, String productName, Integer amount, Double price, String payDate) {
//        this.invoiceId = invoiceId;
//        this.companyName = companyName;
//        this.accountNumber = accountNumber;
//        this.productName = productName;
//        this.amount = amount;
//        this.price = price;
//        this.payDate = payDate;
//
//
//    }
//
//    public Integer getInvoiceId() {
//        return invoiceId;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public Integer getAmount() {
//        return amount;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public String getPayDate() {
//        return payDate;
//    }

    /**
     * public void setPayDate(String payDate) {
     * this.payDate = payDate;
     * }
     */


    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", products=" + products +
                '}';
    }
}

