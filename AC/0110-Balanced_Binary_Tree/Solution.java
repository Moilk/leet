/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return balance(root) >= 0;
    }
    
    private int balance(TreeNode root) {
        if (root == null) return 0;
        
        int left = balance(root.left);
        if (left < 0)   return -1;
        
        int right = balance(root.right);
        if (right < 0)  return -1;
        
        if (Math.abs(left - right) > 1) return -1;
        
        return Math.max(left, right) + 1;
    }
}