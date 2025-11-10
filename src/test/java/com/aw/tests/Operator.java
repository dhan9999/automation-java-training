package com.aw.tests;
public class Operator
 {

    void arithmatic ()
    {
        int a=10;
        int b=3;
        int add=a+b;
        int mul=a*b;
        int sub=a*b;
        int div=a/b;
        int mod=a%b;

        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulus: "+mod);
    }

    void relational()
    {
        int x=5;
        int y=10;

       System.out.println("x & y are equal : "+(x==y));
       System.out.println("x & y are not equal : "+(x!=y));
    }

    void Logical()
    {
        boolean hasPen=true;
        boolean hasBook=false;

       System.out.println("Pen & Book are equal: "+(hasPen&&hasBook));
       System.out.println("Pen & Book are not equal: "+(hasPen||hasBook));
       System.out.println("Pen is not equal to Pen: "+!hasPen);
    }

    void Assignment()
    {
        int num=10;
        
        num+=5;
        System.out.println("After addition : "+num);

        num-=2;
        System.out.println("After subtraction : "+num);

        num*=3;
        System.out.println("After multiplication : "+num);

        num/=4;
        System.out.println("After division : "+num);
    }

    void Ternery()
    {

        int age=18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("You are " + result);
    }

    
    public static void main(String[] args)
    {
        Operator op=new Operator();

        op.arithmatic();
        op.relational();
        op.Logical();
        op.Assignment();
        op.Ternery();
    }
}
