package bat.linked;

import static org.junit.Assert.assertNotNull;

import javax.naming.spi.DirStateFactory.Result;

public class ClearValue {
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(3);
		root.next.next.next.next.next = new ListNode(2);
		root.next.next.next.next.next.next = new ListNode(1);
		System.out.println(clear(root, 1));
	}
    public static ListNode clear(ListNode head, int val) {
        // write code here
    	if(head==null)return null;
    	ListNode result = null;
    	ListNode resultLast  =null;
    	ListNode cur = head;
    	ListNode next = null;
    	while(cur!=null) {
    		next = cur.next;
    		cur.next = null;
    		if(result==null && resultLast == null) {
    			if(cur.val!=val) {
    				result = cur;
    				resultLast = cur;
    			}
    		}else {
    			if(cur.val != val) {
    				resultLast.next = cur;
    				resultLast = resultLast.next;
    			}
    		}
    		
    		cur = next;
    	}
    	
    	return result;
    }
}
