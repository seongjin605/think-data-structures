package leetcode;

/**
 * @problem
 * <a>https://leetcode.com/problems/maximum-69-number/submissions/</a>
 *
 * @result
 * <a>https://leetcode.com/submissions/detail/330956489/</a>
 *
 */
public class _1323 {
    public static int maximum69Number (int num) {
        String number = Integer.toString(num);
        char[] numArray = number.toCharArray();
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] == '6') {
                numArray[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(numArray));
    }
    public static void main(String[] args) {
        _1323 a = new _1323();

        int number = 9669;
        a.maximum69Number(number);
    }
}
