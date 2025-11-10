// Program to demonstrate method overriding

package com.aw.tests;

class Animal 
{

    public void speak()
    {
        System.out.println("Some Sound");
    }
    
}
class Dog extends Animal
{

    public void speak()
    {
        System.out.println("Woof");
    }
}

class Cat extends Animal
{

    public void speak()
    {
        System.out.println("Meow");
    }
}

public class MethodOverriding 
{
    public static void main(String[] args)
    {

        Animal a=new Dog();
        a.speak();

        Animal a2=new Cat();
        a2.speak();
    }
}
