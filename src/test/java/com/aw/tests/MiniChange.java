package com.aw.tests;
public class MiniChange 
{

    public static void main(String []args)
    {
        int maths=75;
        int science=60;
        int english=80;

        int total=maths+science+english;

        float percentage=total/3;

        String result=(percentage>=40) ? "Pass" : "Fail";

        System.out.println("Reult is : "+result);
    }
}
