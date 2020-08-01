package ci.chapter01;

public class _1_9 {
    static boolean isSubString(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return isSubString(s1s1, s2);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubString("waterbottle", "erbottlewat"));
    }
}
