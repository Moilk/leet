import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> order = new LinkedList<>();
        helper(root, order);

        return order;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if(root == null)    return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}