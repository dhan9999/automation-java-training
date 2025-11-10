package com.aw.tests;

import java.util.ArrayList;

public class ForEachExample 
{

    public static void main(String[] args) 
    {
    
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");
        browsers.add("Opera");

        System.out.println("Browsers List:");
        for (String browser : browsers) 
        {
            System.out.println(browser);
        }

    }
}
