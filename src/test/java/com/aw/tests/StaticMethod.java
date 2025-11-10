// Program to demonstrate the use of static method

package com.aw.tests;

public class StaticMethod 
{

    static String browserName = "Chrome";

    public static String getBrowserInfo() 
    {
        return "Running tests on " + browserName + " browser";
    }
    public static void main(String[] args) 
    {

        System.out.println(getBrowserInfo());
    }
}
