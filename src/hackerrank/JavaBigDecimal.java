package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        String tmp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                BigDecimal a = new BigDecimal(s[j - 1]);
                BigDecimal b = new BigDecimal(s[j]);
                if (a.compareTo(b) == -1) {
                    tmp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] = tmp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
