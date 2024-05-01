package graphRepresentation;
import java.util.*;
// Adjacency List is represented as Array of Lists
public class AdjacencyListRepresentation {

    static class Graph
    {
        int V;
        List<Integer>[] adjList;
        Graph(int V)
        {
            adjList=new ArrayList[V];
            this.V=V;
            for(int i=0;i<V;i++)
                adjList[i]=new ArrayList<>();
        }
        void addEdge(int source,int destination, boolean isUndirected)
        {
            adjList[source].add(destination);
            if(isUndirected)
                adjList[destination].add(source);
        }
        void printAdjacencyList()
        {
            for(int i = 0; i < V; i++){
                System.out.print(i + " --> ");
                // Iterating over one row!
                for(int node: adjList[i]){
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
