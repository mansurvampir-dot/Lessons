package Generic.task5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeSet;

public class Main {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char real = stack.pop();
                if ((c == ')' && real != '(') ||
                        (c == ']' && real != '[') ||
                        (c == '}' && real != '{')) {
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }
  public static void main(String[] args){
    String test = "({))";
    System.out.println(isValid(test));
    System.out.println(isValid("({[]})"));
    System.out.println(isValid(""));
    System.out.println(isValid("(a + b) + [c - d]"));
    System.out.println(isValid("[[{]}]"));
    }
}
