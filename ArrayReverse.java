package com.company;

public class ArrayReverse
{
    public static void main(String[] args)
    {
        int [] marks = {98,78,34,90,76};

        System.out.println("Array elements are:");
        for (int i = 0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Array elements in reverse order is :");
        for (int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
