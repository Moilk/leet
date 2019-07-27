class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 递归法
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)   return head;

        ListNode tmp = head.next;
        head.next = swapPairs(tmp.next);
        tmp.next = head;

        return tmp;
    }
}