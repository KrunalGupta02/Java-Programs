package com.company.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(2);
//        queue.add(33);
        queue.offer(34);
        queue.offer(32);

        System.out.println(queue);

        System.out.println(queue.peek());

//        queue.remove();
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());

//        Note:- We can also use the add() for adding elements and remove() for removing elements but this is not preferable bcz it throws exception
    }
}
