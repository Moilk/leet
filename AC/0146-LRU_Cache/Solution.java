class LRUCache {
    class Node {
        int key;
        int val;
        Node pre;
        Node next;
    }
    
    private Node head;
    private Node tail;
    private int capacity;
    
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null)   return -1;
        moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.val = value;
            moveToHead(node);
            return;
        }   
        
        node = new Node();
        node.key = key;
        node.val = value;
        addToHead(node);
    }
    
    private void moveToHead(Node node) {
        if (head == node)  return;
        if (tail == node) {
            tail = node.pre;
            tail.next = null;
        } else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.pre = null;
        node.next = head;
        head.pre = node;
        head = node;    
    }
    
    private void addToHead(Node node) {
        if (map.isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.pre = node;
            head = node;
        }
        if (map.size() == capacity) {
            Node tmp = tail;
            tail = tmp.pre;
            tmp.pre = null;
            tail.next = null;
            map.remove(tmp.key);
            tmp = null;
        }
        map.put(node.key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */