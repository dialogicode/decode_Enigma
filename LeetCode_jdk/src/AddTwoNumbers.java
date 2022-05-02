class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 != null) l1 = new ListNode(0);
		if (l1 != null && l2 == null) l2 = new ListNode(0);

		int currentVal = (l1.val + l2.val) % 10;
		int carryNode = (l1.val + l2.val) / 10;

		ListNode nextNode = null;
		
		if (carryNode > 0) nextNode = new ListNode(carryNode);
		if (l1.next != null) nextNode = addTwoNumbers(nextNode, l1.next);
		if (l2.next != null) nextNode = addTwoNumbers(nextNode, l2.next);

		return new ListNode(currentVal, nextNode);
	}
}
