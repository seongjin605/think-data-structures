package leetcode;


public class _1304 {
    public static int[] sumZero(int n) {
        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] =  i * 2 - n + 1;
        }
        return arrays;
    }

    public static void main(String[] args) {
        _1304 a = new _1304();
        a.sumZero(5);
    }
}
