// Program to demonstrate the use of static variable

package com.aw.tests;

class BrowserConfig 
{
    static String browserName = "Chrome";
}

public class StaticVariable 
{

    public static void main(String[] args) 
    {
    
        System.out.println("Default Browser: " + BrowserConfig.browserName);

        BrowserConfig.browserName = "Edge";

        System.out.println("Updated Browser: " + BrowserConfig.browserName);
    }
}
