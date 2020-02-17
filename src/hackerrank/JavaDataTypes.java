package hackerrank;

import java.util.Scanner;

/**
 * @input 5
 * -150
 * 150000
 * 1500000000
 * 213333333333333333333333333333333333
 * -100000000000000
 *
 * problem link: <a>https://www.hackerrank.com/challenges/java-datatypes/problem</a>
 * solved link <a>https://www.hackerrank.com/rest/contests/master/challenges/java-datatypes/hackers/qkrtjdwls605/download_solution</a>
 */
public class JavaDataTypes {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) System.out.println("* short"); // -32768 ~ 32767
                if (x >= -2147483648 && x <= 2147483647) System.out.println("* int");// -2147483648 ~ 2147483647
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");//-9223372036854775808 ~ 9223372036854775807
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
