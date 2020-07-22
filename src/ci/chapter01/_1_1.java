package ci.chapter01;

/**
 * 중복체크
 * 문자열에 같은 문자가 중복되어 등작하는지 확인(추가 자료구조 없이 풀이)
 */
public class _1_1 {

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0 ; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
//        if(str == null || "".equals(str)) throw new IllegalArgumentException();
//
//        int[] arr = new int[128];
//        for(int i = 0 ; i < str.length(); i++) {
//            arr[str.charAt(i)]++;
//        }
//        for(int data: arr) if(data > 1) return false;
//
//        return true;
    }
    public static void main(String[] args) {
        System.out.println(isUniqueChars("apple"));
    }
}
