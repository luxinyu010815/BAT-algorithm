package bat.Tree;

/**
 * 从二叉树的节点A出发，可以向上或者向下走，但沿途的节点只能经过一次，当到达节点B时，路径上的节点数叫作A到B的距离。
 * 对于给定的一棵二叉树，求整棵树上节点间的最大距离。
 * 给定一个二叉树的头结点root，请返回最大距离。保证点数大于等于2小于等于500.
 * @author luxin
 *
 */
public class LongestDistance {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(3);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(4);
		root.left.right.right = new TreeNode(6);
		root.right.left = new TreeNode(8);
		int re = findLongest(root);
		System.out.println(re);
	}
    public static int findLongest(TreeNode root) {
        // write code here
    	int[] a = new int[2];
    	int[] result = getResult(root);
    	return result[0];
    }

	private static int[] getResult(TreeNode root) {
		// TODO Auto-generated method stubre
		int[] result = new int[2];
		if(root==null) {
			result[0] = 0;
			result[1] = 0;
			return result;
		}
		
		int[] resultL = getResult(root.left);
		int[] resultR = getResult(root.right);
		int temp = resultL[1]+resultR[1]+1;
		if(temp>resultL[0]&&temp>resultR[0]) {
			result[0] = temp;
		}else {
			result[0] = resultL[0]>resultR[0]?resultL[0]:resultR[0];
		}
		result[1] = resultL[1]>resultR[1]?resultL[1]+1:resultR[1]+1;
		return result;
	}
}
