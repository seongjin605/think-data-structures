package leetcode;

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * Input: nums = [3,4,5,2]
 * Output: 12
 */
public class _1464 {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        return (max1-1)*(max2-1);
    }

    public static void main(String[] args) {
        _1464 a = new _1464();

        int[] nums = {3, 7};
        a.maxProduct(nums);
    }
}
