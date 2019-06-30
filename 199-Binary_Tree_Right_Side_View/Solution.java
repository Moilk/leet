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
        Deque<Pair> deque = new LinkedList<>();
        deque.addLast(new Pair(root, 1));

        int cutLay = 0;
        while(!deque.isEmpty()) {
            
        }


        return out;
    }
}