package bat.Tree;

/**
 * �Ӷ������Ľڵ�A�������������ϻ��������ߣ�����;�Ľڵ�ֻ�ܾ���һ�Σ�������ڵ�Bʱ��·���ϵĽڵ�������A��B�ľ��롣
 * ���ڸ�����һ�ö����������������Ͻڵ��������롣
 * ����һ����������ͷ���root���뷵�������롣��֤�������ڵ���2С�ڵ���500.
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
