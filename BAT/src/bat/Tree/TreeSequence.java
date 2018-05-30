package bat.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 请用非递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 * @author luxin
 *
 */
public class TreeSequence {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(132);
		root.left = new TreeNode(11);
		root.right = new TreeNode(375);
		root.left.left = new TreeNode(625);
		root.left.right = new TreeNode(225);
		root.right.left = new TreeNode(416);
		for (int[] s : convert(root)) {
			System.out.println(Arrays.toString(s));
		}
	}
	public static int[][] convert(TreeNode root) {
        // write code here
		//[[132,11,625,225,375,416],[625,11,225,132,416,375],[625,225,11,416,375,132]]
		int[][] a = new int[3][];
    	List<Integer> result = new ArrayList<>();
    	result = getBeforeSequence(root,result);
    	int[] before = new int[result.size()];
    	int[] mid = new int[result.size()];
    	int[] after = new int[result.size()];
    	int j = 0;
    	for (int i : result) {
			before[j] = i;
			j++;
		}
    	a[0] = before;
    	j = 0;
    	result.clear();
    	result = getMidSequence(root, result);
    	for (int i : result) {
			mid[j] = i;
			j++;
		}
    	a[1] = mid;
    	j = 0;
    	result.clear();
    	result = getAfterSequence(root, result);
    	for (int i : result) {
			after[j] = i;
			j++;
		}
    	a[2] = after;
    	return a;
    }

	private static List<Integer> getAfterSequence(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		TreeNode h = root;
		TreeNode c = null;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(h);
		while(stack.size()>0) {
			c = stack.peek();
			if(c.left!=null&&h!=c.left&&h!=c.right) {
				stack.push(c.left);
			}else if(c.right!=null&&c.right!=h){
				stack.push(c.right);
			}else {
				h = stack.pop();
				result.add(h.val);
			}
		}
		return result;
	}

	private static List<Integer> getMidSequence(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		TreeNode cur = root;
		TreeNode node = null;
		Stack<TreeNode> stack = new Stack<>();
		while(cur!=null||stack.size()>0) {
			while(cur!=null) {
				stack.push(cur);
				cur = cur.left;
			}
			//result.add(cur.val);
			if(stack.size()>0) {
				node = stack.pop();
			}else {
				return result;
			}
			result.add(node.val);
			cur = node.right;
		}
		return result;
	}

	private static List<Integer> getBeforeSequence(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		TreeNode cur = root;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(cur);
		while(stack.size()!=0) {
			cur = stack.pop();
			result.add(cur.val);
			if(cur.right!=null) stack.push(cur.right);
			if(cur.left!=null) stack.push(cur.left);
		}
		return result;
	}
}
