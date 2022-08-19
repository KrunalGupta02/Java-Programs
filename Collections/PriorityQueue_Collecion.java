package com.company.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Collecion {
    public static void main(String[] args) {

//        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);                 // Order will be changed bcz of function has doing some work

        System.out.println(pq.peek());
    }
}
