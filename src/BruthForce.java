
class BruthForce {
    /**
     * <a>https://leetcode.com/problems/two-sum/</a>
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * Example:
     * </code>
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * <code>
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j])
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("유효하지 않은 Argument.");
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);

        for (int data : result) {
            System.out.print(data + ", ");
        }

    }
}