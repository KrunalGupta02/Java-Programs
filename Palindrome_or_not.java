package com.company;

import java.util.Scanner;

public class Palindrome_or_not {
    public static void main(String[] args) {
        // A palindrome number is a number that is same after reverse
        // Eg:- 545,121,151,48984 etc and LOL,MADAM,MAM,MOM etc.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(num>0)
        {
            rev = rev * 10;
            rev = rev + num%10;
            num = num/10;
        }
        if (rev == temp)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
