//Program to demonstrate the use of hashset
package com.aw.tests;

import java.util.HashSet;

public class HashSetDemo 
{
    public static void main(String[] args)
     {

        HashSet<String> apiEndpoints = new HashSet<>();

        apiEndpoints.add("POST /addOrder");
        apiEndpoints.add("GET /orderStatus");
        apiEndpoints.add("POST /addOrder");   // Duplicate
        apiEndpoints.add("DELETE /cancelOrder");

        System.out.println("API Endpoints: " + apiEndpoints);

        System.out.println("\nObservation:");
        System.out.println("- Duplicate 'POST /addOrder' not added again.");
        System.out.println("- Order is not guaranteed (HashSet is unordered).");
        
    }
}
