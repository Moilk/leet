class ListNode {
    int val;
    ListNode next;
    ListNode(int v) {
        val = v;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <=0)  return head;

        ListNode tail = head;
        int size = 1;
        while(tail.next != null) {
            tail = tail.next;
            size++;
        }
        tail.next = head;

        k = size - k % size;
        while((k--) > 0) {
            head = head.next;
            tail = tail.next;
        }
        tail.next = null;
        return head;
    }
}