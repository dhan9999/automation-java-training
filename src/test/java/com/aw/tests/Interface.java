package com.aw.tests;

interface WebActions 
{
    void click();
    void sendKeys(String input);
}

class WebDriverActions implements WebActions {

    @Override
    public void click() 
    {
        System.out.println("Click action performed.");
    }

    @Override
    public void sendKeys(String input) 
    {
        System.out.println("Typing: " + input);
    }
}
public class Interface 
{

    public static void main(String[] args) 
    {
    
        WebActions actions = new WebDriverActions();
        
        actions.click();
        actions.sendKeys("Hello World");
    }
    }
