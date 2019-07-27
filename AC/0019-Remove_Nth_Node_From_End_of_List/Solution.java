class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;
        ListNode tail = head;

        while((n--) > 0) {
            tail = tail.next;
        }

        ListNode pre = VH;
        while(tail != null) {
            pre = pre.next;
            tail = tail.next;
        }

        pre.next = pre.next.next;

        return VH.next;
    }
}