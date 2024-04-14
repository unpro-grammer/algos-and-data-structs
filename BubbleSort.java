public class BubbleSort {
  // O(n^2) complexity (runs in quadratic time)

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        // essentially the *current* biggest num that's not already in its rightful place will get
        // shuffled up each iteration, if it exists
        if (array[j] > array[j + 1]) { // for descending, <
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {

    int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    bubbleSort(array);

    for (int i : array) {
      System.out.print(i);
    }
  }
}
