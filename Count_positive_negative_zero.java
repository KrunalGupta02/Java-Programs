package com.company;

import java.util.Scanner;

public class Count_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos=0,neg=0,zero=0;

        System.out.println("Enter 1 to start and 0 to stop");
        int n = sc.nextInt();

        while(n==1)
        {
            System.out.println("Enter your number:");
            int number = sc.nextInt();

            if (number>0)
                pos++;
            else if(number<0)
                neg++;
            else
                zero++;

            System.out.println("Press 1 to continue and 0 to stop");
            n = sc.nextInt();
        }

        System.out.println("The number of +ve number is :"+pos);
        System.out.println("The number of -ve number is :"+neg);
        System.out.println("The number of zero number is :"+zero);
    }
}
