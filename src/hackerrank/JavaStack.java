package hackerrank;

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
 *
 * string의 문자열을 하나씩 인덱스를 돌리고, 처음에 스택이 비어있으면 스택에 하나씩 넣고
 * 요구조건에 부합하면 스택에 값을 하나씩 제거하고, 부합하지않으면 스택에 넣어서 다시 검증하는 방식으로 풀이
 */
public class JavaStack {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                                break;
                            }
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            }
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            }
                        default: {
                            stack.push(input.charAt(i));
                        }
                    }
                } else {
                    stack.push(input.charAt(i));
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}
