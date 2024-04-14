import java.util.Stack;

public class Stacks{
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();


    stack.push("Minecraft");
    stack.push("Skyrim");
    stack.push("DOOM");
    stack.push("Borderlands");
    stack.push("FFVII");

    // String myGame = stack.pop();
    System.out.println(stack.search("FFVII"));
    System.out.println(stack);
    
    // System.out.println(myGame);


    
  }
}