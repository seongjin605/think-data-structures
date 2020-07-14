package hackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // sdfsdfsdff
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) == A.charAt(A.length() - i - 1)) count++;
        }
        System.out.println(count == A.length() / 2 ? "Yes" : "No");
    }
}
