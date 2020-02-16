package hackerrank;

import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/java-loops/problem</a>
 *
 * @input 2
 * 0 2 10
 * 5 3 5ㅡ
 * @ouput 2 6 14 30 62 126 254 510 1022 2046
 */
public class JavaLoops2 {
    public static void solve(int a, int b, int n) {
        int[] data = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                data[0] = a + i * b; // 5 + 0 * 3 = 5
            } else {
                data[i] = data[i - 1] + (int) Math.pow(2, i - 1) * b;
                System.out.print(data[i] + " ");
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            solve(a, b, n);
        }
        in.close();
    }
}
