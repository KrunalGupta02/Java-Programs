package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Base Class Constructor");
    }

    Base1(int x){
        System.out.println("I am a overloaded constructor with value of a:"+x);
    }
}
class Derived1 extends Base1{

    Derived1(){
//        super(10);
        System.out.println("I am a Derived class Constructor");
    }

    Derived1(int x , int y){
        super(x);
        System.out.println("I am an Overloaded Constructor in Derived Class with value of y: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a Child of Derived class Constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an Overloaded Constructor in ChildOfDerived Class with value of z: "+z);
    }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {

        // When derived class is extended from the Base class, the Constructor of the Base class is executed first
        // followed by the Constructor of the Derived class.
        // For the following Inheritance hierarchy the Constructor are executed in the Order : 1->2->3

        /*
        C1- Parent                      // Constructor execute in top to bottom order
        C2 - Child
        C3 - Grand Child
         */

//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(40,50);
        ChildOfDerived cd = new ChildOfDerived(12,13,15);


    }
}
