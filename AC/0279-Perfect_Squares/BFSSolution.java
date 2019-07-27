import java.util.*;

class Node {
    final int val;
    final int step;
    Node(int val, int step) {
        this.val = val;
        this.step = step;
    }
}

class Solution {
    public int numSquares(int n) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(n, 0));
        boolean[] visited = new boolean[n + 1];

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(int i = 1; ; i++) {
                int d = node.val - i * i;
                if(d < 0)   break;
                if(d == 0)  return node.step + 1;

                if(!visited[d]) {
                    queue.offer(new Node(d, node.step + 1));
                    visited[d] = true;
                }
            }
        }

        return -1;
    }
}