package com.aw.tests;

import java.util.ArrayList;

public class ArrayListExample
{

    public static void main(String[] args) 
    {
    
        ArrayList<String> browsers = new ArrayList<>();

        // Add browser names to the list
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");
        browsers.add("Opera");

        System.out.println("List of Browsers:");
        for (String browser : browsers) 
        {
            System.out.println(browser);
        }
    }
}
