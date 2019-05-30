public class Test {
	static int[][] data = {
		{1, 4, 5},
		{1, 3, 4},
		{2, 6}
	};

	public static void main(String[] args) {
		Solution s = new Solution();

		ListNode[] lists = new ListNode[data.length];
		for(int i = 0; i < data.length; i++) {
			ListNode head = new ListNode(0);
			ListNode p = head;
			for(int a: data[i]) {
				p.next = new ListNode(a);
				p = p.next;
			}
			lists[i] = head.next;
		}

		ListNode res = s.mergeKLists(lists);
		while(res != null) {
			System.out.print(res.val + " ");
		}
		System.out.println();
	}
}