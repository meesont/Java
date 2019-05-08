/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

public class Edge {

    final Node target;
    final double weight;

    /**
     * Create an edge with a given weight
     * @param target The target node that the edge should point too
     * @param weight The weight given to the edge
     */
    public Edge(Node target, double weight) {
        this.target = target;
        this.weight = weight;
    }

    /**
     * Create an edge with no weight
     * @param target The target node that the edge should point too
     */
    public Edge(Node target) {
        this.target = target;
        this.weight = 0;
    }
}
