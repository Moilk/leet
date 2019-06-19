class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 建立一个虚拟头结点
 * 两个指针，一个指向pre，一个指向next
 * 判断next的值和pre.next的值是不是相等，
 * 相等的话next后移，直到遇到不等或者到链表的尾部
 * 此时判断与pre.next的值相等的个数，
 * 如果个数大于1，说明有相同的节点，去除掉
 * 否则，只要把pre向后挪一个位置
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        final ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;

        ListNode pre = VH;
        ListNode next = head;
        int count = 0;
        while(pre.next != null) {
            if(next == null || pre.next.val != next.val) {
                if(count > 1) {
                    pre.next = next;
                } else {
                    pre = pre.next;
                }
                count = 0;
            } else {
                count++;
                next = next.next;
            }
        }

        return VH.next;
    }
}