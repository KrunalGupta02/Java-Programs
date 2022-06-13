package com.company;

import java.util.Scanner;

public class Palindrome_or_not_another_method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String original;
        String reverse = "";

        System.out.println("Enter a string/number to check if it is a palindrome");
        original = sc.nextLine();

        int length = original.length();

        for(int i = length - 1; i>=0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse))
        {
            System.out.println("Entered string/number is palindrome");
        }
        else
        {
            System.out.println("Entered string/number is not palindrome");
        }

    }
}
