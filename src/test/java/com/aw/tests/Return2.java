package com.aw.tests;

// Find maximum : Create a method 'int max(int a, int b)' that returns the larger number using 'return'.


public class Return2 
{

    public int max(int a, int b)
    {
       if (a>b)
       {
        return a ;
       } 

       else
       {
        return b ;
       }
    }

    public static void main (String [] args)
    {

        Return2 ret2=new Return2();

        int greater=ret2.max(10,35);

        System.out.println(" Maximim number is : " + greater);
    }
    
}
