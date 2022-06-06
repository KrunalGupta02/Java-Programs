package com.company;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {


        // When Compiler finds something wrong with our program it throws, syntax error.
        int a = 5       // No semicolon, Syntax Error
        System.out.println(a);
        d = 4;          // Variable not declared, Syntax Error

        /*
         A logical error or a bug occurs when a program compiles and round but does the wrong thing.
        - Message delivered wrongly
        - Wrong time of chats being displayed
        Incorrect redirects!
        */
        // Prime Number
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        /*
        Java may sometimes encounter an error while the program is running.
        These are also called Exceptions!
        These are encountered due to circumstances like bad input and (or) resource constraints.

        Ex: User supplies 'S' + 8 to a program that adds 2 numbers.

        Syntax errors and logical errors are encountered by the programmers, whereas Run-time errors are encountered by the users
         */

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);


    }
}
