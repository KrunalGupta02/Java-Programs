package com.company;

import java.util.*;

public class Greatest_of_two {
    public static int Greater(int a , int b)
    {
        if(a>b)                 // We can also use Math.max(a,b);
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greatest number is "+Greater(a,b));
    }
}
