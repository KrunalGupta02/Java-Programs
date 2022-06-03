package com.company;

class Myemployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setId(int i)
    {
        this.id = i;
    }
    public int getId()
    {
        return id;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {

        /*
         Getter :- Returns the value [accesors]
         Setter :- Set/ Updates the value [mutators]
        */

        Myemployee obj = new Myemployee();

//        obj.id = 14;
//        obj.name = "Krunal";  --> Throws an error due to private access modifier

          obj.setName("Krunal Gupta");
          System.out.println(obj.getName());

          obj.setId(25);
          System.out.println(obj.getId());
    }
}
