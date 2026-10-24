/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int traverse(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
        }

        sum += traverse(root.left, 0);
        sum += traverse(root.right, 0);
        return sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        sum = traverse(root, sum);
        return sum;
    }
}