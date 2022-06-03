package com.company;
import java.util.*;

class Emp{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
class Cellphone{
    public void showRinging()
    {
        System.out.println("Phone is Ringing");
    }
    public void showVibrating()
    {
        System.out.println("Phone is Vibrating");
    }
    public void call()
    {
        System.out.println("Call friend Raj");
    }
}
class Square{
    int side;

    public void calArea()
    {
        float area = side * side;
        System.out.println("Area of Square is: "+area);
    }
    public float calPerimeter()
    {
        return 4*side;
    }
}
public class OOPS_Practice1 {
    public static void main(String[] args) {

        // Problem 1
        // Create a class Employee with the following properties and methods:
        //Salary (property) (int)
        //getSalary (method returning int)
        //name (property) (String)
        //getName (method returning String)
        //setName (method changing name)

        /*
        Emp obj = new Emp();

        obj.setName("KRG");
        obj.salary = 30000;

        System.out.println(obj.getSalary());
        */

        // Problem 2
        // Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

        /*
        Cellphone mi = new Cellphone();

        mi.showRinging();
        mi.showVibrating();
        mi.call();
        */

        // Problem 3
        // Create a class Square with a method to initialize its side, calculating area, perimeter etc.

        Square sq = new Square();

        sq.side = 5;

        sq.calArea();
        System.out.println("Perimeter of Square is: "+sq.calPerimeter());


    }
}
