package bat.linked;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static int[] findCommonParts(ListNode headA, ListNode headB) {
        // write code here
    	List<Integer> list = new ArrayList<>();
    	
    	ListNode cA = headA;
    	ListNode cB = headB;
    	while(cA!=null&&cB!=null) {
    		if(cA.val>cB.val) {
    			cB = cB.next;
    		}else if(cA.val<cB.val) {
    			cA = cA.next;
    		}else {
    			list.add(cA.val);
    			cA = cA.next;
    			cB = cB.next;
    		}
    	}
    	
    	int[] result = new int[list.size()];
    	for(int i=0;i<result.length;i++) {
    		result[i] = list.get(i);
    	}
    	return result;
    }
}
