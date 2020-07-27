package ci.chapter01;

public class _1_6 {

    /**
     * INPUT: aabcccaaa
     * OUTPUT: a2b1c3a3
     *
     * @param s
     * @return
     */
    static String compression(String s) {
        if (s == null || "".equals(s)) throw new IllegalArgumentException();

        char[] contents = s.toCharArray();
//        for(int i = 0; i < contents.length; i++) {
//            contents[i] =
//        }

        int count = 0;
        for (int i = 0; i < contents.length; i++) {
            if (contents[0] == contents[i + 1]) count++;
            else if(contents[i] == contents[i + 1]);
        }
        return null;
    }

    public static void main(String[] args) {
        compression("aabcccaaa");
    }
}
