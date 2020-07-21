package hackerrank;

import java.util.Scanner;

/**
 * @input 4
 * 5 3
 * 0 0 0 0 0
 * 6 5
 * 0 0 0 1 1 1
 * 6 3
 * 0 0 1 1 1 0
 * 3 1
 * 0 1 0
 * @output YES
 * YES
 * NO
 * NO
 */
public class MoveGame {
    public static boolean canWin(int leap, int[] game) {
        if (leap < 0 || leap > 100) throw new IllegalArgumentException();

        int result = 0;
        for (int i = game.length - 1; i > 0; i--) {
            if (game[i] == 1)
                result += (int) Math.pow(2, game.length - 1 - i);
        }
        return leap > result ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        if (q < 1 || q > 5000) throw new IllegalArgumentException();

        while (q-- > 0) {
            int n = scan.nextInt();

            if (n < 2 || n > 100) throw new IllegalArgumentException();

            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
