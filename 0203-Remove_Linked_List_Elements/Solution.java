class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;

        ListNode p = VH;
        while(p.next != null) {
            if(p.next.val == val) {
                p.next = p.next.next;
            } else {
                // 注意如果移除了元素p指针则不需要移动
                p = p.next;
            }
        }

        return VH.next;
    }
}