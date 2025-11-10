package com.aw.tests;

public class String_Example2 
{
    public static void main(String[] args) 
    {

        String sentence = "I am learning Selenium automation testing.";
       
        if (sentence.contains("Selenium")) 
        {
            System.out.println(" The sentence contains the word 'Selenium'.");
        } 
        else 
        {
            System.out.println("The sentence does not contain the word 'Selenium'.");
        }

        
        String browsers = "Chrome,Firefox,Edge";
        String[] browserList = browsers.split(",");

        System.out.println("\nList of Browsers:");
        for (String browser : browserList) {
            System.out.println("- " + browser);
        }

        
        String role = "Java Automation Engineer";
        String extracted = role.substring(5, 16); 
        System.out.println("\nExtracted Word using substring(): " + extracted);
    }
}