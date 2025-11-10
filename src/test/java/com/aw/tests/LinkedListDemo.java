// Program to demonstrate the use of LinkedList
package com.aw.tests;

import java.util.LinkedList;


public class LinkedListDemo 
{

    public static void main(String[] args) 
    {

        LinkedList<String> browsers = new LinkedList<>();

        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Firefox");

        browsers.addFirst("Safari");
        browsers.addLast("Opera");

        browsers.remove("Edge");

        System.out.println("Available Browsers: " + browsers);
    }
}
