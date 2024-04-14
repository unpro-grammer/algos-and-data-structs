package AdjacencyMatrix;

public class BFS {
  // a search algo for traversing tree or graph data structure
  // this is done one "level" at a time, rather than one branch at a time
  
  //use queue instead of stack (like with dfs) because we want first in (starting) to be first out

  public static void main(String[] args) {
  
    Graph graph = new Graph(5);
  
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
  
    graph.addEdge(0,1); // A -> B
    graph.addEdge(1,2); // B -> C
    graph.addEdge(1,4); // B -> E
    graph.addEdge(2,3); // C -> D
    graph.addEdge(2,4); // C -> E
    graph.addEdge(4,0); // E -> A
    graph.addEdge(4,2); // E -> C
  
    graph.print();

    graph.breadthFirstSearch(4);
  }
}
