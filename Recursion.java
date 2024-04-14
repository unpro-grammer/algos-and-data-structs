public class Recursion {
  // when a thing is defined in terms of itself
  // (apply the result of a procedure to the procedure)
  // pros: easier to write and debug
  // cons: sometimes slower. uses more memory
  public static void main(String[] args) {
    walk(5);
    System.out.println(factorial(7));
    System.out.println(power(2, 8));
  }

  private static int power(int base, int exp) {
    if (exp < 1) {
      return 1;
    }
    return base * power(base, exp - 1);
  }

  private static int factorial(int num) {
    if (num < 1) { // base case
      return 1;
    }
    return num * factorial(num - 1); // recursive case
  }

  private static void walk(int steps) {
    if (steps < 1) { // base case
      // what you do if you want to stop
      return;
    } // else recursive case
    // what you want to do if you want to continue
    System.out.println("You take a step!");
    walk(steps - 1);

    // iterative version...
    // for (int i = 0; i < steps; i++) {
    //   System.out.println("You take a step!");
    // }
  }
}
