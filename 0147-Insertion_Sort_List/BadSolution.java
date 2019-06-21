public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)   return head;

        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;
        ListNode tail = head;

        ListNode cur = head.next;
        while(cur != null) {
            ListNode tPre = VH;
            while(tPre.next != cur && tPre.next.val <= cur.val) {
                tPre = tPre.next;
            }
            if(tPre.next != cur){
                tail.next = cur.next;
                cur.next = tPre.next;
                tPre.next = cur;
                cur = tail.next;
            } else {
                tail = cur;
                cur = cur.next;
            }
        }

        return VH.next;
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 1, 3};

        Solution s = new Solution();

        System.out.println(s.insertionSortList(ListNode.fromArray(data)));
    }
}