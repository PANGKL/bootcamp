package queue1;

import java.util.ArrayDeque;

public class DemoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll()); // abc
    System.out.println(strings.size()); // 2
    strings.addLast("xyz"); // addlast() == add()
    System.out.println(strings.poll());// def
    strings.addFirst("ijjk");// head
    System.out.println(strings.peek()); // ijjk
    System.out.println(strings.pollFirst()); // pollFirst() == poll()
    System.out.println(strings.pollLast()); // xyz



  }

}
