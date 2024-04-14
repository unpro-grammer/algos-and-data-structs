package AdjacencyMatrix;

public class AdjacencyMatrix {
  // 2D array to store 1/0's to represent edges
  // nrows = ncols = number of unqiue nodes

  // runtime complexity to check an edge: O(1)
  // space complexity: O(n^2)
  // in this case we're making a DIRECTED GRAPH

  public static void main(String[] args) {

    Graph graph = new Graph(5);

    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));

    graph.addEdge(0, 1); // A -> B
    graph.addEdge(1, 2); // B -> C
    graph.addEdge(2, 3); // C -> D
    graph.addEdge(2, 4); // C -> E
    graph.addEdge(4, 0); // E -> A
    graph.addEdge(4, 2); // E -> C

    graph.print();

    System.out.println(graph.checkEdge(3, 2));
  }
}
