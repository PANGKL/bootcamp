package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Every close bracket has a corresponding open bracket of the same type.
 * 
 * 
 * Example 1: Input: s = "()" Output: true
 * 
 * Example 2: Input: s = "()[]{}" Output: true
 * 
 * Example 3: Input: s = "(]" Output: false
 */

import java.util.Stack;

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true
    System.out.println(isValid("([)]"));// true

  }

  public static boolean isValid(String s) {
    // List<Character> arr = new ArrayList<>();
    // for (int i = 0; i < s.length(); i++) {
    // if (s.charAt(i) == '}')
    // arr.add('{');
    // else if (s.charAt(i) == ']')
    // arr.add('[');
    // else if (s.charAt(i) == ')')
    // arr.add('(');
    // else {
    // arr.add(s.charAt(i));
    // }
    // }
    // int a = 0;
    // int b = 0;
    // int c = 0;
    // for (char ch : arr) {
    // if (ch == '(')
    // a++;
    // else if (ch == '[')
    // b++;
    // else if (ch == '{')
    // c++;
    // }
    // if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0)
    // return false;

    // return true;

    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }

    return stack.isEmpty();
  }

}
