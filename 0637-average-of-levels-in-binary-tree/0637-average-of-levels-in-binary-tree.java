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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgs = new ArrayList<>();
        if (root == null)
            return avgs;
        Queue<TreeNode> queue = new LinkedList<>();
        double sum = 0;
        int count = 0;
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            if (curr == null) {
                avgs.add(sum / count);
                sum = 0;
                count = 0;
                if (queue.isEmpty())
                    break;
                else
                    queue.add(null);
            } else {
                sum += curr.val;
                count++;
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
        return avgs;
    }
}