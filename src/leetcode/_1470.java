package leetcode;

public class _1470 {
    public int[] shuffle(int[] nums, int n) {
        int half = nums.length / 2;

        int[] result = new int[nums.length];
        for (int i = 0; i < half; i++) {
            result[i] = nums[i];
        }

        for (int i = half; i < half * 2; i++) {
            result[i] = nums[i];
        }

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return null;
    }

    public static void main(String[] args) {
        _1470 a = new _1470();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        a.shuffle(nums, n);
    }

}
