package bat.Tree;

/**
 * ��һ�ö��������������нڵ��ֵ����һ��,�ҵ����нڵ���� ��������������,���������������ͷ�ڵ�.
 * ������������ͷ���root���뷵�������ͷ���,�����ֶ���ڵ���������������ͷ���Ȩֵ���ġ�
 * 
 * @author luxin
 *
 */
public class MaxSubtree {
	private TreeNode head = null;
	private int num = 0;
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
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
		TreeNode re = getMax(root);
		System.out.println(re.val);
	}
	public static TreeNode getMax(TreeNode root) {
		// write code here
		Object[] result = getResult(root);
		return (TreeNode)result[0];
	}

	private static Object[] getResult(TreeNode root) {
		// TODO Auto-generated method stub
		Object[] result = new Object[4];
		if(root==null) {
			//ͷ�ڵ�
			result[0] = null;
			//�ڵ���
			result[1] = 0;
			//���ֵ
			result[2] = Integer.MIN_VALUE;
			//��Сֵ
			result[3] = Integer.MAX_VALUE;
			return result;
		}
		
		Object[] resultL = getResult(root.left);
		Object[] resultR = getResult(root.right);
		if(resultL[0]==root.left&&resultR[0]==root.right&&root.val>(Integer)resultL[2]
				&&root.val<(Integer)resultR[3]) {
			result[0] = root;
			result[1] = (Integer)resultL[1]+(Integer)resultR[1]+1;
			if(root.left==null&&root.right==null) {
				result[2] = root.val;
				result[3] = root.val;
			}else {
				result[2] = Math.max((int) resultR[2],root.val);
				result[3] = resultL[3];
			}
		}else {
			result = (Integer)resultL[1]>(Integer)resultR[1]?resultL:resultR;
		}
		return result;
	}
}
