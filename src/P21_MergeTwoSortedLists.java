class P21_MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode curr = l3;
		while (!(l1.next == null && l2.next == null)) {
			if (l1.next.val > l2.next.val || l2.next == null) {
				curr.next = new ListNode(l1.val);
				if(l1 != null) l1 = l1.next;
			} else {
				curr.next = new ListNode(l2.val);
				if(l2 != null) l2 = l2.next;
			}
			curr = curr.next;
		}
		return l3;
	}

	public static void main(String[] args) {
    	P21_MergeTwoSortedLists solution = new P21_MergeTwoSortedLists();

    	//ListNode l1 = new ListNode(3);
    	ListNode l2 =new ListNode(2);
    	ListNode l1 = new ListNode(3);
    	System.out.println(solution.mergeTwoLists(l1,l2));
    	}
	
}

 /*class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}*/