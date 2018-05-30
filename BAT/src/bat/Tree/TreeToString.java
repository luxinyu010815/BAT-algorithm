package bat.Tree;

import java.util.Stack;

/**
 * �������ǽ��ܶ������������л��ķ�ʽ���������л��Ľ���ַ���Ϊstr����ʼʱstr���ڿ��ַ�����
 * �����������������������սڵ㣬����str��ĩβ���ϡ�#!������#����ʾ����ڵ�Ϊ�գ�
 * �ڵ�ֵ�����ڣ���Ȼ��Ҳ�����������������ַ�����!����ʾһ��ֵ�Ľ�����
 * ���������Ϊ�յĽڵ㣬����ڵ�ֵΪ3������str��ĩβ���ϡ�3!������������ʵ�������������л��� �������ĸ����root���뷵�ض��������л�����ַ�����
 * 
 * @author luxin
 *
 */
public class TreeToString {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(132);
		root.left = new TreeNode(11);
		root.right = new TreeNode(375);
		root.left.left = new TreeNode(625);
		root.left.right = new TreeNode(225);
		root.right.left = new TreeNode(416);
		System.out.println(toString(root));
	}
	public static String toString(TreeNode root) {
		// write code here
		StringBuilder str = new StringBuilder();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = null;
		stack.push(root);
		while (stack.size() > 0) {
			cur = stack.pop();
			if(cur!=null) {
				str.append(cur.val + "!");
			}else {
				str.append("#!");
				continue;
			}
			
			if (cur.right != null) {
				stack.push(cur.right);
			} else {
				stack.push(null);
			}

			if (cur.left != null) {
				stack.push(cur.left);
			}else {
				stack.push(null);
			}
		}
		
		return str.toString();
	}
}