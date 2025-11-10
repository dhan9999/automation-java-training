package com.aw.tests;

import java.util.Scanner;

public class DoWhile 
{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

       int a;

        do
        {
            System.out.println("Enter any number");

            a=sc.nextInt();

            if(a!=0)
            {

                System.out.println("Entered number is : "+a);
            } 
        } while(a!=0);

            System.out.println("You entered 0");
           
        }

    }
