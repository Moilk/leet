class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

// 1->2->3->4->null
// 2->1->4->3->null
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;

        ListNode pre = VH;
        while(pre.next != null && pre.next.next != null) {
            ListNode tmp1 = pre.next.next.next;
            pre.next.next.next = pre.next;
            ListNode tmp2 = pre.next.next;
            pre.next.next = tmp1;
            pre.next = tmp2;
            pre = pre.next.next;
        }

        return VH.next;
    }
}