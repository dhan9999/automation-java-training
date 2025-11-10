package com.aw.tests;

import java.util.Scanner;

public class String_Example 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String reversedName = sb.toString();

        StringBuffer finalMessage = new StringBuffer();
        finalMessage.append("Hello ").append(reversedName)
                    .append(", Welcome to Automation Training!");

                    System.out.println("\nFinal Message:");
        System.out.println(finalMessage.toString());

        sc.close();
    }
}
