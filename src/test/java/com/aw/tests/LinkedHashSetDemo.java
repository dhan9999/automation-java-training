//Program to demonstrate the use of Linked Hash Set
package com.aw.tests;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> executedTests = new LinkedHashSet<>();

        executedTests.add("LoginTest");
        executedTests.add("AddToCartTest");
        executedTests.add("PaymentTest");
        executedTests.add("LoginTest");  

        System.out.println("Executed Tests: " + executedTests);

        System.out.println("\nObservation:");
        System.out.println("- Duplicate 'LoginTest' was ignored.");
        System.out.println("- Insertion order is preserved.");
    }
    
}
