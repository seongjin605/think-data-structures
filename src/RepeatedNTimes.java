public class RepeatedNTimes {

    /**
     * Input: [5,1,5,2,5,3,5,4]
     * Output: 5
     * @param A
     * @return
     */
    public static int repeatedNTimes(int[] A) {
        int count = 0;
        int temp;
        for(int i = 0; i < A.length; i++) {
            temp = A[i];
            if(temp == A[i + 1]) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {5,1,5,2,5,3,5,4};
        int result = repeatedNTimes(A);
        System.out.println(result);
    }
}
