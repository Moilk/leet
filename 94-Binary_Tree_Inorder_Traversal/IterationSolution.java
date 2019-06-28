import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> order = new LinkedList<>();

        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.addFirst(root);
                root = root.left;
            } else {
                root = stack.removeFirst();
                order.add(root.val);
                root = root.right;
            }
        }

        return order;
    }
}