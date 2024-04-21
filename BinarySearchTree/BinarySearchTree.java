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
      displayHelper(root.left); // starts from smallest value. swap left and right for non-increasing order
      System.out.println(root.data);
      displayHelper(root.right);
    }
  }

  public boolean search(int data) {
    return searchHelper(root, data);
  }

  private boolean searchHelper(Node root, int data) {
    if (root == null) {
      return false;
    } else if (root.data == data) {
      return true;
    } else if (root.data > data) {
      return searchHelper(root.left, data); // search lower
    } else {
      return searchHelper(root.right, data); // search higher
    }
  }

  public void remove(int data) {
    if (search(data)) {
      removeHelper(root, data);
    } else {
      System.out.println(data + " could not be found.");
    }
  }

  private Node removeHelper(Node root, int data) {
    if (root == null) {
      return root; // base case
    } else if (data < root.data) {
      root.left = removeHelper(root.left, data);
    } else if (data > root.data) {
      root.right = removeHelper(root.right, data);
    } else { // found the node
    
      if (root.left == null && root.right == null) { // leaf node
        root = null;
      // otherwise, that node has child nodes
      } else if (root.right != null) { // need to replace the node with a successor (from the right)
        root.data = successor(root);
        root.right = removeHelper(root.right, root.data);
      } else { // need to replace the node with a predecessor (from the left)
        root.data = predecessor(root);
        root.left = removeHelper(root.left, root.data);
      }
    
    }
    return root;
  }

  private int successor(Node root) { // find the least value below right child of root node
    root = root.right; // go right
    while (root.left != null) { // then go as far left as possible
      root = root.left;
    }
    return root.data;
  }

  private int predecessor(Node root) {
    root = root.left; // go left
    while (root.right != null) { // then go as far right as possible
      root = root.right;
    }
    return root.data;
  }
}
