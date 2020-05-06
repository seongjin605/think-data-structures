package leetcode;


public class _0905 {
    public int[] sortArrayByParity(int[] A) {
        int lastEvenIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int tmp = A[lastEvenIndex];
                A[lastEvenIndex] = A[i];
                A[i] = tmp;
                lastEvenIndex++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        _0905 a = new _0905();
        int[] b = {3, 1, 2, 4};
        a.sortArrayByParity(b);
    }
}
