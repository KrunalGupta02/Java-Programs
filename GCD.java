package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        /*
        The Greatest Common Divisor(GCD) of two number is the greatest common factor number that divides them exactly.
        It is also called the Highest Common Factor(HCF).
        For Example, the greatest common factor of 15 and 10 is 5, since both the number can be divided by 5.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1!=n2)
        {
            if (n1>n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }

        System.out.println("The Greatest common divisor is "+n2);
    }
}
