package leetcode;

public class JewelsAndStones {
    /**
     * <a>https://leetcode.com/problems/jewels-and-stones/submissions/</a>
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < J.length(); j++) {
                if(S.charAt(i) == J.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        JewelsAndStones jas = new JewelsAndStones();
        System.out.println(jas.numJewelsInStones("z", "ZZ"));
    }
}
