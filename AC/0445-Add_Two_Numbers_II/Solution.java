import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 堆栈法
 * 
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> s1 = new LinkedList<>();
        Deque<Integer> s2 = new LinkedList<>();

        while(l1 != null) {
            s1.addFirst(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            s2.addFirst(l2.val);
            l2 = l2.next;
        }

        ListNode VH = new ListNode(Integer.MIN_VALUE);
        int carry = 0;
        while((!s1.isEmpty()) || (!s2.isEmpty()) || (carry != 0)) {
            int a = 0, b = 0;
            if(!s1.isEmpty()) {
                a = s1.removeFirst();
            }
            if(!s2.isEmpty()) {
                b = s2.removeFirst();
            }

            int sum = a + b + carry;
            ListNode tmp = new ListNode(sum % 10);
            tmp.next = VH.next;
            VH.next = tmp;
            carry = sum / 10;
        }

        return VH.next;
    }
}