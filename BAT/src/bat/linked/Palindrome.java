package bat.linked;

import java.util.Stack;

public class Palindrome {
	public static void main(String[] args) {
		ListNode pHead = new ListNode(1);
		pHead.next = new ListNode(2);
		pHead.next.next = new ListNode(3);
		pHead.next.next.next = new ListNode(4);
		pHead.next.next.next.next = new ListNode(3);
		//pHead.next.next.next.next.next = new ListNode(2);
		pHead.next.next.next.next.next = new ListNode(1);
		System.out.println(isPalindrome(pHead));
	}
    public static boolean isPalindrome(ListNode pHead) {
        // write code here
    	ListNode cur = pHead;
    	ListNode next = null;
    	Stack<ListNode> stack = new Stack<>();
    	while(cur!=null) {
    		//next = cur.next;
    		//cur.next = null;
    		stack.push(cur);
    		cur = cur.next;
    	}
    	cur = pHead;
    	boolean flag = true;
    	while(cur!=null) {
    		//next = cur.next;
    		//cur.next = null;
    		if(cur.val != stack.pop().val) {
    			flag = false;
    			return flag;
    		}
    		cur = cur.next;
    	}
    	
    	return flag;
    }
}
