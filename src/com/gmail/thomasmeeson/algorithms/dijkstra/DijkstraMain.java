/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraMain {

    /**
     * This method is designed to update the shortestDistance value for node {@param n}
     * @param n The node to calculate the paths from, the source of the graph
     */
    public static void computePaths(Node n) {

        // Default the shortest distance to 0
        n.shortestDistance = 0;

        // Use a PriorityQueueImplementation to create
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(n);

        while(!queue.isEmpty()){

            // Remove first element of the queue
            Node head = queue.poll();

            // For every edge adjacent from the node
            for (Edge edge :
                    head.adjacencies) {

                // Get the target node of the edge
                Node target = edge.target;

                // Get the weight assigned to the edge
                double weight = edge.weight;

                // Calculate the shortest distance
                // at this point shortestDistance is either equal to 0
                // or equal to whatever it has been set too
                double distanceFromU = head.shortestDistance + weight;

                // check if shortest distance of the target currently is greater than
                //
                if(distanceFromU < target.shortestDistance) {
                    // Remove the target node from
                    queue.remove(target);

                    // Set the shortestDistance of the target
                    target.shortestDistance = distanceFromU;

                    // Set the parent of the target to the head of the PriorityQueue
                    target.parent = head;

                    // Add the target to the end of the queue
                    queue.add(target);

                }

            }

        }
    }

    /**
     * A function to call Dijkstra's algorithm, relies on {@see computePaths} having been called first
     * @param target The target to get too, from the source given too {@see computePaths}
     * @return A list of nodes
     */
    public static List<Node> getShortestPathTo(Node target){
        List<Node> path = new ArrayList<>();
        for (Node node = target; node != null; node = node.parent) {
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }


    public static void main(String[] args) {


        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.addEdge(new Edge(b, 7));
        a.addEdge(new Edge(c, 5));
        b.addEdge(new Edge(d, 3));
        c.addEdge(new Edge(d, 8));
        c.addEdge(new Edge(e, 9));
        c.addEdge(new Edge(f, 19));
        c.addEdge(new Edge(g, 28));
        d.addEdge(new Edge(e, 12));
        e.addEdge(new Edge(f, 14));
        e.addEdge(new Edge(g, 17));
        f.addEdge(new Edge(g, 5));


        // Compute the paths with A as the source node
        computePaths(b);

        List<Node> path = getShortestPathTo(f);
        System.out.println("Path from node 'b' to node 'f': " + path);
    }

}