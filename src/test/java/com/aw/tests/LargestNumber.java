package com.aw.tests;

import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String[] args) 
    {
        
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter First number");
    int a=sc.nextInt();

    System.out.println("Enter Second number");
    int b=sc.nextInt();

    System.out.println("Enter Three number");
    int c=sc.nextInt();

    if(a>b && a> c)
    {
        System.out.println("First number is the largest one");
    }

    else if(b>a && b>c)
    {
        System.out.println("Second number is the largest one");
    }

    else
    {
        System.out.println("Third number is the larget one");
    }

}
}