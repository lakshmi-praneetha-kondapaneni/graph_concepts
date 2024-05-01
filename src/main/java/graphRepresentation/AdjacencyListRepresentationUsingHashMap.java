package graphRepresentation;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class AdjacencyListRepresentationUsingHashMap {
    static class Graph
    {
        int V;
        HashMap<Integer, List<Integer>> adjList;
        Graph(int V)
        {
            adjList=new HashMap<>();
            this.V=V;
            for(int i=0;i<V;i++)
                adjList.put(i,new ArrayList<>());
        }
        void addEdge(int source,int destination, boolean isUndirected)
        {
            adjList.get(source).add(destination);
            if(isUndirected)
                adjList.get(destination).add(source);
        }
        void printAdjacencyList()
        {
            for(int i = 0; i < V; i++){
                System.out.print(i + " --> ");
                // Iterating over one row!
                for(int node: adjList.get(i)){
                    System.out.print(node + ", ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
       Graph g = new Graph(6);

        g.addEdge(0,1, true);
        g.addEdge(0,4, true);
        g.addEdge(2,1, true);
        g.addEdge(3,4, true);
        g.addEdge(4,5, true);
        g.addEdge(2,3, true);
        g.addEdge(3,5, true);
        g.printAdjacencyList();
    }
}
