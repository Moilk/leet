class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	ListNode lf;
	boolean isStop;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        lf = head;
        isStop = false;

        reverse(head, m, n);

        return head;
    }

    public void reverse(ListNode rg, int m, int n){
    	if(n == 1)	return;
    	rg = rg.next;
    	if(m > 1)	lf = lf.next;

    	reverse(rg, m - 1, n - 1);

    	if(lf == rg || lf == rg.next)	isStop = true;

    	if(!isStop){
    		swap(lf, rg);
    		lf = lf.next;
    	}
    }

    public void swap(ListNode a, ListNode b) {
    	int tmp = a.val;
    	a.val = b.val;
    	b.val = tmp;
    }
}