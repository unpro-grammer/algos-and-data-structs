import java.util.LinkedList;
import java.util.Queue;

public class Queues{
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();

    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    // System.out.println(queue.peek());

    queue.poll();

    System.out.println(queue);
    System.out.println(queue.contains("Harold"));
  }
}