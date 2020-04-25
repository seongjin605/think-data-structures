package leetcode;

import data.structure.Stack;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * Output: 18880
 */
public class _1290 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int getDecimalValue(int[] a) {
        Stack s = new Stack();
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }
        int count = 0;
        int result = 0;
        while (!s.isEmpty()) {
            count++;
            if((int) s.pop() == 0) {
                continue;
            }
            result += (int) Math.pow(2, count - 1);
        }
        System.out.println(result);
        return result;
    }

//    public static int getDecimalValue(ListNode head) {
//        head.val = 1;
//
//        Stack s = new Stack();
//        s.push(head);
//        int count = 0;
//        int result = 0;
//        while (!s.isEmpty()) {
//            count++;
//            if((int) s.pop() == 0) {
//                continue;
//            }
//            result += (int) Math.pow(2, count - 1);
//        }
//        System.out.println(result);
//        return count;
//    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        getDecimalValue(a);
    }
}
