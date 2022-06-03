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
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}
public class AbstractClass_and_Interfaces_Practice {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();

        Human Krg = new Human();
        Krg.sleep();

        Monkey m1 = new Human();
//        m1.speak();       // Cannot use speak method bcz the reference is monkey which does not have speak method
        m1.jump();
        m1.bite();

        BasicAnimal ba = new Human();
//        ba.speak();           // Error
        ba.eat();
        ba.sleep();




    }
}
