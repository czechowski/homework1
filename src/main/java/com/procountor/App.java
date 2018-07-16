package com.procountor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Invoice> invoices  = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("ziemniak", 3, (double) 7);
        Product product2 = new Product("ziemniak2", 5, (double) 9);
        Invoice invoice = new Invoice(1, product1,);
        Invoice invoice2 = new Invoice(2, Arrays.asList("ziemniak2", "drugi ziemniak2"));


products.add(product1);
        invoices.add(invoice);
        invoices.add(invoice2);

        System.out.println(invoices);
    }
}
