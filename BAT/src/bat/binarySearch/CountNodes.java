package bat.binarySearch;

import org.junit.Test;

/**
 * ����һ����ȫ�������ĸ��ڵ�root������������Ľڵ�����������ȫ�������Ľڵ���ΪN����ʵ��ʱ�临�Ӷȵ���O(N)�Ľⷨ��
 * �������ĸ����root���뷵�����Ĵ�С��
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
