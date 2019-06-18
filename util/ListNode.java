public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode fromArray(int[] array) {
        if(array==null && array.length == 0) return null;

        ListNode head = new ListNode(array[0]);
        ListNode p = head;
        for(int i = 1; i < array.length; i++) {
            p.next = new ListNode(array[i]);
            p = p.next;
        }

        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ListNode p = this;
        while(p!=null){
            sb.append(p.val).append("->");
            p = p.next;
        }

        sb.append("null");

        return sb.toString();
    }
}
