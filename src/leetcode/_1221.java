package leetcode;

/**
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 *
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
public class _1221 {
    public int balancedStringSplit(String s) {
        int count = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            r += s.charAt(i) == 'L' ? 1 : -1;
            if (r == 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _1221 a = new _1221();
        String s = "RLRRLLRLRL";
        a.balancedStringSplit(s);
    }
}
