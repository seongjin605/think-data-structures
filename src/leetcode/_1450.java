package leetcode;

/**
 * Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
 * Output: 1
 */
public class _1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0; i < startTime.length; i++) {
            count += startTime[i] <= queryTime && endTime[i] >= queryTime ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        _1450 a = new _1450();

        int[] startTimes = {1, 2, 3};
        int[] endTimes = {3, 2, 7};
        int queryTime = 4;

        a.busyStudent(startTimes, endTimes, queryTime);
    }
}
