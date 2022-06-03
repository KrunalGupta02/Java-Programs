package com.company;

public class MethodOverloading {
    static void foo()
    {
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning "+a+" bro!");
    }
    static void foo(int a, int b)           // Here a and b are parameters
    {
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }
    public static void main(String args[])
    {
        // Two or more method have same name but different parameters. Such methods are known as Method Overloading
        // Method Overloading cannot be performed by changing the return type of methods.

        foo();
        foo(3000);          // Here 3000 are Argument and remember Arguments are actual
        foo(3000,4000);
    }
}
