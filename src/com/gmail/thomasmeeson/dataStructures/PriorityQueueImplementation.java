/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.dataStructures;

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

    }

}
