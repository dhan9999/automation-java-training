// Program to demonstrate the use of Vector
package com.aw.tests;

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo 
{

    public static void main(String[] args) 
    {

        Vector<Integer> responseCodes = new Vector<>();

        responseCodes.add(200);
        responseCodes.add(404);
        responseCodes.add(500);
        responseCodes.add(302);

        System.out.println("Response Codes using Enumeration:");
        Enumeration<Integer> codes = responseCodes.elements();
        while (codes.hasMoreElements()) {
            System.out.println(codes.nextElement());
        }

        responseCodes.add(403);
        responseCodes.remove((Integer) 500);

        System.out.println("\nUpdated Response Codes: " + responseCodes);
    }
}
