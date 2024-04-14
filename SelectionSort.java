public class SelectionSort {

  // O(n^2)
  // search through array and keep track of min value during each iteration. At the end of each
  // iteration, we swap variables (push min to front).

  private static void selectionSort(int[] array) {

    int temp;
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) { // descending: >
          minIndex = j;
        }
      }
      temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }

  public static void main(String[] args) {
    int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    selectionSort(array);
    for (int i : array) {
      System.out.print(i);
    }
  }
}
