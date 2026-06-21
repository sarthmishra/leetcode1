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
        Queue<TreeNode> levelqueue = new LinkedList<>();
        levelqueue.add(root);
        levelqueue.add(null);
        List<Double>avglist = new ArrayList<>();
        while(levelqueue.peek() != null){
            double sum = 0;
            int nodes = 0;
            while(levelqueue.peek() != null){
                TreeNode node = levelqueue.poll();
                sum += node.val;
                nodes++;

                if(node.left != null)levelqueue.add(node.left);
                if(node.right != null)levelqueue.add(node.right);
            }
            levelqueue.add(levelqueue.poll());
            avglist.add(sum/nodes);
        }
        return avglist;
    }
}