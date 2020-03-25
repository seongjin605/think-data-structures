package leetcode;


import java.util.*;

/**
 * INPUT: [3, 3, 3, 3, 3, 1, 3]
 * <p>
 * Output: [[5],[0,1,2],[3,4,6]]
 * Explanation:
 * Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 * <p>
 * Input: groupSizes = [2,1,3,3,3,2]
 * Output: [[1],[0,5],[2,3,4]]
 * <p>
 * INPUT
 * [2,2,1,1,1,1,1,1]
 * Output
 * [[2],[3],[4],[5],[6],[7],[0,1]]
 */
public class _1282 {
    public static List<List<Integer>> groupThePeople(int[] a) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> list = map.getOrDefault(a[i], new ArrayList());
            list.add(i);
            map.put(a[i], list);
        }
        System.out.println(map);
        List<List<Integer>> result = new ArrayList<>();
        for (int key : map.keySet()) {
            // key와 key의 value size가 같으면 그대로 넣고 아니면
            List<Integer> valuesOfKey = map.get(key);
            for (int i = 0; i < valuesOfKey.size(); i++) {
                if (key <= valuesOfKey.get(i)) {
                    result.add(Collections.singletonList(valuesOfKey.get(i)));
                } else {
                    result.add(valuesOfKey);
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // int[] groupSizes = {2, 2, 1, 1, 1, 1, 1, 1};
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        groupThePeople(groupSizes);
    }
}
