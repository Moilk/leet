import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> order = new LinkedList<>();
        helper(root, order);

        return order;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if(root == null)    return;
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}