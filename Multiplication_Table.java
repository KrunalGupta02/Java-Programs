package com.company;

import java.util.Scanner;

public class Multiplication_Table {
    public static void Table(int n)
    {
        for (int i = 1;i<=10;i++)
        {
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to generate the table");
        int n = sc.nextInt();

        Table(n);
    }
}
