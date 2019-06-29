import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> out = new LinkedList<>();
        if(root == null)    return out;

        Deque<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        TreeNode pre = null;
        TreeNode cur;
        while(!stack.isEmpty()) {
            cur = stack.getFirst();
            if((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                out.add(cur.val);
                stack.removeFirst();
                pre = cur;
            } else {
                if(cur.right != null) {
                    stack.addFirst(cur.right);
                }
                if(cur.left != null) {
                    stack.addFirst(cur.left);
                }
            }
        }

        return out;
    }
}