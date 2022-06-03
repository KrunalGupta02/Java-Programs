package com.company;

class EkClass{
    int a;

    EkClass(int a){
//        a = a;
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public int returnone(){
        return 1;
    }
}
class Doclass extends EkClass{
    Doclass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }
}
public class This_and_Super_Keyword {
    public static void main(String[] args) {

        // -> this is way for us to reference an object of class which is being created/referenced.
        // -> It is used to call the default constructor of the same class.
        // -> this keyword eliminates the confusion b/w the parameters and the class attributes with the same name.

        // -> A reference variable used to refer immediate parent class object.
        // -> It can be used to refer immediate parent class instance variable.
        // -> It can be used to invoke the parent class method.


        EkClass e = new EkClass(5);
        Doclass d = new Doclass(18);
        System.out.println(e.getA());

    }
}
