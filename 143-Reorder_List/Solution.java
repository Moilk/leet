class Solution {
    private ListNode left;
    private boolean stop;

    public void reorderList(ListNode head) {
        left = head;
        stop = false;
        helper(head);
    }

    private void helper(ListNode head) {
        if (head == null || head.next == null)
            return;

        helper(head.next);

        if(stop) return;
        if (head == left || head == left.next) {
            stop = true;
        }
        ListNode cur = head.next;
        head.next = head.next.next;
        cur.next = left.next;
        left.next = cur;
        left = cur.next;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4};
        ListNode head = ListNode.fromArray(a);
        Solution s = new Solution();
        s.reorderList(head);
        System.out.println(head);
    }
}