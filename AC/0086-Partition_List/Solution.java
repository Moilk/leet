class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * lastLess指向最后一个比x小的节点，然后从那个节点开始继续遍历
 * 还找到比x小的节点，就交换到x后面，lastLess后移
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;

        ListNode lastLess = VH;
        while(lastLess.next != null && lastLess.next.val < x) {
            lastLess = lastLess.next;
        }

        ListNode pre = lastLess;
        ListNode cur = lastLess.next;
        while(cur != null) {
            if(cur.val < x) {
                ListNode tmp = lastLess.next;
                pre.next = cur.next;
                lastLess.next = cur;
                cur.next = tmp;
                lastLess = cur;
                cur = pre.next;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }


        return VH.next;
    }
}