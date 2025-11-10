// Program to demonstrate method overloading

package com.aw.tests;

public class MethodOverloading
{

public void sayHello()
{

  System.out.println("Hello"); 
}

public void sayHello(String name)
{
   System.out.println("Hello " + name);
}

public void sayHello(String name, int age)
{
  System.out.println("Hello " + name + " you are " + age + " years old");
}
public static void main(String[] args)
{
  MethodOverloading m=new MethodOverloading();
  m.sayHello();
  m.sayHello("Test");
  m.sayHello("Test", 25);
}
} 
