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
// import java.util.*; 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root ==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> level = new ArrayList<>();

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                res.add(level);
                level = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                level.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}