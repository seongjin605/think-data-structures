package ci.chapter01;

public class _1_6 {

    /**
     * INPUT: aabcccaaa
     * OUTPUT: a2b1c3a3
     */
//    static String compression(String s) {
//        if (s == null || "".equals(s)) throw new IllegalArgumentException();
//
//        String compressedString = "";
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            count++;
//            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
//                compressedString += "" + s.charAt(i) + count;
//                count = 0;
//            }
//        }
//        return compressedString.length() < s.length() ? compressedString : s;
//    }

//    static String compression(String s) {
//        if (s == null || "".equals(s)) throw new IllegalArgumentException();
//
//        StringBuilder compressed = new StringBuilder();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            count++;
//            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
//                compressed.append(s.charAt(i));
//                compressed.append(count);
//                count = 0;
//            }
//        }
//        return compressed.length() < s.length() ? compressed.toString() : s;
//    }
    static String compression(String s) {
        int finalLength = countCompression(s);
        if (finalLength >= s.length()) return s;

        StringBuilder compressed = new StringBuilder(finalLength);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.toString();
    }

    static int countCompression(String s) {
        int compressionLength = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressionLength += 1 + count;
                count = 0;
            }
        }
        return compressionLength;
    }

    public static void main(String[] args) {
        System.out.println(compression("aabcccaaa"));
    }
}
