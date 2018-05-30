package bat.linked;

public class Solution {
	public static void main(String[] args) {
		RandomListNode root = new RandomListNode(1);
		RandomListNode r1 = new RandomListNode(2);
		RandomListNode r2 = new RandomListNode(3);
		RandomListNode r3 = new RandomListNode(4);
		root.next = r1;
		root.random = r3;
		
		r1.next = r2;
		r1.random = root;
		
		r2.next = r3;
		r2.random = r1;
		Clone(root);
	}
    public static RandomListNode Clone(RandomListNode pHead)
    {
    	RandomListNode cur = pHead;
    	RandomListNode next = null;
    	while(cur!=null) {
    		next = cur.next;
    		cur.next = null;
    		cur.next = new RandomListNode(cur.label);
    		cur.next.next = next;
    		cur = next;
    	}
    	cur = pHead;
    	//RandomListNode newPhead = pHead.next;
    	//RandomListNode newCur = newPhead;
    	int i=0;
    	while(cur.next!=null&&cur.random!=null) {
    		if(i%2==0) {
    			cur.next.random = cur.random.next;
    		}
    		next = cur.next;
    		cur = next;
    		i++;
    	}
    	RandomListNode newPhead = pHead.next;
    	cur = newPhead;
    	while(cur.next!=null) {
    		next = cur.next.next;
    		cur.next = null;
    		cur.next = next;
    		cur = next;
    	}
    	pHead = newPhead;
        return newPhead;
    }
}