/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstraBroken;

import java.util.Dictionary;
import java.util.HashSet;

public class Graph {

    private HashSet<Character> nodes;
    private Dictionary<Character[][], Integer> edges;

    public Graph(HashSet<Character> nodes, Dictionary<Character[][], Integer> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public Graph() {
    }

    public HashSet<Character> getNodes() {
        return nodes;
    }

    public void setNodes(HashSet<Character> nodes) {
        this.nodes = nodes;
    }

    public Dictionary<Character[][], Integer> getEdges() {
        return edges;
    }

    public void setEdges(Dictionary<Character[][], Integer> edges) {
        this.edges = edges;
    }

    public void addEdge(Character startNode, Character endNode, int distance){
        Character[][] charArr = new Character[startNode][endNode];
        this.edges.put(charArr, distance);
    }

    public void addNode(Character node) {
        this.nodes.add(node);
    }
}

/*
class Graph(object):
    def __init__(self):
        self.nodes = set()
        self.edges = defaultdict(list)
        self.distances = {}

    def add_node(self, value):
        self.nodes.add(value)

    def add_edge(self, from_node, to_node, distance):
        self.edges[from_node].append(to_node)
        self.edges[to_node].append(from_node)
        self.distances[(from_node, to_node)] = distance
 */