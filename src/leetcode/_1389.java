package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a>https://leetcode.com/problems/create-target-array-in-the-given-order/</a>
 *
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 */
public class _1389 {
    public int[] createTargetArray(int[] nums, int[] indices) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == j) {
                    // result에 인덱스와 엘리먼트를 넣어줌.
                    result.add(indices[j], nums[i]);
                }
            }
        }
        return result.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        _1389 s = new _1389();

        int[] a = {0, 1, 2, 3, 4};
        int[] b = {0, 1, 2, 2, 1};
        s.createTargetArray(a, b);

    }
}
