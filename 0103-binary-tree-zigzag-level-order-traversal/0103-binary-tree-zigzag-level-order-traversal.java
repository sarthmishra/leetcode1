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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer>level = new ArrayList<>();
            Stack<Integer>ReverseStack = new Stack<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
            
            if(flag)
                ReverseStack.add(node.val);
            else
                level.add(node.val);

            if(node.left != null)queue.add(node.left);
            if(node.right != null)queue.add(node.right);
        }
        flag = !flag;

        while(!ReverseStack.isEmpty())
            level.add(ReverseStack.pop());

            ans.add(level);
        }

        return ans;
    }
}