package leetcode;


import java.util.*;

/**
 * <a>https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/</a>
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
        List<Integer> groups = new ArrayList<>();
        for (int data : a) {
            groups.add(data);
        }
        Set<Integer> setOfGroups = new HashSet<>(groups);
        List<Integer> refinedGroups = new ArrayList<>(setOfGroups);
        // System.out.println("refinedGroups:" + refinedGroups); [1, 3]

        Map<Integer, List> map = new HashMap();
        for (int j = 0; j < refinedGroups.size(); j++) {
            List<Integer> indexList = new ArrayList<>();
            for (int i = 0; i < groups.size(); i++) {
                if (refinedGroups.get(j) == groups.get(i)) {
                    indexList.add(i);
                    map.put(refinedGroups.get(j), indexList);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int key : map.keySet()) {
            List<Integer> grouping = map.get(key);
            System.out.println(key); // 1, 3
            System.out.println(grouping); // [5], [0, 1, 2, 3, 4, 6]
            for (int i = 0; i < key; i++) {
                numbers.add(grouping.get(i));

            }
            System.out.println("--------------------------------------");
            result.add(numbers);
        }
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        groupThePeople(groupSizes);
    }
}
