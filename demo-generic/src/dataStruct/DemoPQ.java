package dataStruct;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(queue.poll()); // abc


    // Priority: Custom Priority by Comparator
    Queue<String> cs = new PriorityQueue<>(new SortByDescending()); // 咬死用呢個原則
    cs.add("bcd");
    cs.add("abc");
    cs.add("def");
    

    System.out.println(cs.poll()); // def
  }

}
