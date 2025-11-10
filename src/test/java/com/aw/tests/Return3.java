package com.aw.tests;

// Check eligibility : Create a method 'boolean isEligible(int age)' that returns true if age ≥ 18, otherwise false.


public class Return3 
{
    public static boolean isEligible(int age)
    {
        if (age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String [] args)
    {

        int age1=15;

        int age2=20;

        System.out.println(" Age is : "+ age1 + " Eligible " +isEligible(age1));

        System.out.println(" Age is : "+ age2 + " Eligible " +isEligible(age2));
    }
}
