package com.aw.tests;

import java.util.Scanner;

public class EvenOdd 
{

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number");
        int a=sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Number is evenn");
        }

        else
        {
            System.out.println("Numer is odd");
        }


    }
}
