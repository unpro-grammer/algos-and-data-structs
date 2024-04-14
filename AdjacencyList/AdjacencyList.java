package AdjacencyList;

public class AdjacencyList {

  // An array/ArrayList made of LinkedLists.
  // Each LinkedList has a unique node at the head
  // All adjcaent neighbours to that node are added to that node's LinkedList

  // runtime complexity to check an edge: O(n)
  // space complexity: O(n + e) (nodes and edges count)
  public static void main(String[] args) {
    
    Graph graph = new Graph();

    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));

    graph.addEdge(0, 1); // A -> B
    graph.addEdge(1, 2); // B -> C
    graph.addEdge(1, 4); // B -> E
    graph.addEdge(2, 3); // C -> D
    graph.addEdge(2, 4); // C -> E
    graph.addEdge(4, 0); // E -> A
    graph.addEdge(4, 2); // E -> C

    graph.print();
  }
}
