package queue1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoQueue {
  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();  //Deque
    // First In First Out;
    queue.add("Hello");
    queue.add("World");

    System.out.println(queue.peek()); // Hello
    System.out.println(queue.poll()); // Hello
    System.out.println(queue.poll()); // World 抽取哂
    System.out.println(queue.size()); // 0

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def")); // true
    System.out.println(queue.poll());
    System.out.println(queue.poll());

    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.offer("abc")); // add()
    System.out.println(queue.offer("ijk")); //
    System.out.println(queue.size()); // 2

    if (queue.contains("ijk")) // true
      queue.remove("ijk"); // first occurance

    // for (String str : queue)
    // System.out.println(queue.poll());


    // PriorityQueue<String> backup = queue;

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
    // System.out.println(backup.size());




    LinkedList<Integer> nums = new LinkedList<>();
    nums.add(10);
    nums.add(10);
    nums.add(9);
    nums.add(0);
    nums.add(-3);
    nums.add(100);

    // while (!nums.isEmpty()) {
    // System.out.println(nums.poll());
    // }

    System.out.println(nums.size());

    int countEven = 0;
    int element = 0;
    int size = nums.size();
    int i = 0;
    while (i++ < size) { // 0,1,2,3,4,5
      element = nums.poll();
      if (element % 2 == 0 && ++countEven == 2) {
        continue;
      }
      nums.add(element);

    }
    System.out.println(nums);


    // for (int i = 0; i < size; i++) {
    // element = nums.poll();
    // if (element % 2 == 0 && ++countEven == 2) {
    // continue;
    // }
    // nums.add(element);
    // }

    // System.out.println(nums);


  }
}
