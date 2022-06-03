package com.company;

public class Add_Matrix {
    public static void main(String[] args) {

        int [][] a = {
                {1,2,3},
                {4,5,6}
        };
        int [][] b = {
                {2,6,13},
                {3,7,1},
        };

        int [][] c = new int[2][3];

        for(int i =0;i<a.length;i++)
        {
            for (int j = 0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.println();
        }

    }
}
