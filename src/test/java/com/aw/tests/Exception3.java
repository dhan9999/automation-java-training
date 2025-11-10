package com.aw.tests;

import java.util.Scanner;

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
    {
        super(message);
    }
}


public class Exception3 
{ 
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
    
            try {
                if (age < 18) 
                {
                    throw new InvalidAgeException("Not eligible for driving license");                 
                } 
                else 
                {
                    System.out.println("You are eligible for a driving license.");
                }
            } 
            catch (InvalidAgeException e) 
            {
                System.out.println("Exception: " + e.getMessage()); 
            } 
            finally 
            {
                sc.close();
            }
    }
}
