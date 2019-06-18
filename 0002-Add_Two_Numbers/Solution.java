class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        ListNode p = VH;

        while(l1 != null || l2 != null || carry != 0) {
            int a = 0;
            int b = 0;
            if(l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int sum = a + b + carry;
            p.next = new ListNode(sum % 10);
            carry = sum / 10;
            p = p.next;
        }

        return VH.next;
    }
}