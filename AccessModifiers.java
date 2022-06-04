package com.company;

class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 84;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        // Access modifiers determine whether other classes can use a particular field or invoke a particular method can be
        // public, private, protected, or default ( no modifier ).

        C1 c = new C1();
        c.meth1();

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);         --> Throws an Error
    }
}
