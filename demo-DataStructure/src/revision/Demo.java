package revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // ArrayDeque & LinkedList
    Deque<String> arrayDeque = new ArrayDeque<>(); // array
    arrayDeque.addFirst("a");
    arrayDeque.addFirst("d");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();

    Deque<String> linkedList = new LinkedList<>(); // linked list
    linkedList.addFirst("a");
    linkedList.addFirst("d");
    linkedList.pollFirst();
    linkedList.pollLast();

    Queue<String> arryQueue = new ArrayDeque<>(); // array
    arryQueue.add("a");
    arryQueue.poll();

    Queue<String> linkQueue = new LinkedList<>(); // linked list
    linkQueue.add("a");
    linkQueue.poll();
    linkQueue.remove();


    Queue<String> pQueue = new PriorityQueue<>(); // array
    pQueue.add("a");
    pQueue.poll();


    List<Integer> arrayList = new ArrayList<>(); // array
    List<Integer> linkedlist = new LinkedList<>();
    linkedlist.add(3);
    linkedlist.remove(3);

    arrayList.add(3);
    arrayList.remove(3);

    List<String> stack = new Stack<>();
    stack.add("abc");
    stack.remove(0);

    Vector<String> stack2 = new Stack<>();
    stack2.add("abc");
    stack2.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("sdd");
    stack3.pop();



  }

}
