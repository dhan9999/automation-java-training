package com.aw.tests;

/* Movie class

   * Fields: 'title', 'rating'.
   * Method: 'printDetails()'.
   * Create 2 movies and show details. */

public class Class6 
{

    String title;
    double rating;

    public void printDetails()
    {
        System.out.println(" Title :  " + title + " Rating : " +rating);
    }
    public static void main(String[] args) 
    {
        Class6 c6= new Class6();
        c6.title="Kantara";
        c6.rating=4.5;

        Class6 c7= new Class6();
        c7.title="Bebhubali";
        c7.rating=5;

        c6.printDetails();
        c7.printDetails();

    }
}
