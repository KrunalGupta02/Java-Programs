package com.company;

import java.util.Scanner;

public class GCD_Another_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // If user enters -ve numbers, sign of the number is changed to +ve
        n1 = (n1>0)?n1:-n1;
        n2 = (n2>0)?n2:-n2;

        while(n1!=n2)
        {
            if (n1>n2)
                n1-=n2;
            else
                n2-=n1;
        }
        System.out.println("GCD of two numbers:"+n1);
    }
}
