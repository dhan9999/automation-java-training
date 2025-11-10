package com.aw.tests; 

// Skip blanks in names : Given an array of names like '{ "Amit", "", "Ravi", "Sneha" }', skip empty strings using 'continue'.


public class Continue2 
{

    public static void main (String [] args)
    {
        String [] names={"Dhananjay","","Niraj","","Swapnil"};


        for(String name : names)
        {

            if (name=="")
            {
                continue;
            }

            System.out.println("Name is : " +name);
        }
    }
}
