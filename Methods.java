package com.company;

import java.util.Scanner;

public class Methods {

    public static void printMyName(String name)             // Function Declaration
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args)
    {
        // Method is block of code which performs a specific task
        // Syntax:-

        /*
        returnType functionName(type arg1,type arg2, type arg3...)
        {
            Operations
        }
         */

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);          // Function Call

    }
}
