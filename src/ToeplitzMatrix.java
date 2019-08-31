public class ToeplitzMatrix {

    /**
     * <a>https://leetcode.com/problems/toeplitz-matrix/submissions/</a>
     * @param matrix
     * @return
     */
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("matrix[i].length="+matrix[i].length);
            for (int j = 0; j < matrix[i].length ; j++) {
                if(i > 0 && j > 0 && matrix[i][j] != matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 1, 2, 3},
//                {9, 5, 1, 2}
//        };
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean isFlag = isToeplitzMatrix(matrix);
        System.out.println("isFlag = " + isFlag);
    }
}
