package bat.binarySearch;

import org.junit.Test;

/**
 * 给定一棵完全二叉树的根节点root，返回这棵树的节点个数。如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
 * 给定树的根结点root，请返回树的大小。
 * 
 * @author luxin
 *
 */
public class CountNodes {
	public static int count(TreeNode root) {
		// write code here
		if(root==null) return 0;
		int result = 0;
		int leftDeep = getLeftDeep(root);
		int rightDeep = getRinghtDeep(root);
		if(leftDeep==rightDeep) {
			result+=Math.pow(2, leftDeep);
			result+=count(root.right);
		}else {
			result+=Math.pow(2, rightDeep);
			result+=count(root.left);
		}
		return result;
	}

	public static int getRinghtDeep(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode cur = root;
		int result = 0;
		while (cur.right != null) {
			result++;
			cur = cur.right;
		}
		return result;
	}

	public static int getLeftDeep(TreeNode root) {
		// TODO Auto-generated method stub
		TreeNode cur = root;
		int result = 0;
		while (cur.left != null) {
			result++;
			cur = cur.left;
		}
		return result;
	}
}
