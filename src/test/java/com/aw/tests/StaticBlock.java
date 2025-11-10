// Program to demonstrate the use of static block

package com.aw.tests;

public class StaticBlock 
{

    static 
    {
        System.out.println("Static block executed: Loading default browser configuration...");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method started...");
    }
}