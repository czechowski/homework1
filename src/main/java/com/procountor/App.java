package com.procountor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Invoice> invoices  = new ArrayList<>();

        Invoice invoice = new Invoice(1, Arrays.asList("ziemniak", "drugi ziemniak"));
        Invoice invoice2 = new Invoice(1, Arrays.asList("ziemniak2", "drugi ziemniak2"));

        invoices.add(invoice);
        invoices.add(invoice2);

        System.out.println(invoices);
    }
}
