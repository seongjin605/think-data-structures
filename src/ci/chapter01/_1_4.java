package ci.chapter01;

public class _1_4 {

    /**
     * 회문 순열
     * @param s
     * @return
     */
    static boolean isPalindrom(String s) {
        if (s == null || "".equals(s)) throw new IllegalArgumentException();

        s = s.replaceAll(" ", "").toLowerCase();

        char[] contents = s.toCharArray();

        int length = contents.length / 2;
        for (int i = 0; i < length; i++) {
            if (contents[i] != contents[contents.length - 1 - i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("Taco cat"));
    }
}
