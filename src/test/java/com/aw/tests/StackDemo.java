//Program to demonstrate the use of stack
package com.aw.tests;

import java.util.Stack;

public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack<String> pagesVisited = new Stack<>();

        pagesVisited.push("LoginPage");
        pagesVisited.push("HomePage");
        pagesVisited.push("CartPage");

        System.out.println("Pages visited: " + pagesVisited);

        
        String lastPage = pagesVisited.pop();
        System.out.println("Back button pressed, removed: " + lastPage);

        
        String currentPage = pagesVisited.peek();
        System.out.println("Current page on top: " + currentPage);

        
        System.out.println("Pages remaining in stack: " + pagesVisited);
    }
}
