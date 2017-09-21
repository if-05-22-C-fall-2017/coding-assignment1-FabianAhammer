/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreatestCommonDistributor;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Ahammer Fabian
 */
public class GreatestCommonDistributor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int a = 0, b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("BSP: GGT / GCD");
        System.out.println("Give two numbers to calculate the Greates Common Divisor: ");
        System.out.println("First digit: ");
        a = Integer.parseInt(in.nextLine());
        System.out.println("Second digit: ");
        b = Integer.parseInt(in.nextLine());
        System.out.println("Results: \n");
        System.out.println("Euklid Method : "+gcdEucledian(a,b));
        System.out.println("Recursive Method :"+gcdPrimeFactors(a,b));
		//Some Examples
		//1112,362 -> 2
		//5,1588 -> 1
		//965482,666541124 -> 2
		//12,16 -> 4
    }
    
    public static int gcdEucledian(int a, int b)
    {
        if(a == 0)
            return a;
        while (b != 0)
        {
            if(a>b)
                a = a - b;
            else
                b = b - a;
        }    
        return a;
    }


    public static int gcdPrimeFactors(int a, int b)
    {
        if (b == 0)
            return a;
        if(a == 0)
            return b;
        if(a > b)
            return gcdPrimeFactors(a - b, b);
        else
            return gcdPrimeFactors(a, b - a);
    }
    
}
