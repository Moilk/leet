public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode VH = new ListNode(Integer.MIN_VALUE);
        VH.next = head;
        ListNode tail = head;

        ListNode cur = head.next;
        while (cur != null) {
            // 把判断放在前面可以防止每次都遍历一遍
            // 因为数组可能部分有序，所以性能会得到很大的提升
            if (tail.val > cur.val) {
                ListNode tPre = VH;
                while (tPre.next != cur && tPre.next.val <= cur.val) {
                    tPre = tPre.next;
                }
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
        int[] data = { 4, 2, 1, 3 };

        Solution s = new Solution();

        System.out.println(s.insertionSortList(ListNode.fromArray(data)));
    }
}