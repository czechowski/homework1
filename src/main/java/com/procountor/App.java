package com.procountor;

public class App
{
    public static void main(String[] args) {
        Invoice obj1 = new Invoice(232,"ACME","PL6548997756666", "TNT", 8, 666.66,"02-02-2018r");

        System.out.println("Invoice ID: "+obj1.getInvoiceId() +"\n"+ "Comapny name: "+obj1.getCompanyName() +"\n"+ "Account number: "+obj1.getAccountNumber() +"\n"+ "Product: "+obj1.getProductName() +"\n"+ "Amount: "+obj1.getAmount() +"\n"+ "Price: "+obj1.getPrice() +"\n"+ "Paydate: " + obj1.getPayDate());
    }
}
