public class Main {
    public static void main(String[] args) throws Exception {
        
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("B", "A");
        graph.addEdge("A", "C");
        graph.addEdge("C", "A");
        graph.addEdge("B", "D");
        graph.addEdge("D", "B");
        graph.addEdge("C", "D");
        graph.addEdge("D", "C");
        graph.addEdge("D", "E");
        graph.addEdge("E", "D");

        graph.print();
        System.out.println("\nBreadth First Traversal:\n");
        graph.breadthFirstSearch("E");
        System.out.println("\nDepth First Traversal:\n");
        graph.depthFirstSearch("E");

        


    }
}
