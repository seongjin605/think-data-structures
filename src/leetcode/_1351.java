package leetcode;

/**
 * problem
 * <a>https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/</a>
 *
 * submission
 * <a>https://leetcode.com/submissions/detail/333844440/</a>
 */
public class _1351 {
    public static int countNegatives(int[][] grid) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
            for(int i = 0 ; i < m; i++) {
            for(int j = 0 ; j < n; j++) {
                if(grid[i][j] < 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _1351 a = new _1351();
        // int[][] data = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int[][] data = {{5,1,0},{-5,-5,-5}};
        a.countNegatives(data);
    }
}
