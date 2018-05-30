package bat.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ���õݹ鷽ʽʵ�ֶ���������������ͺ���ı�����ӡ��
 * ����һ���������ĸ����root�������η��ض���������������ͺ�������(��ά�������ʽ)��
 * @author luxin
 *
 */
public class TreeToSequence {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		for (int[] s : convert(root)) {
			Arrays.toString(s);
		}
	}
    public static int[][] convert(TreeNode root) {
        // write code here
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
    
    public static List<Integer> getBeforeSequence(TreeNode root,List<Integer> result){
    	if(root==null) return null;
    	result.add(root.val);
    	getBeforeSequence(root.left, result);
    	getBeforeSequence(root.right, result);
    	return result;
    }
    
    public static List<Integer> getMidSequence(TreeNode root,List<Integer> result){
    	if(root==null) return null;
    	getMidSequence(root.left, result);
    	result.add(root.val);
    	getMidSequence(root.right, result);
    	return result;
    }
    
    public static List<Integer> getAfterSequence(TreeNode root,List<Integer> result){
    	if(root==null) return null;
    	getAfterSequence(root.left, result);
    	
    	getAfterSequence(root.right, result);
    	result.add(root.val);
    	return result;
    }
}
