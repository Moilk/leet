/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode next = cur;

        while(cur != null) {
            if(next == null || next.val != cur.val){
                cur.next = next;
                cur = cur.next;

            }
            if(next == null)    break;
            next = next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 5, 7, 7};
        ListNode head = ListNode.fromArray(a);

        Solution s = new Solution();
        System.out.println(s.deleteDuplicates(head));
    }
}