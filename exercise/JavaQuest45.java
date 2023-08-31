package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));



  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {


    Stack<Character> stack1 = new Stack<>();
    Stack<Character> stack2 = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!stack1.isEmpty() && c == '#')
        stack1.pop();
      if (c != '#') {
        stack1.push(c);
      }
    }

    for (int i = 0; i < t.length(); i++) {
      char d = t.charAt(i);
      if (!stack2.isEmpty() && d == '#')
        stack2.pop();
      if (d != '#') {
        stack2.push(d);

      }
    }

    // String s="";

    return stack1.equals(stack2);

  }
}


