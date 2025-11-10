package com.aw.tests;

class Employee 
{
    private String name;
    private int id;
    private double salary;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) 
    {
        this.id = id;
    }

    
    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
}

public class Encapsulation 
{

    public static void main(String[] args) 
    {
    
        Employee e = new Employee();

        e.setName("Dhananjay");
        e.setId(101);
        e.setSalary(75000.50);

        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Salary: " + e.getSalary());
    }
        
    }
