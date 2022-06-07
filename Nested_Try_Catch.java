package com.company;

import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args)
    {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 19;
        marks[2] = 3;


        Scanner sc = new Scanner(System.in);


        boolean flag = true;

        while(flag) {
            System.out.println("Enter value of Index:");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to Nested Try catch tutorial");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index not found");
                    System.out.println("Exception in Level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
            System.out.println("Thanks for using this program");
        }
    }
}
