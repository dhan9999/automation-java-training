package com.aw.tests;

/* Mobile class

   * Fields: 'brand', 'price'.
   * Method: 'printDetails()'.
   * Create 2 mobiles and show details.*/

public class Class4 
{

    String brand;
    double price;

    public void printDetails()
    {
        System.out.println(" Brand : " + brand + " Price : " +price);
    }

    public static void main(String[] args) 
    {
        Class4 c4=new Class4();
        c4.brand="One Plus";
        c4.price=19200.59;

        Class4 c5=new Class4();
        c5.brand="Samsung";
        c5.price=20000;
        
        c4.printDetails();
        c5.printDetails();
    }
}
