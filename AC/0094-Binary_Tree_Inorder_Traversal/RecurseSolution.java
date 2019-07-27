import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 递归算法
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> order = new LinkedList<>();
        helper(root, order);

        return order;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if(root == null)    return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}