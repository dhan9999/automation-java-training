package com.aw.tests;

/* Book class

* Fields: 'title', 'author'.
* Method: 'showInfo()'.
* Create 3 book objects and print their info. */


public class Class2 
{
    String title;
    String author;

    public void showInfo()
    {
        System.out.println(" Title : " + title + " Author : " +author);
    }
   public static void main(String[] args) 
    {    
        Class2 c1=new Class2();
        c1.title="Bhagavad Gita";
        c1.author="Shri Krishna";

        Class2 c2=new Class2();
        c2.title="Yayati";
        c2.author="Vishwas Khandekar";

        Class2 c3=new Class2();
        c3.title="Mrityunjay";
        c3.author="Shivaji Sawant";

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();


    }
}
