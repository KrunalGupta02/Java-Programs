package com.company;
import java.util.*;

public class MethodOverloading_2 {
    // Case 1
    int multiply(int a , int b)
    {
        return  a*b;
    }
    double multiply(double a , double b)
    {
        return a*b;
    }


    // Case 2
//    int multiply(int a , int b)
//    {
//        return a*b;
//    }
    int multiply(int a , int b,int c)
    {
        return a*b;
    }

    public static void main(String[] args) {
        /* In Java, method overloading can be performed by two ways listed below :

        (1) By changing the return type of the different methods
        (2) By changing the number of arguments accepted by the method

         */

        // CASE 1:- By changing the return type
        MethodOverloading_2 obj = new MethodOverloading_2();
        int c = obj.multiply(8,4);
        double d = obj.multiply(8.0,4.0);


        System.out.println("Multiply method : returns integer : " + c);
        System.out.println("Multiply method : returns double : " +  d);

        // CASE 2:- By changing the number of args

        int e = obj.multiply(5,4);
        int f = obj.multiply(4,9,7);
        System.out.println(e);
        System.out.println(f);
    }
}
