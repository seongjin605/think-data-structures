package leetcode;

/**
 * <a>https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/</a>
 *
 * <a>https://leetcode.com/submissions/detail/330377177/</a>
 * <p>
 *  Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 *  Output: 18880
 * </p>
 */
public class _1290 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) | head.val;
            head = head.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);

        head.next = node1;
        node1.next = node2;

        getDecimalValue(head);

    }
}
