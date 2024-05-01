package graphRepresentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyListRepresentationUisngNode {
    static class Node{
        String name;
        ArrayList<String> nbrs;

        Node(String name){
            this.name = name;
            nbrs = new ArrayList<>();
        }
    }

    static class Graph {
        HashMap<String, Node> adjList;

        public Graph(ArrayList<String> cities) {
            adjList = new HashMap<>();
            for (String city : cities) {
                adjList.put(city, new Node(city));
            }
        }
        public void addEdge(String source, String destination,boolean isUndirected)
        {
            adjList.get(source).nbrs.add(destination);
            if(isUndirected){
                adjList.get(destination).nbrs.add(source);
            }
        }
        public void printAdjList(){
            for(Map.Entry<String, Node> cityPair: adjList.entrySet()){
                System.out.print(cityPair.getKey() + " --> ");
                for(String nbrs: cityPair.getValue().nbrs){
                    System.out.print(nbrs + ", ");
                }
                System.out.println();
            }
        }


    }
    public static void main(String[] args){

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("London");
        cities.add("Paris");
        cities.add( "New York");

        Graph g = new Graph(cities);
        g.addEdge("Delhi", "London" , true);
        g.addEdge("New York","London", true);
        g.addEdge("Delhi","Paris" , true);
        g.addEdge("Paris","New York" , true);

        g.printAdjList();

    }
}
