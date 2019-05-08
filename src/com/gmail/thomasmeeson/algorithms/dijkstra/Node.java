/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

import java.util.ArrayList;

public class Node implements Comparable<Node>{

    final String value;
    ArrayList<Edge> adjacencies = new ArrayList<>();
    double shortestDistance = Double.POSITIVE_INFINITY;
    Node parent;

    public Node(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public int compareTo(Node other) {
        return Double.compare(shortestDistance, other.shortestDistance);
    }

    public void addEdge(Edge e) {
        this.adjacencies.add(e);
    }
}
