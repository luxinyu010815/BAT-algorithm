package bat.linked;

public class Divide {
	public static void main(String[] args) {
		ListNode root = new ListNode(300);
		root.next = new ListNode(200);
		root.next.next = new ListNode(1);
		ListNode result = listDivide(root, 2);
	}

	public static ListNode listDivide(ListNode head, int val) {
		// write code here
		if (head == null || head.next == null)
			return head;
		ListNode smallHead = null;
		ListNode smallEnd = null;
		ListNode bigHead = null;
		ListNode bigEnd = null;
		ListNode current = head;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = null;
			if (next.val <= val) {
				if (smallHead == null) {
					smallHead = next;
					smallEnd = next;
				} else {
					smallEnd.next = next;
					smallEnd = next;
				}
			} else {
				if (bigHead == null) {
					bigHead = next;
					bigEnd = next;
				} else {
					bigEnd.next = next;
					bigEnd = next;
				}
			}
			current = next;
		}
		if (smallHead != null) {
			smallEnd.next = bigHead;
		}
		return smallHead != null ? smallHead : bigHead;
	}
}
