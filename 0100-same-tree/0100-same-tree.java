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
    public static void traverse(TreeNode root, List<Integer> res) {
        if (root == null) {
            res.add(null);
            return;
        }
        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        traverse(p, res1);
        traverse(q, res2);

        if (res1.size() != res2.size())
            return false;
        for (int i = 0; i < res1.size(); i++) {
            if (!Objects.equals(res1.get(i), res2.get(i))) // compares Integer object values
                return false;
        }
        return true;
    }
}