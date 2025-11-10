package com.aw.tests;

import java.util.LinkedList;

public class LinkedListExample 
{

    public static void main(String[] args) 
    {
    
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original LinkedList: " + numbers);

        numbers.removeFirst();

        System.out.println("After removing first element: " + numbers);
    }
    }

