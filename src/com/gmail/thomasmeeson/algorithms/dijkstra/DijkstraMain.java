/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

import java.util.PriorityQueue;

public class DijkstraMain {

    public static void computePaths(Node n) {

        // Default the shortest distance to 0
        n.shortestDistance = 0;

        // Use a PriorityQueueImplementation to create
        PriorityQueue<Node> q = new PriorityQueue<>();
        while(!q.isEmpty()){

            Node u = q.poll();


        }
    }

}
