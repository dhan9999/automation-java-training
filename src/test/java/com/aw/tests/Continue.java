package com.aw.tests;

// Skip multiples of 3 : Print numbers 1 to 15, but skip all multiples of 3 using 'continue'.


public class Continue 
{

    public static void main(String [] args)
    {
     
        for (int i=1;i<=15;i++)
        {
            if(i%3==0)
            {
                continue; 
            }

            System.out.println("Number is : " +i);
        }
    }

}
