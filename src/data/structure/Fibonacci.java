package data.structure;

public class Fibonacci {
//    static int fibonacci(int i) {
//        if (i == 0) return 0;
//        if (i == 1) return 1;
//        return fibonacci(i - 1) + fibonacci(i - 2);
//    }

    static int fibonacci(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    static int fibonacci(int i, int[] memo) {
        if (i == 0 || i == 1) return i;
        if (memo[i] == 0) {
            memo[i] = fibonacci(i - 1, memo)
                    + fibonacci(i - 2, memo);
        }
        return memo[i];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
