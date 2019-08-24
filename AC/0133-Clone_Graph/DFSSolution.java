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
        
        Map<Node, Node> visited = new HashMap<>();
        
        return dfs(node, visited);
    }
    
    private Node dfs(Node node, Map<Node, Node> visited) {
        if (node == null) return null;
        if (visited.containsKey(node))  return visited.get(node);
        
        Node newNode = new Node(node.val, new LinkedList<>());
        visited.put(node, newNode);
        for (Node n : node.neighbors) {
              newNode.neighbors.add(dfs(n, visited));
        }
        
        return newNode;
    }
}