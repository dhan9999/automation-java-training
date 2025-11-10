// Program to demonstrate method overriding

package com.aw.tests;

class Vehicle
{
    void speed()
    {
        System.out.println("Speed");
    }
}
class Car extends Vehicle
{

    void speed()
    {
        System.out.println("Speed is 100 km/h");
    }
}

class Bike extends Vehicle
{
    void speed()
    {
        System.out.println("Speed is 60 km/h");
    }
}


public class MethodOverriding2 
{
   public static void main(String[] args)
    {
        Vehicle[] vehicles ={new Car(), new Bike()};
        for(Vehicle v : vehicles)
        {
            v.speed();
        }
    }
}
