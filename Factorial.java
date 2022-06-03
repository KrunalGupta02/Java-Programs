package com.company;

import java.util.Scanner;

// Factorial is only possible for +ve numbers not for -ve numbers
public class Factorial{
    public static void printFactorial(int n)
    {
        if(n<0)                 // This will work for -ve numbers
        {
            System.out.println("Invalid Input");
            return;
        }

        int fact=1;

        for (int i = n;i>1;i--)
        {
            fact = fact * i;
        }
        System.out.printf("The factorial of %d = %d",n,fact);
        // return;      // It is optional for void return type
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to find the factorial");
        int n = sc.nextInt();

        printFactorial(n);
    }
}
