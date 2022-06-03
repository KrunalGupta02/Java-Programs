package com.company;

public class VarArgs {

//    public  static int add(int a, int b)
//    {
//        return a+b;
//    }

    static  int add(int ...arr)
    {
        int sum = 0;
        for (int a : arr)           // Available as int [] arr
        {
            sum+= a;
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Variable Arguments Tutorials");

        System.out.println("The sum is:"+add(4,5));
        System.out.println("The sum is:"+add(4,5,6));
        System.out.println("The sum is:"+add(4,5,6,7));
        System.out.println("The sum of Nothing is:"+add());

//        System.out.println("The sum of 4,3 and 5 is:"+add(4,3,5));             // This will throw error
        // At this time varargs come into picture


    }
}
