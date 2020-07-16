package hackerrank;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/java-string-tokens/problem</a>
 *
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */
// [A-Za-z !,?._'@]
// He is a very very good boy, isn't he?
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if("".equals(s) || s == null || s.length() > 4 * Math.pow(10, 4))
            throw new IllegalArgumentException();

        String[] result = s.split("[ !,?._'@]+");

        System.out.println(result.length);
        for(String r : result) {
            System.out.println(r);
        }

        scan.close();
    }
}
