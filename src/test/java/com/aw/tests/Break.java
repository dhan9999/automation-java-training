package com.aw.tests;

//Find first even number : Print numbers in an array until the first even number appears, then stop using 'break'.


public class Break 
{

    public static void main(String [] args)
    {
       int [] numbers={15,27,25,30,35,40};

        for(int number : numbers )
        {
            if(number %2==0)
            {

                System.out.println("Breaking after finding the first event number : "+number);

                break;
            }

        System.out.println("Current number="+number);
        }
    }
}
