package com.company;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails()
    {
        System.out.println("My ID is:"+id);
        System.out.println("My name is:"+name);
    }
    public int getSalary() {
        return salary;
    }
}
public class OOPS_1 {
    public static void main(String[] args) {

        // In a Java file there is only one public class present otherwise it will throw an error.
        // Any real world object = Properties + Behavior
        // Object in OOPs = Attributes + Methods


        Employee krg = new Employee();          // Instantiating a new Employee object
        Employee kgf = new Employee();          // Instantiating a new Employee object

        // Setting properties/attributes for krg
        krg.id = 15;
        krg.name = "Krunal Gupta";
        krg.salary = 50000;

        // Setting properties/attributes for kgf
        kgf.id = 03;
        kgf.name = "Rocky Bhai";
        kgf.salary = 35000;

        // Printing the properties/attributes
//        System.out.println(krg.id);
//        System.out.println(krg.name);
        krg.printDetails();
        kgf.printDetails();

        int salary = kgf.getSalary();
        System.out.println(salary);


    }
}
