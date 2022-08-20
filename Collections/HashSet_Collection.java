package com.company.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Collection {
    public static void main(String[] args) {

//        Note:- In Set "Duplicate" elements are not allowed in this collection

//        Set<Integer> set = new HashSet<>();               // This will print the elements in random order
//        Set<Integer> set = new LinkedHashSet<>();           // This will print the elements in proper order
        Set<Integer> set = new TreeSet<>();                    // This will print the elements in sorted order


        set.add(2);
        set.add(34);
        set.add(24);
        set.add(12);
        set.add(65);

//        set.add(12);          --> Duplicate elements are not taken by the set

//        For every time we print we get the random order bcz of Hashing function working on it.
        System.out.println(set);

        set.remove(34);
        System.out.println(set);

        System.out.println(set.contains(24));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
