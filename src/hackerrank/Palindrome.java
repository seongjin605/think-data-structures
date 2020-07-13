package hackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // System.out.println(A.equals(new StringBuffer(A).reverse().toString()) ? "Yes" : "No");
        int count = 0;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) == A.charAt(A.length() - i - 1)) count++;
        }
        System.out.println(count > 0 ? "Yes" : "No");
    }
}
