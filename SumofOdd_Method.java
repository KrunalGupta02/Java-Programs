package com.company;

import java.util.Scanner;

public class SumofOdd_Method {
    public  static  void sumOfOdd(int n)
    {
        int sum = 0;
        for (int i = 1;i<=n;i++)
        {
            if (i%2!=0)
            {
                sum+= i;
            }
        }
        System.out.printf("The sum of %d = %d",n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want the sum:");
        int n = sc.nextInt();

         sumOfOdd(n);
    }
}
