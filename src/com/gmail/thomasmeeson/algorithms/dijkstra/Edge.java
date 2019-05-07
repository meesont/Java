/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

public class Edge {

    final Node target;
    final double weight;

    public Edge(Node target, double weight) {
        this.target = target;
        this.weight = weight;
    }
}
