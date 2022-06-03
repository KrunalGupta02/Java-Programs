package com.company;

class Cylinder{

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder() {
        this.radius = 5;
        this.height = 4;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float surfaceArea(){
        return (float) (2 * Math.PI * radius * radius + 2*Math.PI*radius*height);
    }
    public float volume(){
        return (float) (Math.PI * radius * radius * height);
    }

}
public class Access_Modifiers_Practice {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(12,9);

        cylinder.setHeight(12);
        System.out.println(cylinder.getHeight());

        cylinder.setRadius(9);
        System.out.println(cylinder.getRadius());

        System.out.println("Surface Area of Cylinder is : "+cylinder.surfaceArea());
        System.out.println("Volume of cylinder is: "+cylinder.volume());
    }
}
