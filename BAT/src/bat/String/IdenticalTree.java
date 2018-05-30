package bat.String;

import org.junit.Test;

public class IdenticalTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(7);
		System.out.println(buildString(root));
	}
    public boolean chkIdentical(TreeNode A, TreeNode B) {
        // write code here
    	String str1 = buildString(A);
    	String str2  =buildString(B);
    	boolean flag = true;
    	if(str1.indexOf(str2)==-1) {
    		flag = false;
    	}
    	return flag;
    }
    
    @Test
    public static String buildString(TreeNode a) {
    	StringBuilder str = new StringBuilder();
    	if(a==null) return "#!";
    	str.append(a.val+"!");
    	str.append(buildString(a.left));
    	str.append(buildString(a.right));
    	return str.toString();
    }
}
