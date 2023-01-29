package com.company;

public class ForEachLoop {
    public static void main(String[] args)
    {
        //float[] marks = {55.5f,95.5f,45.3f,89.2f,99.9f};
        //String [] students = {"Krunal","KRG","Aman","Aditya"};
        //System.out.println(students.length);

        int [] marks = {33,54,66,75,94};
        System.out.println(marks.length);
        System.out.println(marks[0]);


//        for-each loop
        // For each loop is enhanced version of for loop
        // It travels each element of the data structure one by one
        // It increases the readability of the code
        //Note that you can not skip any element in for loop, and
        // it is also not possible to traverse elements in reverse order with the help of for each loop.

        /*Syntax:-
        for(int element:Array_name){
        System.out.println(element);        // Prints all the elements
        }
         */

        for (int element:marks) {
            System.out.println(element);
        }
    }
}
