package leetcode;

/**
 * <a>https://leetcode.com/problems/to-lower-case/</a>
 */
public class _709 {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for(int i = 0 ; i < a.length; i++)
            if(a[i] >= 'A' && a[i] <='Z')
                a[i] = (char) (a[i] - 'A' + 'a');
            return new String(a);
    }

    public static void main(String[] args) {
        _709 a = new _709();
        a.toLowerCase("TEST");
    }
}
