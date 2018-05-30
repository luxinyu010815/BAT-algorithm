package bat.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * һ�ö�����ԭ�������������������������������ڵ������λ�ã�ʹ����ö�����������������������
 * ���ҵ�����������ڵ㲢�������ǵ�ֵ����֤�������н���ֵ������ͬ�� ����һ�����ĸ���㣬�뷵������������λ�õ�ֵ������С��ֵ��ǰ��
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
