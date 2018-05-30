package bat.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，使得这棵二叉树不再是搜索二叉树，
 * 请找到这两个错误节点并返回他们的值。保证二叉树中结点的值各不相同。 给定一棵树的根结点，请返回两个调换了位置的值，其中小的值在前。
 * 
 * @author luxin
 *
 */
public class FindErrorNode {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(7);
		root.right.right = new TreeNode(9);
		root.right.left = new TreeNode(6);
		System.out.println(Arrays.toString(findError(root)));
	}
	public static int[] findError(TreeNode root) {
		// write code here
		List<Integer> list = new ArrayList<>();
		int[] result = new int[2];
		result[0] = Integer.MIN_VALUE;
		result[1] = Integer.MIN_VALUE;
		getIntArray(root, list);
		int j = 0;
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) < list.get(i - 1)) {
				if(j==0) {
					result[j] = i;
				}else {
					result[j] = i-1;
				}
				j++;
			}
		}
		if (j <= 1) {
			result[1] = list.get(result[0] - 1);
			result[0] = list.get(result[0]);
		} else {
			result[0] = list.get(result[0]);
			result[1] = list.get(result[1]);
		}

		return result;
	}

	private static void getIntArray(TreeNode root, List<Integer> list) {
		// TODO Auto-generated method stub
		if(root==null) return;
		getIntArray(root.left, list);
		list.add(root.val);
		getIntArray(root.right, list);
	}
}
