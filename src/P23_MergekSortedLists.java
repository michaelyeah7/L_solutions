

class P23_MergekSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		int i = 0;
		ListNode curr = new ListNode(0);
		for (i = 0; i < lists.length; i++) {
			curr = mergeTwoLists(lists[i], curr);
		}
		return curr;

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val > l2.val) {
			ListNode tmp = l2;
			tmp.next = mergeTwoLists(l1, l2.next);
			return tmp;
		} else {
			ListNode tmp = l1;
			tmp.next = mergeTwoLists(l1.next, l2);
			return tmp;
		}

	}
	public static void main(String[] args) {
		P23_MergekSortedLists solution = new P23_MergekSortedLists();
    	//ListNode l1 = new ListNode(3);
    	ListNode l2 =new ListNode(2);
    	ListNode l1 = new ListNode(3);
    	System.out.println(solution.mergeTwoLists(l1,l2));
    	}
}