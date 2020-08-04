package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * ({}[])
 * (({()})))
 * ({(){}()})()({(){}()})(){()}
 * {}()))(()()({}}{}
 * }}}}
 * ))))
 * {{{
 * (((
 * []{}(){()}((())){{{}}}{()()}{{}{}}
 * [[]][][]
 * }{
 */
public class JavaStack {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            if (input == null || "".equals(input)) throw new IllegalArgumentException();

            char[] c = input.toCharArray();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < c.length; i++) {
                stack.push(c[i]);
            }

            Deque<Character> deque = new ArrayDeque<>(input.length());

            boolean result = true;
            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty()) {
                    Character data = stack.pop();
                    if (input.charAt(i) == '(' && data == ')') {
                        deque.add(data);
                    } else if (input.charAt(i) == '[' && data == ']') {
                        deque.add(data);
                    } else if (input.charAt(i) == '{' && data == '}') {
                        deque.add(data);
                    } else {
                        deque.add(data);
                        if (!deque.isEmpty() && deque.size() == input.length()) {
                            Character first = deque.pollFirst();
                            Character second = deque.pollFirst();
                            result = first == ')' && second == '(' || first == ']' && second == '[' || first == '}' && second == '{' ||
                                    first == ')' && data == '(' || first == ']' && data == '[' || first == '}' && data == '{';
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
