package com.company;

public class Max_element_Array {
    public static void main(String[] args) {
//        Max element in an Array

        int [] x = {2,4,5,-15,5};

        int max=Integer.MIN_VALUE;                  // Assume

        System.out.println("Array element are:");
        for (int i=0;i<x.length;i++)
        {
            System.out.printf("%d\t",x[i]);
        }
        System.out.println();

        for (int i=0;i<x.length;i++)
        {
            if (x[i]>max)
                max=x[i];
        }
        System.out.println("Maximum element in an array is :"+max);
    }
}
