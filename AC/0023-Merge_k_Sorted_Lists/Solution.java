class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int start, int end) {
        if (start >= end) {
            return lists[start];
        }  
        if((end - start) == 1) {
            return merge(lists[start], lists[end]);
        } 

        int mid = start + (end - start + 1) / 2;
        ListNode l1 = merge(lists, start, mid -1);
        ListNode l2 = merge(lists, mid, end);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;

        while(l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            p = p.next;
        }

        return res.next;
    }
}