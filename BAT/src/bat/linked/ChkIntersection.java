package bat.linked;

/**
 * 如何判断两个有环单链表是否相交？相交的话返回第一个相交的节点，不想交的话返回空。
 * 如果两个链表长度分别为N和M，请做到时间复杂度O(N+M)，额外空间复杂度O(1)。
 * 给定两个链表的头结点head1和head2(注意，另外两个参数adjust0和adjust1用于调整数据,与本题求解无关)。
 * 请返回一个bool值代表它们是否相交。
 * 
 * @author luxin
 *
 */
public class ChkIntersection {
	public static void main(String[] args) {
		ListNode target = new ListNode(100);
		target.next = new ListNode(200);
		target.next.next = new ListNode(300);
		target.next.next.next = new ListNode(400);
		target.next.next.next.next = target;
		ListNode root1 = new ListNode(1);
		root1.next = new ListNode(2);
		root1.next.next = new ListNode(3);
		root1.next.next.next = new ListNode(4);
		root1.next.next.next.next = new ListNode(5);
		root1.next.next.next.next.next = target;
		ListNode target1 = new ListNode(22);
		target1.next = new ListNode(222);
		target1.next.next = new ListNode(2222);
		target1.next.next.next = target1;
		ListNode root2 = new ListNode(1);
		root2.next = new ListNode(2);
		root2.next.next = new ListNode(3);
		root2.next.next.next = new ListNode(4);
		root2.next.next.next.next = new ListNode(5);
		root2.next.next.next.next.next = new ListNode(6);
		root2.next.next.next.next.next.next = new ListNode(7);
		root2.next.next.next.next.next.next.next = target1;
		
		
		boolean flag = chkInter(root1, root2, 0, 0);
		System.out.println(flag);
	}
	public static boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
		// write code here
		ListNode start1 = getChkHead(head1, adjust0);
		ListNode start2 = getChkHead(head2, adjust1);
		ListNode result = null;
		/*if (start1 == start2) {
			result = getResult1(head1, head2, start1);
		} else {
			result = getResult2(head1, head2, start1, start2);
		}
		if(result==null) {
			return false;
		}else {
			return true;
		}*/
		if(start1==start2) {
			return true;
		}else {
			if(getResult2(head1, head2, start1, start2)!=null) {
				return true;
			}else {
				return false;
			}
		}
	}

	public static ListNode getChkHead(ListNode head, int adjus) {
		ListNode sloCur = head.next;
		ListNode fastCur = head.next.next;
		while (fastCur != null && fastCur.next != null && sloCur != null && fastCur != sloCur) {
			fastCur = fastCur.next.next;
			sloCur = sloCur.next;
		}
		fastCur = head;
		while (fastCur != sloCur) {
			fastCur = fastCur.next;
			sloCur = sloCur.next;
		}
		return fastCur;
	}

	public static ListNode getResult1(ListNode head1, ListNode head2, ListNode start) {
		int len1 = 0;
		int len2 = 0;
		ListNode cur1 = head1;
		ListNode cur2 = head2;
		while (cur1 != start) {
			cur1 = cur1.next;
			len1++;
		}
		while (cur2 != start) {
			cur2 = cur2.next;
			len2++;
		}
		int maxLen = 0;
		int minLen = 0;
		ListNode maxCur = null;
		ListNode minCur = null;
		if (len1 > len1) {
			maxCur = head1;
			minCur = head2;
			maxLen = len1;
			minLen = len2;
		} else {
			maxCur = head2;
			minCur = head1;
			maxLen = len2;
			minLen = len1;
		}
		for (int i = 0; i < maxLen - minLen; i++) {
			maxCur = maxCur.next;
		}
		while(maxCur!=minCur) {
			maxCur = maxCur.next;
			minCur = minCur.next;
		}
		return maxCur;
	}

	public static ListNode getResult2(ListNode head1, ListNode head2, ListNode start1, ListNode start2) {
		ListNode cur1 = start1;
		boolean flag = false;
		while(cur1!=null&&cur1.next!=start1) {
			if(cur1==start2) {
				return start1;
			}
			cur1 = cur1.next;
		}
		return null;
	}
}
