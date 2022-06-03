package com.company;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String args[])
    {
//        Searching for an element x in a matrix.

        int i,j;
        int [][] numbers = new int[2][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");
        for (i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Element to be found is :");
        int x = sc.nextInt();

        System.out.println("Array elements are:");
        for (i =0;i<2;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (i=0;i<2;i++)
        {
            for (j=0;j<3;j++)
            {
                if (numbers[i][j] == x)
                {
                    System.out.println("x found at" + "("+i + "," + j+")");
                }


            }
        }

    }
}
