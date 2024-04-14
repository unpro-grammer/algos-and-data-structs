import java.util.*;

public class LinkedVsArray{
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 1000000; i++) {
      linkedList.add(i);
      arrayList.add(i);
    }

    //LinkedList
    startTime = System.nanoTime();

    //do sumn
    linkedList.remove(999990);

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;

    System.out.println("LinkedList:\t" + elapsedTime + " ns");


    //ArrayList
    startTime = System.nanoTime();

    //do sumn
    arrayList.remove(999990);

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;

    System.out.println("ArrayList:\t" + elapsedTime + " ns");

  }
}