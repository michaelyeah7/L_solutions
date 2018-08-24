import java.util.Stack;
class P25_ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head == null)
			return head;
		ListNode dragonHead = head;
		int count = 0, i = 0;
		Stack<ListNode> stack = new Stack();
		while (head.next != null && count < k) {
			stack.push(head);
			head = head.next;
		}
		if (count < (k - 1)) {
			return dragonHead;
		}
		dragonHead = head;
		ListNode reserve = head.next;
		for (i = 0; i < k; i++) {
			head.next = stack.pop();
			head = head.next;
		}
		head.next = reverseKGroup(reserve, k);
		return dragonHead;

	}
	
	public static void main(String[] args) {
		P25_ReverseNodesinkGroup solution = new P25_ReverseNodesinkGroup();
    	ListNode head =new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
    	System.out.println(solution.reverseKGroup(head,2));
    	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}