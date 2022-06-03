package com.company;

public class Array_Reverse {
    public static void main(String[] args) {

        int a[] = {1, 2, 4, 5, 6};

        System.out.println("Array elements are:");
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d\t",a[i]);
        }

        System.out.println("\nReverse array is:");
        for (int i = a.length-1;i>=0;i--)
        {
            System.out.printf("%d\t",a[i]);
        }
    }
}
