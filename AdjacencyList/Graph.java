package AdjacencyList;

import java.util.*;

public class Graph {
  ArrayList<LinkedList<Node>> alist;

  Graph() {
    alist = new ArrayList<>();


  }

  public void addNode(Node node) {
    LinkedList<Node> currentList = new LinkedList<>();
    currentList.add(node); // head of LinkedList
    alist.add(currentList);
  }

  public void addEdge(int src, int dst) {// source and destination
    LinkedList<Node> srcList = alist.get(src);
    Node dstNode = alist.get(dst).get(0); // get(0) for head of linked list
    srcList.add(dstNode);
  }

  public boolean checkEdge(int src, int dst) {
    LinkedList<Node> srcList = alist.get(src);
    Node dstNode = alist.get(dst).get(0); // get(0) for head of linked list
    for(Node node: srcList) {
      if(node == dstNode) { // check for same address
        return true;
      }
    }
    return false;
  }

  public void print(){
    for (LinkedList<Node> currentList : alist) {
      for (Node node : currentList) {
        System.out.print(node.data + " -> ");
      }
      System.out.println();
    }
  }

}
