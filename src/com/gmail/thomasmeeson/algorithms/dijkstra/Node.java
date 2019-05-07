/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstra;

public class Node implements Comparable<Node>{

    final String value;
    public Edge[] adjacencies;
    double shortestDistance = Double.POSITIVE_INFINITY;
    public Node parent;

    public Node(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public int compareTo(Node other) {
        return Double.compare(shortestDistance, other.shortestDistance);
    }
}
