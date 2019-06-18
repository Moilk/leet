import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * [反转链表]
 * 
 * 栈法
 */
class StackSolution {
    public ListNode reverseList(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();

        while(head != null) {
            stack.addFirst(head.val);
            head = head.next;
        }

        head = new ListNode(0);
        ListNode p = head;
        while(!stack.isEmpty()) {
            p.next = new ListNode(stack.removeFirst());
            p = p.next;
        }

        return head.next;
    }
}