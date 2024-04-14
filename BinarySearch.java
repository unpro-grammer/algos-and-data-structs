public class BinarySearch{
  public static void main(String[] args) {
    int array[] = new int[1000000];
    int target = 777777;

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    // int index = Arrays.binarySearch(array, target);
    int index = binarySearch(array, target);

    if (index == -1) {
      System.out.println(target + " not found");
    } else {
      System.out.println("Element found at: " + index);
    }

  }

  private static int binarySearch(int[] array, int target) {
    
    int low = 0;
    int high = array.length - 1;

    while(low <= high) {
      int mid = (int)(low + (high  - low) / 2);
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        low = mid + 1;
      } else if (array[mid] > target) {
        high = mid - 1;
      } //target found
    }
    
    return -1; //target not found
  }
}