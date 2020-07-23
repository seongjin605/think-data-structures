package ci.chapter01;

public class _1_2 {

    public static boolean isPermutation(String str) {
        if (str == null || "".equals(str) || str.length() > 2) throw new IllegalArgumentException();
        boolean isPossible = false;

        int first = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) first = str.charAt(i);
            else isPossible = ++first == str.charAt(str.length() - 1) ? true : false;
        }

        return isPossible;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("ba"));
    }
}
