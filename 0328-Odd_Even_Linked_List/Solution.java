class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 类似86题的方法，lastOdd记录最后一个奇数节点，然后遍历，遇到奇数节点
 * 就把它交换到lastOdd后面，然后lastOdd后移
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode pre = head.next;
        if(pre == null) return head;

        ListNode lastOdd = head;
        int count = 2;
        while(pre.next != null) {
            if((count % 2) == 0) {
                ListNode tmp = pre.next;
                pre.next = tmp.next;
                tmp.next = lastOdd.next;
                lastOdd.next = tmp;
                lastOdd = tmp;
            } else {
                pre = pre.next;
            }
            count++;
        }


        return head;
    }
}