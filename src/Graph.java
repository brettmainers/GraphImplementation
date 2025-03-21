import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {

    HashMap<String, ArrayList<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        if (!adjList.containsKey(vertex)) {
            ArrayList<String> list = new ArrayList<>();
            adjList.put(vertex, list);
        } else {
            System.out.println("Vertex already exists");
        }
    }

    public void addEdge(String source, String destination) {
        if (adjList.containsKey(source)) {
            adjList.get(source).add(destination); 
        } else {
            System.out.println("Source vertex does not exist");
        }
    }

    public void print() {
        for (String key : adjList.keySet()) {
            System.out.print(key + ": ");
            for (String value : adjList.get(key)) {
                System.out.print(value + " -> " );
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(String source) {
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.println(source + " = visited");
            for (int i = 0; i < adjList.get(source).size(); i++) {
               if (!visited.contains(adjList.get(source).get(i))) 
                queue.offer(adjList.get(source).get(i));
                visited.add(adjList.get(source).get(i));
            }
        }
    }

    public void depthFirstSearch(String source) {
        HashSet<String> visited = new HashSet<>();
        dFSHelper(source, visited);
    }
    // recursive helper method to perform DFS
    public void dFSHelper(String source, HashSet<String> visited) {
        if (visited.contains(source)) {
            return;
        } else {
            visited.add(source);
            System.out.println(source + " = visited");
        }

        for (int i = 0; i < adjList.get(source).size(); i++) {
                dFSHelper(adjList.get(source).get(i), visited);
        }
    }
}
