public class InsertionSort {

  // O(n^2)... but prefereable to bubble sort and selection sort

  private static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;

      while(j >= 0 && array[j] > temp) {
        array[j + 1] = array [j];
        j--;
      }
      array[j + 1] = temp;
    }
  }

  public static void main(String[] args) {
    int[] array = {1, 9, 3, 5, 8, 4, 6, 2, 7};
    insertionSort(array);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
