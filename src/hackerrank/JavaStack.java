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

            int firstLeft = 0;
            int firstRight = 0;

            int secondLeft = 0;
            int secondRight = 0;

            int thirdLeft = 0;
            int thirdRight = 0;

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
                        while (!deque.isEmpty() && deque.size() == input.length()) {
                            if (deque.removeFirstOccurrence('(')) {
                                firstLeft++;
                                continue;
                            } else if (deque.removeFirstOccurrence(')')) {
                                firstRight++;
                                continue;
                            } else if (deque.removeFirstOccurrence('[')) {
                                secondLeft++;
                                continue;
                            } else if (deque.removeFirstOccurrence(']')) {
                                secondRight++;
                                continue;
                            } else if (deque.removeFirstOccurrence('{')) {
                                thirdLeft++;
                                continue;
                            } else if (deque.removeFirstOccurrence('}')) {
                                thirdRight++;
                                continue;
                            }
                        }
                    }
                }
            }

            result = (firstLeft + firstRight) % 2 == 0 && (secondLeft + secondRight) % 2 == 0 && (thirdLeft + thirdRight) % 2 == 0;
            System.out.println(result);
        }
    }
}
