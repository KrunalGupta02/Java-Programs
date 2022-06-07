package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class throw_and_throws {
    public static int divide(int a , int b) throws ArithmeticException{

        // Made by Krunal
        int result = a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {

        // The throw keyword is used to throw an exception explicitly by the programmer
        // The throws keyword is used to declare an exception.

        // Made by Harry - uses divide function created by Krunal
        try {
            int res = divide(6, 0);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        try{
            double ar = area(8);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
