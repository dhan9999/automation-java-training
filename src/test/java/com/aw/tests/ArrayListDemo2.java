// Program to demonstrate the use of ArrayList
package com.aw.tests;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 
{

    public static void main(String[] args) 
    {
        ArrayList<String> testCases = new ArrayList<>();

        testCases.add("LoginTest");
        testCases.add("LogoutTest");
        testCases.add("AddItemTest");
        testCases.add("AddItemTest");

        System.out.println("All Test Cases: " + testCases);

        System.out.println("Second Test Case: " + testCases.get(1));

        testCases.remove("LogoutTest");
        System.out.println("After Removing 'LogoutTest': " + testCases);

         // a) Normal for loop
         System.out.println("\nIteration using normal for loop:");
         for (int i = 0; i < testCases.size(); i++) {
             System.out.println(testCases.get(i));
         }
 
         // b) Enhanced for loop
         System.out.println("\nIteration using enhanced for loop:");
         for (String test : testCases) {
             System.out.println(test);
         }
 
         // c) Iterator
         System.out.println("\nIteration using Iterator:");
         Iterator<String> iterator = testCases.iterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }
    }
}
