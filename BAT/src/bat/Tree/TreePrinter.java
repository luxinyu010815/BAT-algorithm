package bat.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 * 所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 * @author luxin
 *
 */
public class TreePrinter {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(132);
		root.left = new TreeNode(11);
		root.right = new TreeNode(375);
		root.left.left = new TreeNode(625);
		root.left.right = new TreeNode(225);
		root.right.left = new TreeNode(416);
		for (int[] s : printTree(root)) {
			System.out.println(Arrays.toString(s));
		}
	}
    public static int[][] printTree(TreeNode root) {
        // write code here
    	Queue<TreeNode> deque = new ArrayDeque<>();
    	List<List<Integer>> result = new ArrayList<>();
    	TreeNode last = root;
    	TreeNode cur = root;
    	TreeNode nLast = null;
    	List<Integer> list = new ArrayList<>();
    	deque.add(root);
    	while(deque.size()>0) {
    		cur = deque.remove();
    		
    		if(cur.left!=null) {
    			deque.add(cur.left);
    			nLast = cur.left;
    		}
    		if(cur.right!=null) {
    			deque.add(cur.right);
    			nLast = cur.right;
    		}
    		
    		if(cur==last) {
    			last = nLast;
    			list.add(cur.val);
    			result.add(list);
    			list = new ArrayList<>();
    		}else {
    			list.add(cur.val);
    		}
    		
    	}
    	int[][] re = new int[result.size()][];
    	for(int i=0;i<result.size();i++) {
    		int[] b = new int[result.get(i).size()];
    		for(int j=0;j<result.get(i).size();j++) {
    			b[j] = result.get(i).get(j);
    		}
    		re[i] = b;
    	}
    	
    	return re;
    }
}
