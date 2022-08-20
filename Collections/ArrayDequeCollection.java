package com.company.Collections;

import java.util.ArrayDeque;

public class ArrayDequeCollection {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(34);
        adq.offerFirst(23);
        adq.offerLast(24);
        adq.add(29);

        System.out.println(adq);

        System.out.println("Peek:"+adq.peek());
        System.out.println("PeekFirst:"+adq.peekFirst());
        System.out.println("PeekLast:"+adq.peekLast());

        System.out.println("Poll:"+adq.poll());
        System.out.println(adq);

        System.out.println("PollFirst:"+adq.pollFirst());
        System.out.println(adq);

        System.out.println("PollLast:"+adq.pollLast());
        System.out.println(adq);

    }
}
