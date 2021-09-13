/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int num1, num2, num3;

        //input
        System.out.println("Enter the first number: ");
        Scanner scan1 = new Scanner(System.in);
        num1 = scan1.nextInt();

        System.out.println("Enter the second number: ");
        Scanner scan2 = new Scanner(System.in);
        num2 = scan2.nextInt();

        System.out.println("Enter the third number: ");
        Scanner scan3 = new Scanner(System.in);
        num3 = scan3.nextInt();

        //processing
        if ((num1 == num2) || (num1 == num3) || (num2 == num3))
        {
            System.out.println("Numbers are not different. Try again.");
            System.exit(0);
        }

        //output
        else if ((num1 > num2) && (num1 > num3))
            System.out.println("The largest number is " +num1+ ".");
        else if ((num2 > num1) && (num2 > num3))
            System.out.println("The largest number is " +num2+ ".");
        else if ((num3 > num1) && (num3 > num2))
            System.out.println("The largest number is " +num3+ ".");
    }
}
