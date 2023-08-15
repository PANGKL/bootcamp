package queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
    System.out.println(strings.pollFirst()); // ijjk pollFirst() == poll()
    System.out.println(strings.pollLast()); // xyz


    Deque<String> deque = new LinkedList<>();
    Queue<String> queue = new LinkedList<>();
    // ??分別

    queue.add("abc");
    deque.add("abc");
    deque.addFirst("abc");
    deque.addLast("abc");


    run1(new LinkedList<>()); // linkedlist
    run1(new ArrayDeque<>()); // array
    // run1(new PriorityQueue()); // compile-error
    run1(deque);


    run2(new LinkedList<>()); // linkedlist
    run2(new ArrayDeque<>()); // array
    run2(new PriorityQueue<>());

    Collection<String> arraylist = new ArrayList<>();


    List<String> strr = new LinkedList<>(); // hide deque methods
    



  }

  public static void run1(Deque<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ss");
  }

  public static void run2(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }

}
