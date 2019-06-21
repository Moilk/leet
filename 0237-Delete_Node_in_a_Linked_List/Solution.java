class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 一开始觉得不可能做到，
 * 原来只要把后一个元素的值复制到要删除的节点上，
 * 然后去掉后一个节点，
 * 就相当于吧目标节点删除了
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}