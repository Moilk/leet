import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Pair {
    TreeNode node;
    int lay;
    Pair(TreeNode n, int l) { node = n; lay = l;}
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> out = new LinkedList<>();
        if(root == null)    return out;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));

        while(!queue.isEmpty()) {
            Pair cur = queue.poll();
            if(out.size() < cur.lay) {
                out.add(cur.node.val);
            }
            if(cur.node.right != null) {
                queue.offer(new Pair(cur.node.right, cur.lay + 1));
            }
            if(cur.node.left != null) {
                queue.offer(new Pair(cur.node.left, cur.lay + 1));
            }
        }

        return out;
    }
}