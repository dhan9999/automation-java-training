package com.aw.tests;

//  Multiplication table cut-off : Print the multiplication table of 3 (from '3x1' to '3x10'). If result goes above 15, stop using 'break'.


public class Break3 

{
    public static void main(String[] args) 
    {

        int a=3 ;
        int b=1;

        while (b<=10)
        {
            System.out.println(a + "*" +b + "="+(a*b));

            b++;

            if(a*b>15)
            {
                
                System.out.println("Result is reater than 15 hence breaking");
                
                break ;

            }
           
        }
    }
}
