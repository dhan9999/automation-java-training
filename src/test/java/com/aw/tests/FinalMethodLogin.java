// Program to demonstrate the use of final method
package com.aw.tests;

public class FinalMethodLogin extends FinalMethodBase
{

    @Override
    public void setup() {
        System.out.println("Login setup complete");
    }
    public static void main(String[] args) 
    {
        FinalMethodLogin fl = new FinalMethodLogin();
        fl.setup();
    }
}