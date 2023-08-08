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
    System.out.println(stack1.peek());
    stack1.push("syx");
    stack1.push("abc");

    while (!stack1.isEmpty()) {
      System.out.println(stack1.pop()); // abc2, xyz, we, abc
    }
    // stack
    stack1.add("@ _ @||");
    stack1.push("XDD");
    stack1.add("@ v @ ");
    System.out.println(stack1.pop());


  }

}
