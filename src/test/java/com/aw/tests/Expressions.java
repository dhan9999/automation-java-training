package com.aw.tests;
public class Expressions 
{

    void simplexpression()
    {

        int length=5;
        int breadth=3;
        int area=length*breadth;
        System.out.println("Area is : "+area);
    }

    void mathExpression()
    {
        int marks1=80;
        int marks2=90;
        int marks3=70;

        int total=marks1+marks2+marks3;

        int avg=total/3;
        System.out.println("Average is : "+total);

    }

    void StringExpression()
    {

        String firstName="Dhananjay";
        String lastName="Deshmukh";

        String fullName=firstName+lastName;

        System.out.println("Full Name is : " +fullName);
    }

    void combinedExpression()
    {
        int totalMarks=500;
        int obtained=420;

        float percentage=(obtained*100)/totalMarks;

        System.out.println("Percentage is : "+percentage);
    }

    public static void main(String[] args) 
    {
    
        Expressions e =new Expressions();

        e.simplexpression();

        e.mathExpression();

        e.StringExpression();

        e.combinedExpression();
        

    }
}
