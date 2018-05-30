package bat.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 有一棵二叉树,请设计一个算法判断它是否是完全二叉树。
 * 给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。树的结点个数小于等于500。
 * @author luxin
 *
 */
public class CheckCompletion {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(132);
		root.left = new TreeNode(11);
		root.right = new TreeNode(375);
		root.left.left = new TreeNode(625);
		root.left.right = new TreeNode(225);
		root.right.left = new TreeNode(416);
		System.out.println(chk(root));
	}
    public static boolean chk(TreeNode root) {
        // write code here
    	TreeNode last = root;
    	TreeNode cur = root;
    	TreeNode nLast = null;
    	boolean flag = true;
    	Queue<TreeNode> queue = new ArrayDeque<>();
    	queue.add(root);
    	while(queue.size()>0) {
    		cur = queue.remove();
    		if(cur==last) {
    			last = nLast;
    			flag = true;
    		}
    		if(flag) {
    			if(cur.left==null&&cur.right!=null) {
        			return false;
        		}
        		if(cur.left!=null) {
        			queue.add(cur.left);
        			nLast = cur.left;
        		}else {
        			flag = false;
        		}
        		
        		if(cur.right!=null) {
        			queue.add(cur.right);
        			nLast = cur.right;
        		}else {
        			flag = false;
        		}
    		}else {
    			if(cur.left==null&&cur.right==null) {
    				continue;
    			}else {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}

