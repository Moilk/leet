class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    private ListNode left;
    private boolean stop;
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)   return true;

        left = head;
        stop = false;
        return helper(head);
    }

    private boolean helper(ListNode right) {
        if(right == null)   return true;

        boolean ok = helper(right.next);

        if(stop)    return ok;

        if(!ok)     return false;


        if(left == right || left.next==right)
            stop = true;
        ok = right.val == left.val;
        left = left.next;
        return ok;
    }
}