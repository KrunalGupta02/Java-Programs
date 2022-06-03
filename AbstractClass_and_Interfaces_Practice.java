package com.company;

abstract class Pen{
    abstract public void write();
    abstract public void refil();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write from Pen");
    }
    void refil(){
        System.out.println("Refil your pen");
    }
}
public class AbstractClass_and_Interfaces_Practice {
    public static void main(String[] args) {

    }
}
