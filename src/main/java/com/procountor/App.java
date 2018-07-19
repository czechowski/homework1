package com.procountor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Product> products = new ArrayList<>();


        Product product1 = new Product("ziemniak", 3, (double) 7);
        Product product2 = new Product("pomidor", 5, (double) 9);
        Product product3 = new Product("kalafior", 1, (double) 5);
        Product product4 = new Product("truskawka", 15, (double) 20);
        products.add(product1);
        products.add(product2);
        Invoice invoice = new Invoice(1, Arrays.asList(product1, product2));
        Invoice invoice2 = new Invoice(2, Arrays.asList(product3, product4, product1));

        invoices.add(invoice);
        invoices.add(invoice2);

        System.out.println("LIST OF INVOICES");
        System.out.println(invoices);
        System.out.println("Sum of all invoices=" + Calculator.calculateInvoiceValue(invoices));

    }

    public static class Calculator {

        public static Double calculateInvoiceValue( List<Invoice> invoices){
            double invoiceValue = 0;

            for (Invoice invoice : invoices) {
                invoiceValue += invoice.calculateTotalValue();
            }

            return invoiceValue;
        }
    }
}