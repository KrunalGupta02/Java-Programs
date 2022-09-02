package com.company;
import java.lang.Math;

public class nth_FiboNumber {
    static int fibo(int n){
//        Base Condition
        if(n<2){
            return n;

        }
        return fibo(n-1) + fibo(n-2);
    }

    static int fiboFormula(int n){

        return ((int) (Math.pow(((1 + Math.sqrt(5))/2),n)/ Math.sqrt(5)));
    }
    public static void main(String[] args) {

//        for(int i=0;i<=11;i++){
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(50));
    }
}
