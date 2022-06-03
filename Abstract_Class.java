package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am constructor of Parent Class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon!");
    }
}

abstract class  Child1 extends Parent{
    public void th(){
        System.out.println("Say Hello!");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {

//        Abstract Class :- Khayali Pulao
//        Abstract-> Abstract in English means existing in through or as an idea without concrete existence.
//        Note:- A method that is declared without implementation is known as the abstract method.

//         Parent p = new Parent();     --- error ( Cannot make object of Abstract Class)
         Child c = new Child();
//         Child1 c1 = new Child1();    --- error ( Cannot make object of Abstract Class)
    }
}
