import java.util.*;

public class LinkedLists{
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F");
    // linkedList.poll();

    linkedList.add(4, "E");
    linkedList.remove("E");
    System.out.println(linkedList.indexOf("F"));
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    linkedList.addFirst("0");
    linkedList.addLast("G");
    String first = linkedList.removeFirst();
    System.out.println(first);
    String last = linkedList.removeLast();
    System.out.println(last);


    System.out.println(linkedList);




  }
}