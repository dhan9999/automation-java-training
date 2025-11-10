package com.aw.tests;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{

    public static void main(String[] args) 
    {
    
        HashMap<String, String> testCases = new HashMap<>();

        testCases.put("LoginTest", "Passed");
        testCases.put("SignupTest", "Failed");
        testCases.put("SearchTest", "Passed");
        testCases.put("CheckoutTest", "Blocked");

        
        System.out.println("Test Case Status (in insertion order):");
        for (Map.Entry<String, String> entry : testCases.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
