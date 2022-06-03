package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static int checkPrime(int n)
    {
        int flag = 0;
        for (int i = 1;i<=n;i++)
        {
            if (n%i==0)
                flag++;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = checkPrime(n);

        if (result ==2 )
            System.out.printf("%d is a Prime Number",n);
        else
            System.out.printf("%d is not a Prime Number",n);


    }
}
