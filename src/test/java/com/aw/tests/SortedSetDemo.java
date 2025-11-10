//Program to demonstrate the use of sorted set
package com.aw.tests;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo 
{
    public static void main(String[] args) 
    {
    
        SortedSet<Integer> responseTimes = new TreeSet<>();

        responseTimes.add(320);
        responseTimes.add(150);
        responseTimes.add(180);
        responseTimes.add(450);
        responseTimes.add(150);  

        System.out.println("Response Times (sorted): " + responseTimes);

        Integer smallest = responseTimes.first();
        Integer largest = responseTimes.last();

        responseTimes.remove(smallest);
        responseTimes.remove(largest);

        System.out.println("After removing smallest (" + smallest + 
                           ") and largest (" + largest + "): " + responseTimes);
    }
}
