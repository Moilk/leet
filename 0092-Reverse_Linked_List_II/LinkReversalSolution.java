class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkReversalSolution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	// 前面加个头结点
    	ListNode vHead = new ListNode(-1);   
    	vHead.next = head;
    	ListNode mPrev = vHead;
    	ListNode cur = head;

    	while(m > 1) {
    		m--;
    		n--;
    		cur = cur.next;
    		mPrev = mPrev.next;
    	}

    	ListNode nNext;
    	ListNode prev = mPrev;
    	while(n > 0){
    		nNext = cur.next;
    		cur.next = prev;
    		prev = cur;
    		cur = nNext;
    	}

    	mPrev.next.next = cur;
    	mPrev.next = prev;

    	return vHead.next;
    }
}