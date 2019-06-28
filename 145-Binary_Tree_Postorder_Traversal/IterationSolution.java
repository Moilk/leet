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

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;


        TreeNode cur;
        if(root != null)
            stack.addFirst(root);
        while(!stack.isEmpty()) {
            cur = stack.getFirst();
            if( (cur.left == null && cur.right == null) || ((pre != null) && (pre == cur.left || pre == cur.right))) {
                order.add(cur.val);
                stack.removeFirst();
                pre = cur;
            } else {
                if(cur.right != null)   stack.addFirst(cur.right);
                if(cur.left != null)   stack.addFirst(cur.left);
            }
        }

        return order;
    }
}