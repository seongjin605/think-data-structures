public class JewelsAndStones {
    /**
     * <a>https://leetcode.com/problems/jewels-and-stones/submissions/</a>
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] JResult = new char[J.length()];
        char[] SResult = new char[S.length()];
        for(int i = 0; i < JResult.length; i++) {
            JResult[i] = J.charAt(i);
            for(int j = 0; j < SResult.length; j++) {
                SResult[j] = S.charAt(j);
                if(JResult[i] == SResult[j]) count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        int count = numJewelsInStones(J, S);
        System.out.println("count="+count);
    }
}
