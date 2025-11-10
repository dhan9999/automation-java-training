package com.aw.tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 
{

    public static void main(String[] args) 
    {
    
        // ---------- Checked Exception (IOException) ----------
        try 
        {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);  // May throw IOException if file not found
            System.out.println("File opened successfully.");
            fr.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Checked Exception caught: File not found or cannot read file.");
        }

          // ---------- Unchecked Exception (ArithmeticException) ----------
          try 
          {
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Unchecked Exception caught: Cannot divide by zero.");
        }

        System.out.println("Program continues...");

    }
}
