public class TwoLowerCase {
    /**
     * <a>https://leetcode.com/problems/to-lower-case/</a>
     * Input: "Hello"
     * Output: "hello"
     * @param str
     * @return
     */
    public static String toLowerCase(String str) {
        if(str.equals("") || str == null) throw new IllegalArgumentException("유효하지않은 인자값.");
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        String result = toLowerCase("HELLO");
        System.out.println(result);
    }
}
