package com.aw.tests;

abstract class Browser 
{
    
    abstract void launch();
}

class ChromeBrowser extends Browser 
{
    @Override
    void launch() 
    {
        System.out.println("Launching Chrome Browser...");
    }
}

class FirefoxBrowser extends Browser {
    @Override
    void launch() 
    {
        System.out.println("Launching Firefox Browser...");
    }
}
public class Abstraction 
{

    public static void main(String[] args) 
    {
    
        Browser chrome = new ChromeBrowser();
        Browser firefox = new FirefoxBrowser();

        chrome.launch();   
        firefox.launch();  
    }
    }
