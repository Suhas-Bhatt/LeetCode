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
    public List<Integer> postorderTraversal(TreeNode root)  
    {
        List<Integer> result = new ArrayList<>();
        helperPostorder(root,result);
        return result;
        
    }

    private void helperPostorder(TreeNode root, List<Integer> result){
        if(root != null){
            helperPostorder(root.left,result);
            helperPostorder(root.right,result);
            result.add(root.val);
        }
    }
}