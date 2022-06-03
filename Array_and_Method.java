package com.company;

public class Array_and_Method {
    public static  void change(int [] arr)
    {
        arr[4]=65;
    }
    public static void change2(int x)
    {
        x = 45;
    }
    public static void main(String[] args) {

        // Case 1:- Changing the Array
        int [] marks = {45,78,98,89,20,65};
        change(marks);
        System.out.println("The value of array after running change is: "+marks[4]);

        // Case 2:- Changing the Integer
        int x = 84;
        change2(x);
        System.out.println("The value of integer after running change is: "+x);
    }
}
