// Program to demonstrate method overloading

package com.aw.tests;

public class Calculator
{

    public int add(int a, int b) 
    {
        return a + b;
    }

    public double add (double a, double b) 
    {
        return a+b;
    }
    public int add (int a, int b, int c) 
    {
        return a+b+c;
    }
    public static void main(String[] args) 
    {
        Calculator c=new Calculator();
        int sum1= c.add(2,3);
        double sum2=c.add(5.5,6.4);
        int sum3=c.add(1,2,3);

        System.out.println("Sum of two integers: "+sum1);
        System.out.println("Sum of two doubles: "+sum2);
        System.out.println("Sum of three integers: "+sum3);
    }

}
