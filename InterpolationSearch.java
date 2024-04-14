public class InterpolationSearch {
  public static void main(String[] args) {
    // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int index = interpolationSearch(array, 8);

    int[] notUniformArray = {1,2,4,8,16,32,64,128,256,512,1024};
    int index = interpolationSearch(notUniformArray, 256);

    if (index == 1) {
      System.out.println("Value not found");
    } else {
      System.out.println("Value found at index: " + index);
    }

  }

  private static int interpolationSearch(int[] array, int value) {
    int high = array.length - 1;
    int low = 0;
    while (value >= array[low]
        && value <= array[high]
        && low <= high) { // while value is within search area, keep probing

          int probe = low + (high - low) * (value - array[low])/(array[high] - array[low]);
          System.out.println("Probe/guess: " + probe);

        if (array[probe] == value) {
          return probe;

        } else if (array[probe] < value) {
          low = probe + 1;
        } else {
          high = probe - 1;
        }
    }
    return -1;
  }
}
