package com.company;

import java.util.Scanner;

public class Add_Multiply_Numbers_using_method {
    public static int sum(int a , int b)
    {
        int addition = a + b;
        return  addition;
    }
    public static int mult(int a , int b)
    {
        int product = a*b;
        return  product;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum of two numbers= "+sum(a,b));
        System.out.println("The Product of two numbers= "+mult(a,b));

    }
}
