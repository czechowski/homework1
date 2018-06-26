package com.procountor;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main(String[] args) {
        Invoice obj1 = new Invoice(232,"ACME","PL6548997756666", "TNT", 8, 666.66,"02-02-2018r");
        System.out.println(obj1.toString());
    }

}

