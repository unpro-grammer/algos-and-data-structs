public class Runtime {
  public static void main(String[] args) {
    long start = System.nanoTime();

    // Program code

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //

    long duration =
        (System.nanoTime() - start) / 1000000; // divide nanoseconds by 1 million for milliseconds
    System.out.println("Duration: " + duration + "ms");
  }
}
