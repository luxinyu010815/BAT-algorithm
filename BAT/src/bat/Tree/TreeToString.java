package bat.Tree;

import java.util.Stack;

/**
 * 首先我们介绍二叉树先序序列化的方式，假设序列化的结果字符串为str，初始时str等于空字符串。
 * 先序遍历二叉树，如果遇到空节点，就在str的末尾加上“#!”，“#”表示这个节点为空，
 * 节点值不存在，当然你也可以用其他的特殊字符，“!”表示一个值的结束。
 * 如果遇到不为空的节点，假设节点值为3，就在str的末尾加上“3!”。现在请你实现树的先序序列化。 给定树的根结点root，请返回二叉树序列化后的字符串。
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