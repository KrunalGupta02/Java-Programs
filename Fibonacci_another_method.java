package com.company;

import java.util.Scanner;

public class Fibonacci_another_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0,second = 1, nextTerm;

        System.out.println("Enter number of Terms:");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 0;i<=n;i++)
        {
            System.out.format("%d ,",first);

            nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
