package com.company;

public class Finally_Block_in_Exception {
    public static int greet(){
        try{
            int a = 80;
            int b = 0;
            int c = a/b;

            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources... This is the end of the function");
        }
        return -1;
    }
    public static void main(String[] args) {
        // Finally block contains the code which is always executed whether the exception is handled or not.
        // It is used to execute code containing instructions to release the system resources, close a connection etc.

        int k = greet();
        System.out.println(k);

        int a = 8;
        int b = 4;

        while (true) {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = "+b);
            }
            b--;
        }

        // Note:- We cannot write try without catch ,but we can write try with finally only but it can throw error in the output

        try{
            System.out.println(5/0);
        }
        finally {
            System.out.println("Yes this is finally");
        }




    }
}
