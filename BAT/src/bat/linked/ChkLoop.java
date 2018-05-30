package bat.linked;

public class ChkLoop {
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		/*root.next = new ListNode(2);
		ListNode target = new ListNode(3);
		root.next.next = target;
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		root.next.next.next.next.next = target;*/
		root.next = new ListNode(2);
		ListNode target = new ListNode(3);
		root.next.next = target;
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		//root.next.next.next.next.next = new ListNode(6);
		chkLoop(root, 0);
	}
    public static int chkLoop(ListNode head, int adjust) {
        // write code here
    	ListNode fastCur = head;
    	ListNode sloCur = head;
    	while(fastCur.next!=null&&fastCur.next.next!=null) {
    		fastCur = fastCur.next.next;
    		sloCur = sloCur.next;
    		if(fastCur==sloCur) {
    			fastCur = head;
    			while(fastCur!=sloCur) {
    				fastCur = fastCur.next;
    				sloCur = sloCur.next;
    			}
    			return fastCur.val;
    		}
    	}
    	return -1;
    }
}
