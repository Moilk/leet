import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
               List<List<Integer>> out = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.offer(root);

        int curWidth = 0;
        int nextWidth = 1;
        List<Integer> subList = null;
        TreeNode cur;
        while(!queue.isEmpty()) {
            if(curWidth == 0) {
                if(subList != null) out.add(subList);
                subList = new LinkedList<>();
                curWidth = nextWidth;
                nextWidth = 0;
            }

            cur = queue.poll();
            subList.add(cur.val);
            curWidth--;

            if(cur.left != null){
                queue.offer(cur.left);
                nextWidth++;
            }
            if(cur.right != null) {
                queue.offer(cur.right);
                nextWidth++;
            }
        }
        if(subList != null) out.add(subList);

        Collections.reverse(out);

        return out; 
    }
}