package com.company;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;

        /*
        if(n==1 || n==2)
            return (n-1)
         */

        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args)
    {
        // Fibonacci :- 0,1,1,2,3,5,8,13,21......

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms");
        int n = sc.nextInt();

        int result = fib(n);

        System.out.println(result);

          // Use this to print the whole Fibonacci Series
//        for (int i = 1;i<=n;i++)
//        {
//            System.out.format(" %d ",fib(i));
//        }
    }
}
