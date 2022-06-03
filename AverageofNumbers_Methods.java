package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class AverageofNumbers_Methods {
    public static void avgOfThree(int a , int b , int c)
    {
        int sum = a + b + c;
        int avg = sum /3;

        System.out.println("Average is "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avgOfThree(a,b,c);
    }
}
