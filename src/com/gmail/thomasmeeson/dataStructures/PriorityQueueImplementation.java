/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.dataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.add("Java");
        pQueue.add("Python");
        pQueue.add("C#");
        pQueue.add("C++");
        pQueue.add("JavaScript");

        // Print first line
        // PriorityQueue#peek() returns value of first element in queue but does not remove
        System.out.println(pQueue.peek());

        // PriorityQueue has an inbuilt iterator to iterate through every value
        Iterator<String> it = pQueue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // PriorityQueue#poll() returns value and removes first element in queue
        pQueue.poll();
    }

}
