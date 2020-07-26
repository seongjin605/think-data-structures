package ci.chapter01;

public class _1_2 {

//    public static boolean isPermutation(String str) {
//        if (str == null || "".equals(str) || str.length() > 2) throw new IllegalArgumentException();
//        boolean isPossible = false;
//
//        int first = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0) first = str.charAt(i);
//            else isPossible = ++first == str.charAt(str.length() - 1) ? true : false;
//        }
//
//        return isPossible;
//    }


    /**
     * 1.
     * 만일 두 문자열이 서로 순열 관계라면, 이 둘은 같은 문자로 거성된 순서만 다를 것이다.
     * 어떤 면에서는 최적의 솔루션은 아니다. 하지만 깔끔하고 단순한하며 이해하기 쉽다는 측면이고
     * 효율성을 따지면 아래의 풀이법으로 접근하자.
     *
     * @param s
     * @return
     */
//    public static String sort(String s) {
//        char[] content = s.toCharArray();
//        Arrays.sort(content);
//        return new String(content);
//    }
//
//    public static boolean permutation(String s, String t) {
//        if(s.length() != t.length()) {
//            return false;
//        }
//        return sort(s).equals(sort(t));
//    }

    // ------------------------------------------------------------------------
    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(permutation("ba", "ab"));
    }
}
