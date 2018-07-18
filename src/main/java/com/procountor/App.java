package com.procountor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.procountor.Invoice.*;

public class App {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Product> products = new ArrayList<>();


        Product product1 = new Product("ziemniak", 3, (double) 7);
        Product product2 = new Product("ziemniak2", 5, (double) 9);
        products.add(product1);
        products.add(product2);
        Invoice invoice = new Invoice(1, Arrays.asList(product1, product2));
        Invoice invoice2 = new Invoice(2, Arrays.asList(product1));

        invoices.add(invoice);
        invoices.add(invoice2);


        System.out.println(products);
        System.out.println(invoices);
        System.out.println(invoice.getTotal());

    }

    public static class Calculator {
        private Double invoiceValue;
        private List<Invoice> invoices;

        public Double calculateInvoiceValue(){
            invoiceValue = 0d;
            for (Invoice invoice : invoices) {
                Invoice.calculateTotalValue();
            }
            return invoiceValue;
        }

        public Double getInvoiceValue() {
            return invoiceValue;
        }
    }
}