import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class StackSolution {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        Deque<ListNode> stack = new ArrayDeque<>();

        ListNode hHead = new ListNode(0);
        hHead.next = head;

        ListNode mParent = hHead;

        for(int i = 0; i <  m - 1; i++) {
            mParent = mParent.next;
        }

        ListNode nNode = mParent;
        for(int i = 0; i <= n - m; i++) {
            nNode = nNode.next;
            stack.addFirst(nNode);
        }
        nNode = nNode.next;

        while(!stack.isEmpty()) {
            mParent.next = stack.removeFirst();
            mParent = mParent.next;
        }
        mParent.next = nNode;

        return hHead.next;
    }

}