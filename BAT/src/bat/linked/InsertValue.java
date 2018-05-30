package bat.linked;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class InsertValue {
	public static void main(String[] args) {
		int[] A = { 4, 8, 9 };
		int[] nxt = { 1, 2, 0 };
		ListNode result = insert(A, nxt, 4);
		// System.out.println(insert(A, nxt,4));
	}

	public static ListNode insert(int[] A, int[] nxt, int val) {
		// write code here
		ListNode root = transform(A, nxt);
		ListNode current = root;
		ListNode next = root.next;
		ListNode insVal = new ListNode(val);
		while (next != root) {
			if (current.val <= val && val < next.val) {
				current.next = insVal;
				insVal.next = next;
				current = root;
				while(current.next!=root) {
					current = current.next;
				}
				current.next=null;
				return root;
			} else {
				current = next;
				next = next.next;
			}
		}
		if (val >= current.val) {
			current.next = insVal;
			insVal.next = null;
			return root;
		} else {
			current.next = insVal;
			insVal.next = null;
			return insVal;
		}
	}

	public static ListNode transform(int[] A, int[] nxt) {
		ListNode root = new ListNode(A[0]);
		ListNode current = root;
		for (int i = 1; i < A.length; i++) {
			ListNode next = new ListNode(A[i]);
			current.next = next;
			current = next;
		}
		current.next = root;
		return root;
	}
}
