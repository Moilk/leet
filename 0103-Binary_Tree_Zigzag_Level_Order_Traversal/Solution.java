import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Pair {
    final TreeNode node;
    final int layer;
    Pair(TreeNode n, int l) { node = n; layer = l;}
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> out = new LinkedList<>();
        if(root == null)    return out;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));
        Pair cur;
        LinkedList<Integer> curList;
        while(!queue.isEmpty()) {
            cur = queue.poll();
            if(out.size() < cur.layer) {
                out.addLast(new LinkedList<Integer>());
            }

            curList = (LinkedList<Integer>)out.getLast();
            if((cur.layer % 2) == 1) {
                curList.addLast(cur.node.val);
            } else {
                curList.addFirst(cur.node.val);
            }

            if(cur.node.left != null) {
                queue.offer(new Pair(cur.node.left, cur.layer + 1));
            }
            if(cur.node.right != null) {
                queue.offer(new Pair(cur.node.right, cur.layer + 1));
            }
        }

        return out;
    }
}