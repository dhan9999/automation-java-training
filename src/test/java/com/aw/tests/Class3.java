package com.aw.tests; 

/* Rectangle class

   * Fields: 'length', 'width'.
   * Methods: 'area()', 'perimeter()'.
   * Create object and print area + perimeter. */

public class Class3 
{
    int length;
    int width;

    public void area()
    {
        int area=length*width;

        System.out.println(" Area = " +area);
    }
    public void perimeter()
    {
           int perimeter=2 * (length + width);
        System.out.println(" Perimeter = " +perimeter);
    }
    public static void main (String[] args)
    {
        Class3 c3=new Class3();

        c3.length=10;
        c3.width=20;

        c3.area();
        c3.perimeter();
    }
    
}
