package com.company;

import java.util.Scanner;

public class Even_or_Odd {
    public static void checkEven(int n)
    {
        if(n%2==0)
            System.out.printf("%d is Even",n);
        else
            System.out.printf("%d is Odd",n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkEven(n);



    }
}
