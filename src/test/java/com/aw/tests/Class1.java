package com.aw.tests;

/*Student class

 * Fields: 'name', 'age'.
* Method: 'display()'.
* Create 2 student objects and display details. */

public class Class1 
{
    String name;
    int age;

    public void display ()
    {
        System.out.println(" Name is : " + name + " Age is : " + age);
    }
    public static void main (String [] args)
    {
        Class1 c1=new Class1();
        c1.name="Dhananjay";
        c1.age=34;

        Class1 c2=new Class1();
        c2.name="Niraj";
        c2.age=34;

        c1.display();
        c2.display();
    }
}
