package com.aw.tests;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample 
{

    public static void main(String[] args) 
    {
    
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Chrome");
        browsers.add("Safari");
        browsers.add("Firefox"); 

        
        HashSet<String> uniqueBrowsers = new HashSet<>(browsers);

        
        System.out.println("Unique Browsers:");
        for (String browser : uniqueBrowsers) 
        {
            System.out.println(browser);
        }
    }
}
