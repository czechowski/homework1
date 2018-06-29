package com.procountor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Invoice obj1 = new Invoice(232, "ACME", "PL6548997756666", "TNT", 8, 666.66, "02-02-2018r");
//        Invoice obj2 = new Invoice(256,"Krzak","PL354353654645","koks",56,222.33,"04-05-2020r");

        List<Invoice> invoices  = new ArrayList<>();



        Invoice invoice = new Invoice(1, Arrays.asList("ziemniak", "drugi ziemniak"));
        Invoice invoice2 = new Invoice(1, Arrays.asList("ziemniak2", "drugi ziemniak2"));


        invoices.add(invoice);
        invoices.add(invoice2);


        System.out.println(invoices);
//        System.out.println("Invoice ID: " + obj1.getInvoiceId() + "\n" + "Company name: " + obj1.getCompanyName() + "\n" + "Account number: " + obj1.getAccountNumber() + "\n" + "Product: " + obj1.getProductName() + "\n" + "Amount: " + obj1.getAmount() + "\n" + "Price: " + obj1.getPrice() + "\n" + "Paydate: " + obj1.getPayDate());
    }
}
