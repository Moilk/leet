/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        return bfs(node);
    }
    
    private Node bfs(Node node) {
        if (node == null)   return null;
        
        Map<Node, Node> visited = new HashMap<>();
        Node head = new Node(node.val, new LinkedList<>());
        visited.put(node, head);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while (!queue.isEmpty()) {
            Node old = queue.poll();
            Node clone = visited.get(old);
            for (Node n : old.neighbors) {
                if (visited.containsKey(n)) {
                    clone.neighbors.add(visited.get(n));
                } else {
                    Node newNode = new Node(n.val, new LinkedList<>());
                    visited.put(n, newNode);
                    clone.neighbors.add(newNode);
                    queue.offer(n);
                }
            }
        }
        
        return head;
    }
}