package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Hornbicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, Hornbicycle{
//    public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hooo na po poo po");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        // Interface in english is a point where two system meet and interact.
        // In Java interface is a group of related methods with empty bodies.
        // The interface is one more way to achieve abstraction in Java.
        // All properties in Interfaces are final.

        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);

        // We can create properites in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // We can modify the properties in Interfaces as they are final
//        cycleHarry.a = 453;
//        System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

    }
}
