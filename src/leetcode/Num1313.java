package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/submissions/detail/315216401/
 * @Input: nums = [1,2,3,4]
 * @Output: [2, 4, 4, 4]
 * @Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 */
public class Num1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // i 인덱스가 짝수면 그 숫자 갯수만큼 배열을 생성한다.
            if (i == 0 || i % 2 == 0) {
                 // System.out.println(i);
                for (int j = 0; j < nums[i]; j++) {
                    // System.out.println(nums[i + 1]);
                    list.add(nums[i + 1]);
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Num1313 a = new Num1313();
        int[] input = {1,2,3,4};
        int[] datas = a.decompressRLElist(input);
        for (int data : datas) {
            System.out.print(data);
        }
    }
}
