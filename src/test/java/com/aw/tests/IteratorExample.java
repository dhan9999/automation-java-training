package com.aw.tests;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample
{

    public static void main(String[] args) 
    {
    
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");
        browsers.add("Opera");

        System.out.println("Original List: " + browsers);

        Iterator<String> iterator = browsers.iterator();

        while (iterator.hasNext()) {
            String browser = iterator.next();
            if (browser.equals("Opera"))
             {
                iterator.remove();  
            }
        }

        System.out.println("After removing 'Opera': " + browsers);
    }
    }
