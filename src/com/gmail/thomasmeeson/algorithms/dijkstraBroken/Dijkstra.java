/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.algorithms.dijkstraBroken;

public class Dijkstra {

    public static void main(String[] args) {
        Graph graph = new Graph();


    }

    public static void dijkstra(Graph g, ) {

    }

    /**
     * A function to calculate the shortest path between 2 nodes on a graph
     * Uses a variation of Dijkstra's algorithm to create the shortest path
     * @param graph
     * @param origin
     * @param destination
     * @return
     */

    public static String shortestPath(Graph graph, Character origin, Character destination) {

    }

}


/*
def dijkstra(graph, initial):
    visited = {initial: 0}
    path = {}

    nodes = set(graph.nodes)

    while nodes:
        min_node = None
        for node in nodes:
            if node in visited:
                if min_node is None:
                    min_node = node
                elif visited[node] < visited[min_node]:
                    min_node = node
        if min_node is None:
            break

        nodes.remove(min_node)
        current_weight = visited[min_node]

        for edge in graph.edges[min_node]:
            try:
                weight = current_weight + graph.distances[(min_node, edge)]
            except:
                continue
            if edge not in visited or weight < visited[edge]:
                visited[edge] = weight
                path[edge] = min_node

    return visited, path


def shortest_path(graph, origin, destination):
    visited, paths = dijkstra(graph, origin)
    full_path = deque()
    _destination = paths[destination]

    while _destination != origin:
        full_path.appendleft(_destination)
        _destination = paths[_destination]

    full_path.appendleft(origin)
    full_path.append(destination)

    return visited[destination], list(full_path)

if __name__ == '__main__':
    graph = Graph()

    for node in ['A', 'B', 'C', 'D', 'E', 'F', 'G']:
        graph.add_node(node)

    graph.add_edge('A', 'B', 7)
    graph.add_edge('A', 'C', 5)
    graph.add_edge('B', 'D', 3)
    graph.add_edge('C', 'D', 8)
    graph.add_edge('C', 'E', 9)
    graph.add_edge('C', 'F', 19)
    graph.add_edge('C', 'G', 28)
    graph.add_edge('D', 'E', 12)
    graph.add_edge('E', 'F', 14)
    graph.add_edge('E', 'G', 17)
    graph.add_edge('F', 'G', 5)



    print(shortest_path(graph, 'B', 'F')) # output: (20, ['A', 'H', 'I'])

*/