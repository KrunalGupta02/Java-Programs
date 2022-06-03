package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        // input 
        // rows 

        System.out.println("Enter array elements");
        for(int i = 0;i<rows;i++)
        {
            // columns
            for (int j = 0; j < cols; j++) 
            {
                numbers[i][j] = sc.nextInt();      
            }
        }

        System.out.println("Array elements are :");
        for(int i = 0;i<rows;i++)
        {
            for(int j= 0;j<cols;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    
}
