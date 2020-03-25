package leetcode;

import java.util.Stack;

/**
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */
public class Num1281 {
    public int subtractProductAndSum(int n) {
        String numToStr = Integer.toString(n);
        Stack stack = new Stack();

        for(char c : numToStr.toCharArray()) {
            stack.push(Character.getNumericValue(c));
        }

        int multipleResult = 1;
        int sumResult = 0;
        while(!stack.isEmpty()) {
            int num = (int)stack.pop();
            multipleResult *= num;
            sumResult += num;
        }

        return multipleResult - sumResult;
    }
    public static void main(String[] args) {
     Num1281 a = new Num1281();
        System.out.println(a.subtractProductAndSum(234));
    }
}
