//Demonstrate the use of Tree Set
package com.aw.tests;

import java.util.TreeSet;

public class TreeSetDemo 
{
    public static void main(String[] args) 
    {
    
        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("India"); 

        System.out.println("All countries (sorted): " + countries);

        
        System.out.println("First country: " + countries.first());
        System.out.println("Last country: " + countries.last());

        System.out.println("HeadSet (before 'Germany'): " + countries.headSet("Germany"));
        System.out.println("TailSet (from 'Germany' onwards): " + countries.tailSet("Germany"));
    }
}
