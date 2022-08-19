package com.company.Collections;

import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Horse");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");

        System.out.println("Stack:"+animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println("Stack:"+animals);

        System.out.println(animals.peek());
    }
}
