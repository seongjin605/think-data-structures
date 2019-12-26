package leetcode;

public class ReverseString {
    /**
     * Input: ['H','a','n','n','a','h']
     * Output: ['h','a','n','n','a','H']
     * @param s
     */
    public static void reverseString(char[] s) {
        char[] t = new char[s.length];
        for(int i = 0; i < s.length; i++) {
            t[i] = s[i--];
        }
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
    }
}
