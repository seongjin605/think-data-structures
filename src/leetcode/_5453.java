package leetcode;

public class _5453 {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                nums[i] = nums[i] + nums[i - 1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        _5453 a = new _5453();

        int[] days = {1, 2, 3, 4};
        a.runningSum(days);
    }
}
