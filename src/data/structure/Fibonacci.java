package data.structure;

public class Fibonacci {
//    static int fibonacci(int i) {
//        if (i == 0) return 0;
//        if (i == 1) return 1;
//        return fibonacci(i - 1) + fibonacci(i - 2);
//    }

    /**
     * 하향식 동적계획법(메모제이션)
     * @param n
     * @return
     */
//    static int fibonacci(int n) {
//        return fibonacci(n, new int[n + 1]);
//    }
//
//    static int fibonacci(int i, int[] memo) {
//        if (i == 0 || i == 1) return i;
//        if (memo[i] == 0) {
//            memo[i] = fibonacci(i - 1, memo)
//                    + fibonacci(i - 2, memo);
//        }
//        return memo[i];
//    }
    // --------------------------------------------------------------------------------

    static int fibonacci(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2 ; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i -2];
        }
        return memo[n - 1] + memo[n -2];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
}
