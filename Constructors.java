package com.company;

class Constructor {
    private int id;
    private String name;

    // Default Constructors (zero args)
    public Constructor()
    {
        id = 54;
        name = "Your-Name-Here";
    }

    // Parameterized Constructors (have args)
    public Constructor(String myName,int myId)
    {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }

}
public class Constructors {
    public static void main(String[] args) {

        // Theory:-
        // -> Constructors are similar to methods , but they are used to initialize an object.
        // -> Constructors do not have return type(not even void).
        // -> Every time we create an object by using new Keyword , a Constructor is called.
        // -> If we do not create a constructors by ourselves, then the default Constructors(created by Java Compiler) is called.

        // Rules:-
        // -> The class name and constructors name should be same.
        // -> It must have no explicit return type.
        // -> It cannot be abstract, static , final and synchronized

        // Note:- Constructors can be Overloaded

//        Constructor obj = new Constructor();              // Call Default Constructors
        Constructor obj = new Constructor("ProgrammingWithKrunal",13);          // Call Parameterized Constructors

//        obj.setId(15);
//        obj.setName("Krunal Gupta");

        System.out.println(obj.getId());
        System.out.println(obj.getName());

    }
}
