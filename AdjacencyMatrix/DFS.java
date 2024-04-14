package AdjacencyMatrix;
public class DFS {
  // depth-first search
  // used for traversing tree of graph data structure

  // 1. pick a route
  // 2. keep on going until you reach a dead end, or a previously visited node
  // 3. backtrack to last node that has unvisited adjacent neighbours

  // (can use a stack to keep track of this. if step 2 occurs, delete off the stack until you get to
  // smth with an unexplored adjacent node). or use recursion on call stack

  // concept can be used to traverse a maze...

  public static void main(String[] args) {
  
    Graph graph = new Graph(5);
  
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
  
    graph.addEdge(0,1); 
    graph.addEdge(1,2); 
    graph.addEdge(1,4); 
    graph.addEdge(2,3);
    graph.addEdge(2,4);
    graph.addEdge(4,0); 
    graph.addEdge(4,2); 
  
    graph.print();
  
    graph.depthFirstSearch(3); // directed graph hence if we start at D, we're stuck at D


  }
}
