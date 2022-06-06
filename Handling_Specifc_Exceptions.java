package com.company;

import java.util.Scanner;

public class Handling_Specifc_Exceptions {
    public static void main(String[] args) {
        // In java, we can handle specific exceptions by typing multiple catch blocks.

        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 19;
        marks[2] = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array index:");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with:");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is:"+marks[ind]);
            System.out.println("The value of array-value/number is :"+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Exception occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }



    }
}
