package bat.Tree;

/**
 * ��һ�ö������������һ���㷨�ж���ö������Ƿ�Ϊƽ���������
 * �����������ĸ����root���뷵��һ��boolֵ������������Ƿ�Ϊƽ���������
 * @author luxin
 *
 */
public class CheckBalance {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(132);
		root.left = new TreeNode(11);
		//root.right = new TreeNode(375);
		root.left.left = new TreeNode(625);
		root.left.right = new TreeNode(225);
		//root.right.left = new TreeNode(416);
		System.out.println(check(root));
	}
    public static boolean check(TreeNode root) {
        // write code here
    	boolean[] flag = new boolean[1];
    	flag[0] = true;
    	int deep = getHight(root, flag);
    	return flag[0];
    }
    
    public static int getHight(TreeNode head,boolean[] flag) {
    	if(head==null) return 0;
    	int left = getHight(head.left, flag);
    	if(!flag[0]) return -1;
    	int right = getHight(head.right, flag);
    	if(Math.abs(left-right)>1) {
    		flag[0] = false;
    		return -1;
    	}else {
    		return Math.max(left, right)+1;
    	}
    }
}
