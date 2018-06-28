package com.procountor;

public class Invoice {

    private Integer invoiceId;
    private String companyName;
    private String accountNumber;
    private Integer amount;
    private String productName;
    private Double price;
    private String payDate;

    Invoice(Integer invoiceId, String companyName, String accountNumber, String productName, Integer amount, Double price, String payDate){
        this.invoiceId = invoiceId;
        this.companyName = companyName;
        this.accountNumber = accountNumber;
        this.productName = productName;
        this.amount = amount;
        this.price = price;
        this.payDate = payDate;



    }


    public Integer getInvoiceId() {
        return invoiceId;
    }



    public String getCompanyName() {
        return companyName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public Integer getAmount() {
        return amount;
    }


    public String getProductName() {
        return productName;
    }


    public Double getPrice() {
        return price;
    }


    public String getPayDate() {
        return payDate;
    }
/**

    public void setPayDate(String payDate) {
        this.payDate = payDate;
        } */
    }

