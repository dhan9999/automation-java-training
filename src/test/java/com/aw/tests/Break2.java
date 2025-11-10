package com.aw.tests;

import java.util.Scanner;

// Read 10 integers from the user. If any number is negative, stop reading further.


public class Break2 
{

    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<=10; i++)
        {

            System.out.println("Enter any number");
            
            int a=sc.nextInt();

            if (a<0)
            {
                System.out.println("Entered number is negative");

                break;
            }

            System.out.println("Entered number is : "+a);




        }
    }
}
