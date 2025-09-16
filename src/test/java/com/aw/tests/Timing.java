package com.aw.tests;

import java.util.Scanner;

public class Timing 
{

    public static void main(String[] args) 
    {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the hour value between 0 to 23");
    int a=sc.nextInt();

    if (a>=0 && a<=12)
    {
        System.out.println("Good Morning");
    }

    else if (a>=12 && a<=18)
    {
        System.out.println("Good Afternoon");
    }
        
    else if (a>=18 && a<=23)
    {
        System.out.println("Good Evening");
    }

    else
    {
        System.out.println("Please enter the correct value");
    }
    }

    }
