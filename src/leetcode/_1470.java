package leetcode;

/**
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * <p>
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 */
public class _1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for(int i = 0; i < nums.length; i++)
            res[i] = i % 2 == 0 ? nums[i/2] : nums[n + i/2];
        return res;
    }

    public static void main(String[] args) {
        _1470 a = new _1470();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        a.shuffle(nums, n);
    }

}
