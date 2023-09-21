package com.company.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

//        Syntax:
//        ArrayList<Wrapper object> = new ArrayList();

//        size = n
//                n + n/2 + 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);        // This will at the end of the list
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(140);
        newList.add(245);

        list.addAll(newList);           // This will add all the elements present in newlist to list
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);         // This will remove the element from specified index
        System.out.println(list);

        list.remove(Integer.valueOf(4));            // This will remove the specific element of specific type
        System.out.println(list);

//        list.clear();       // This will remove the entire list
//        System.out.println(list);


        list.set(2,44);
        System.out.println(list);

        System.out.println(list.contains(300));

//        for (int i=0; i<list.size();i++)
//        {
//            System.out.println("The element in Arralist:"+list.get(i));
//        }

//        for(Integer elements:list){
//            System.out.println("ForEach element in Arralist:"+elements);
//        }

//        Note:- In collection framwork there is "iterator" is present for iteration

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println("Iterator has:"+ it.next());
        }
    }
}
