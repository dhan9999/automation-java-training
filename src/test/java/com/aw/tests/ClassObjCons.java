package com.aw.tests;

class Car
{

    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) 
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        
    }

}
public class ClassObjCons 
{

    public static void main(String[] args) 
    {
    
        Car car1 = new Car("Toyota", "Fortuner", 75000);
        Car car2 = new Car("Honda", "Civic", 50000);

        System.out.println("Car 1 Info:");
        car1.displayCarInfo();

        System.out.println("Car 2 Info:");
        car2.displayCarInfo();
    }
}
