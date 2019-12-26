package leetcode;

public class RemoveOuterParentheses {
    /**
     * Input: "(()())(())"
     * Output: "()()()"
     *
     * @param S
     * @return
     */
    public static String removeOuterParentheses(String S) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (char c : S.toCharArray()) {
            if(c == '(') {
                System.out.println(count);
                ++count;
                System.out.println(count);
            }
            System.out.println(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        String result = removeOuterParentheses(str);
        System.out.println(result);
    }
}
