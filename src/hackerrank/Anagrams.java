package hackerrank;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 26; i++)
            if (c[i] != d[i]) return false;
        return true;

//        char[] arr = a.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString().toCharArray();
//        char[] arr2 = b.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString().toCharArray();
//
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//                if(arr[i] == arr2[i]) count++;
//        }
//        return count == arr.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
