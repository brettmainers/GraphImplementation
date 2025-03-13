import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    HashMap<String, ArrayList<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        if (!adjList.containsKey(vertex)) {
            ArrayList<String> list = new ArrayList<>();
            adjList.put(vertex, list);
        }
    }

    public void addEdge(String source, String destination) {
        if (adjList.containsKey(source)) {
            adjList.get(source).add(destination); 
        }
    }

    public void print() {
        for (String keys : adjList.keySet()) {
            System.out.print(keys + ": ");
            for (String string : adjList.get(keys)) {
                System.out.print(string + " -> " );
            }
            System.out.println();
        }
    }
}
