import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 递归法
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // 至少有两个节点，且k大于1，才需要翻转，否则直接返回
        if(head == null || head.next == null || k <= 1)   return head;

        // 先往后走k步，如果没走完就为null，说明长度不够，直接返回
        // 若走完k步，next指向下一个k-gourp的头部
        ListNode next = head;
        for(int i = 0; i < k; i++) {
            if(next == null)    return head;
            next = next.next;
        }

        // 翻转当前的k-group
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null && cur != next) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        // 当前k-group的旧头部指向翻转后的下一个k-group
        head.next = reverseKGroup(next, k);

        // 返回新头部
        return pre;
    }
}