package com.aw.tests;

// Simple greeting : Create a method 'String greet(String name)' that returns '"Hello <name>"'.


public class Return 
{

    public static String greet(String name)
    {
        return " Hello " + name;
    }

    public static void main (String [] args)
    {
      String name1=greet("Dhananjay");

      System.out.println(name1);
    }
}
