public class QuickSort {
  // also recursive, but unlike mergeSort, we are not creating new arrays to store things. We are
  // sorting in place using i and j.
  // moves smaller elements to the left of the pivot. recursviely divide array in 2 partitions.
  // best and average case: O(nlogn)
  // worst case: O(n^2) if already sorted
  // space complexity: O(logn) (logarithmic space, even though sorting in place. we are adding
  // frames to the call stack (hence more memory))

  public static void main(String[] args) {
    int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

    quickSort(array, 0, array.length - 1);

    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  private static void quickSort(int[] array, int start, int end) {
    if (end <= start) { // base case
      return;
    }

    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1); // section to left of pivot
    // pivot itself is already in place
    quickSort(array, pivot + 1, end); // section to right of pivot
  }

  private static int partition(int[] array, int start, int end) {
    int pivot = array[end]; // choose end value as pivot each time
    int i = start - 1;
    for (int j = start; j <= end - 1; j++) {
      if (array[j] < pivot) {
        i++;
        // variable swap between values at i and j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    // finally, lay the pivot to rest
    i++; // put it in index i + 1
    // basic var swap once again
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i; // location of pivot
  }
}
