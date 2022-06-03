package com.company;

abstract class Pen{
    abstract  void write();         // Don't use public modifiers
    abstract  void refil();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write from Pen");
    }
    void refil(){
        System.out.println("Refil your pen");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
public class AbstractClass_and_Interfaces_Practice {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        

    }
}
