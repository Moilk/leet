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
        Deque<TreeNode> stack = new LinkedList<>();

        while(root != null || !stack.isEmpty()) {
            // 非空就先访问它，然后把右节点压栈，指针跳向左节点
            if(root != null) {
                order.add(root.val);
                stack.addFirst(root.right);
                root = root.left;
            } else {
                // 为空就把压栈的右节点弹出，访问右节点
                root = stack.removeFirst();
            }
        }

        return order;
    }
}