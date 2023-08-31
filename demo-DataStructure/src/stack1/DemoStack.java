package stack1;

import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // First In Last Out
    Stack<String> stack1 = new Stack<>();
    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.pop()); // def
    stack1.add("we");
    System.out.println("peek" + stack1.peek()); // we
    stack1.push("syx");
    stack1.push("abc");

    while (!stack1.isEmpty()) {
      System.out.print(stack1.pop() + " "); // abc, syz, we, abc
    }

    System.out.println();
    // stack
    stack1.add("@ _ @||");
    stack1.push("XDD");
    stack1.add("@ v @ ");
    System.out.println(stack1.pop());
    System.out.println(stack1.toString());


  }

}
