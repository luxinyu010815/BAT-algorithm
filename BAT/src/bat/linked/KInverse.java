package bat.linked;

import java.util.Stack;

public class KInverse {
	public static void main(String[] args) {
		ListNode root = new ListNode(0);
		root.next = new ListNode(1);
		root.next.next = new ListNode(2);
		root.next.next.next = new ListNode(5);
		//root.next.next.next.next = new ListNode(11);
		System.out.println(inverse(root, 4));
	}
	public static ListNode inverse(ListNode head, int k) {
		// write code here
		Stack<ListNode> stack = new Stack<>();
		ListNode cur = head;
		ListNode resultEnd = null;
		ListNode next = null;
		ListNode result = null;
		while (cur != null) {
			next = cur.next;
			cur.next = null;
			if (stack.size() >= k) {
				while (stack.size() > 0) {
					if (result == null) {
						result = stack.pop();
						resultEnd = result;
					} else {
						resultEnd.next = stack.pop();
						resultEnd = resultEnd.next;
					}
				}
			}
			stack.push(cur);
			
			cur = next;
		}
		Stack<ListNode> temp = new Stack<>();
		if(stack.size()==k) {
			temp = stack;
		}else {
			while(stack.size()>0) {
				temp.push(stack.pop());
			}
		}
		while(temp.size()>0) {
			if (result == null) {
				result = temp.pop();
				resultEnd = result;
			} else {
				resultEnd.next = temp.pop();
				resultEnd = resultEnd.next;
			}
		}
		return result;
	}
}
