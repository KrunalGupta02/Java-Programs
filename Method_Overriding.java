package com.company;

class A{
    public int a;

    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am method 2 of Class A");
    }
}
class B extends A{
    @Override           // This is nothing but just the indication that Method Overriding is work fine or not.
    public void meth2(){
        System.out.println("I am method 2 of Class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of Class B");
    }
}
public class Method_Overriding {
    public static void main (String[] args)
    {
        /*
         -> If the child class implements the same method  present in the parent class again, it is known as Method Overriding
         -> Redefining method of Super Class ! (In subclass)
         -> Argument list must be same , return type should be same or subclass of old return type
         -> Access level should not be restricted of the method in which method overriding is performing (public, public etc)
         -> We cannot override static and final methods
        */

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
