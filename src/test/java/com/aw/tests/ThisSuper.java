package com.aw.tests;

class Person 
{
    String name;
    int age;

    public Person(String name, int age) 
    {
        this.name = name; 
        this.age = age;
    }

    public void displayPersonInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person 
{
    String course;

    public Student(String name, int age, String course) 
    {
        super(name, age); 
        this.course = course;
    }

    
    public void displayStudentInfo() 
    {
        super.displayPersonInfo(); 
        System.out.println("Course: " + course);
    }
}

public class ThisSuper
{
    
    public static void main(String[] args) 
    {
    
        Student student1 = new Student("Dhananjay", 35, "Computer Science");
        
        System.out.println("Student Info:");
        student1.displayStudentInfo();
    }
}
