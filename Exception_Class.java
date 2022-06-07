package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that value of age will be correct";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        // We can write our custom Exceptions using the Exception class in java.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();            // Used to print line at which exception occured
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
