package com.company;

public class Array
{
    public static void main(String[] args) {

        // Collection of similar data types is known as Arrays

        //int[] mark;
        int[] marks = new int[5];

        marks[0] = 100;
        marks[1] = 91;
        marks[2] = 89;
        marks[3] = 75;
        marks[4] = 80;
//      marks[5] = 67;  // Throws an error of Array of bound
        System.out.println(marks[4]);

        for (int i = 0 ; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        // There are 3 main ways to Create an Array in Java

        //(1)
        //int[] marks;        // Declaration
        //marks = new int[5];     // Memory Allocation

        //(2)
        //int[] marks = new int[5];           // Declaration + Memory Allocation

        //(3)
        //int[] marks = {100,43,66,88,85};    // Declare + Memory Allocation + Initialize

    }
}
