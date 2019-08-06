/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Result {
    int rob = 0;
    int unrob = 0;
}

class Solution {
    public int rob(TreeNode root) {
        Result res = tryRob(root);
        return Math.max(res.rob, res.unrob);
    }
    
    public Result tryRob(TreeNode root) {
        Result res = new Result();
        if (root == null) {
            return res;
        }
        
        Result left = tryRob(root.left);
        Result right = tryRob(root.right);
        
        res.rob = root.val + left.unrob + right.unrob;
        res.unrob = Math.max(left.rob, left.unrob) + Math.max(right.rob, right.unrob);
        
        return res;
    } 
}