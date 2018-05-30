package bat.linked;

/**
 * �����������޻�����������������ĳ��ȷֱ�Ϊm��n��
 * �����һ��ʱ�临�Ӷ�ΪO(n + m)������ռ临�Ӷ�ΪO(1)���㷨���ж������������Ƿ��ཻ��
 * �������������ͷ���headA��headB���뷵��һ��boolֵ�����������������Ƿ��ཻ��
 * ��֤����������С�ڵ���500��
 * @author luxin
 *
 */
public class CheckIntersect {
	public static void main(String[] args) {
		ListNode target = new ListNode(100);
		target.next = new ListNode(200);
		target.next.next = new ListNode(300);
		target.next.next.next = new ListNode(400);
		target.next.next.next.next = new ListNode(500);
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(2);
		root1.next.next = new ListNode(3);
		root1.next.next.next = new ListNode(4);
		root1.next.next.next.next = new ListNode(5);
		root1.next.next.next.next.next = target;
		ListNode root2 = new ListNode(1);
		root2.next = new ListNode(2);
		root2.next.next = new ListNode(3);
		root2.next.next.next = new ListNode(4);
		root2.next.next.next.next = new ListNode(5);
		root2.next.next.next.next.next = new ListNode(6);
		root2.next.next.next.next.next.next = new ListNode(7);
		root2.next.next.next.next.next.next.next = target;
		
		System.out.println(chkIntersect(root1, root2));
	}
    public static boolean chkIntersect(ListNode headA, ListNode headB) {
        // write code here
    	int bLen = 0;
    	ListNode curB = headB;
    	while(curB!=null) {
    		bLen++;
    		curB = curB.next;
    	}
    	ListNode curA = headA;
    	int aLen = 0;
    	while(curA!=null) {
    		aLen++;
    		curA = curA.next;
    	}
    	int maxL = 0;
		int minL = 0; 
		ListNode maxH = null;
		ListNode minH = null;
    	if(aLen>bLen) {
    		maxH = headA;
    		minH = headB;
    		maxL = aLen;
    		minL = bLen;
    	}else {
    		maxH = headB;
    		minH = headA;
    		maxL = bLen;
    		minL = aLen;
    	}
    	curA = maxH;
    	curB = minH;
    	for(int i=0;i<maxL-minL;i++) {
    		curA = curA.next;
    	}
    	Boolean flag = false;
    	while(curA!=null&&curB!=null&&curA!=curB) {
    		curA = curA.next;
    		curB = curB.next;
    	}
    	if(curA!=null) {
    		return true;
    	}else{
    		return false;
    	}
    }
}
