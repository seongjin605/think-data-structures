package ci.chapter01;

public class _1_7 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{0, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        System.out.println(solution.matrix(arr));
    }
}

class Solution {
    boolean matrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                // 왼쪽 -> 위쪽
                matrix[first][i] = matrix[last - offset][first];

                // 아래쪽 -> 왼쪽
                matrix[last - offset][first] = matrix[last][last - offset];

                // 오른쪽 -> 아래쪽
                matrix[last][last - offset] = matrix[i][last];

                // 위쪽 -> 오른쪽
                matrix[i][last] = top; // 오른쪽: 미리 저장해놓은 top
            }
        }
        return true;
    }
}
