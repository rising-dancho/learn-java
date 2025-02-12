package com.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // primitive types
        // int age = 30;
        // age = 35;
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
        // sout -> Tab : snippet for System.out.println()

        // Constructor: reference type
        Date now = new Date();
        System.out.println(now);
    }
}