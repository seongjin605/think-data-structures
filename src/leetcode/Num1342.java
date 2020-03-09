package leetcode;


/**
 * <a>https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/</a>
 * <p>
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 */
public class Num1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        int obtain = num;
        while (obtain > 0) {
            if (obtain % 2 == 0) {
                obtain = obtain / 2;
            } else {
                obtain--;
            }
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Num1342 a = new Num1342();
        int count = a.numberOfSteps(14);
        System.out.println("count:" + count);
    }
}
