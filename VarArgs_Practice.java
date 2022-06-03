package com.company;

import java.util.Scanner;

// Write a function to find the average of a set of numbers passed as arguments.

public class VarArgs_Practice{
    static void Avg(int ...arr)
    {
        int sum = 0;

        for (int a:arr)
        {
            sum = sum+a;
        }
        System.out.println("Average of numbers:"+sum/arr.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Avg(3,2,4,7);

    }
}
