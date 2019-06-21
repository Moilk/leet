class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)    return head;
        ListNode l2 = partition(head);
        head = sortList(head);
        l2 = sortList(l2);
        return merge2(head, l2);
    }

    public ListNode partition(ListNode head) {
        if(head == null || head.next == null)   return null;

        ListNode p1 = head;
        ListNode p2 = head.next;

        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        p2 = p1.next;
        p1.next = null;

        return p2;
    }

    // 没有考虑链表的特点，效率
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode VH = new ListNode(0);
        ListNode p = VH;

        while(l1 != null || l2 != null) {
            if(l1 == null) {
                p.next = l2;
                l2 = l2.next;
            } else if(l2 == null) {
                p.next = l1;
                l1 = l1.next;
            } else if(l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

         return VH.next;
    }

    // 考虑链表的特点，当某一个链表先结束的时候，可以直接把另一个连接接上
    public ListNode merge2(ListNode l1, ListNode l2) {
        ListNode VH = new ListNode(0);
        ListNode p = VH;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if(l1 == null) {
            p.next = l2;
        } else {
            p.next = l1;
        }

        return VH.next;
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 1, 3};

        System.out.println(new Solution().sortList(ListNode.fromArray(data)));
    }
}