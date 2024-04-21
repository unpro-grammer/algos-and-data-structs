package BinarySearchTree;

public class BinarySearchTree {
  Node root;

  public void insert(Node node) {
    root = insertHelper(root, node);
  }

  private Node insertHelper(Node root, Node node) {
    int data = node.data;

    //recursion
    if (root == null) { // base case
      root = node;
      return root;
    } else if (data < root.data) {
      root.left = insertHelper(root.left, node); // examining child of prev "root" node
    } else {
      root.right = insertHelper(root.right, node);
    }


    return root;
  }

  public void display() {
    displayHelper(root);
  }

  private void displayHelper(Node root) {
    if (root != null) {
      displayHelper(root.left); // starts from smallest value
      System.out.println(root.data);
      displayHelper(root.right);
    }
  }

  public boolean search(int data) {
    return false;
  }

  private boolean searchHelper(Node root, int data) {
    return false;
  }

  public void remove(int data) {}

  private Node removeHelper() {
    return null;
  }

  private int successor(Node root) {
    return 0;
  }

  private int predecessor(Node root) {
    return 0;
  }
}
