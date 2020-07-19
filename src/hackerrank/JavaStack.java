package hackerrank;

import java.util.Scanner;
import java.util.Stack;


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

            int[] area = new int[6];
            while (!stack.isEmpty()) {
                char pop = stack.pop();
                if ('{' == pop) {
                    area[0]++;
                } else if ('}' == pop) {
                    area[1]++;
                } else if ('(' == pop) {
                    area[2]++;
                } else if (')' == pop) {
                    area[3]++;
                } else if ('[' == pop) {
                    area[4]++;
                } else if (']' == pop) {
                    area[5]++;
                }
            }

            if(area[0] == 0 && area[1] > 0 || area[0] > 0 && area[1] == 0) {
                System.out.println(false);
            } else if(area[2] == 0 && area[3] > 0 || area[2] > 0 && area[3] == 0) {
                System.out.println(false);
            } else if(area[4] == 0 && area[5] > 0 || area[4] > 0 && area[5] == 0) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        }
    }
}
