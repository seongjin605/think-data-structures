package hackerrank;

import java.util.Scanner;

/**
 *
 * <a>https://www.hackerrank.com/rest/contests/master/challenges/java-if-else/hackers/qkrtjdwls605/download_solution</a>
 * If  is odd, print Weird
 * If  is even and in the inclusive range of  2 to 5 , print Not Weird
 * If  is even and in the inclusive range of  6 to 20 , print Weird
 * If  is even and greater than , print Not Weird
 */
public class SimpleCondition {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        validateRangeOfNumber(N);

        scanner.close();
    }

    public static void validateRangeOfNumber(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Weird");
        } else if (number >= 2 && number <= 5 && number % 2 == 0) {
            System.out.println("Not Weird");
        } else if (number >= 6 && number <= 20 && number % 2 == 0) {
            System.out.println("Weird");
        } else if (number % 2 == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
