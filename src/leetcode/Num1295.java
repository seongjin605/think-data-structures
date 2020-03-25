package leetcode;

/**
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 */
public class Num1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String digit = Integer.toString(num / 10);
            if (!digit.equals("0") && digit.length() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Num1295 a = new Num1295();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(a.findNumbers(nums));
    }
}
