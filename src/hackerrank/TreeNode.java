package hackerrank;


import java.util.ArrayList;
import java.util.Arrays;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static int sumEvenGrandparent(TreeNode root) {
        return sum(root, false);
    }


    private static int sum(TreeNode root, boolean shouldAddChild) {

        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (shouldAddChild) {
            sum += getVal(root.left) + getVal(root.right);
        }

        if (root.val % 2 == 0) {
            sum += sum(root.left, true) + sum(root.right, true);
        } else {
            sum += sum(root.left, false) + sum(root.right, false);
        }

        return sum;
    }

    private static int getVal(TreeNode root) {
        return root == null ? 0 : root.val;
    }

}

