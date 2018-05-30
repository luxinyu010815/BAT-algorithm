package bat.linked;

public class Remove {
	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		ListNode removeNode = removeNode(root, 3);
	}
    public static ListNode removeNode(ListNode pNode, int delVal) {
        // write code here
    	if(pNode.next==null) return null;
    	ListNode current = pNode;
    	ListNode nextNodex  = pNode.next;
    	while(nextNodex!=null) {
    		if(current.val==delVal) {
    			current.next = nextNodex.next;
    			break;
    		}
    		
    		current = current.next;
    		nextNodex = nextNodex.next;
    	}
    	return pNode;
    }
}
