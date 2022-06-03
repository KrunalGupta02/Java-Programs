package com.company;

class Base{
    public int x;

    public void setX(int x){
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public int  getX(){
        return x;
    }

    public void printMe(){
        System.out.println("This is Me!");
    }
}
class Derived extends Base{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}
public class Inheritance {
    public static void main(String[] args) {

        // -> In Java, one class can easily inherit the attributes and methods from some other class.
        // This mechanism of acquiring objects and properties from some other class is known as inheritance in Java
        // -> Inheritance is used to borrow properties & methods from an existing class.
        // -> Inheritance helps us create classes based on existing classes, which increases the code's reusability.

        // Note:- Java doesn't support multiple inheritance i.e. , two classes cannot be the superclass for a subclass.


        // Creating an object of Base Class
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        // Creating an object of Derived Class
        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());

        d.setY(34);
        System.out.println(d.getY());
    }
}