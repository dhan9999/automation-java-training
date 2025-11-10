// Program to demonstrate the use of final variable

package com.aw.tests;

public class FinalVariable 
{

    final int MAX_WAIT_TIME = 30;
    public static void main(String[] args) 
    {

        FinalVariable fv = new FinalVariable();

        System.out.println("Maximum wait time: " + fv.MAX_WAIT_TIME);

       // fv.MAX_WAIT_TIME = 60;
    }
}
