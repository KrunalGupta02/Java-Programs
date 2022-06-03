package com.company;

import java.util.Scanner;

public class Sum_of_Natural_numbers {

    // sum(n) = 1+2+3+4+....n
    // sum(n) = 1+2+3+4+....n-1+n
    // sum(n) = sum(n-1) + n

    // sum(3) = 3 + sum(2)
    // sum(2) = 2 + sum(1)

    static int sumOfNatural(int n)
    {
        // Base Condition
        if(n==1)
            return 1;
        else
            return n + sumOfNatural(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = sc.nextInt();

        int result = sumOfNatural(n);

        System.out.printf("Sum of %d natural number is :",n);
        System.out.println(result);
    }
}
