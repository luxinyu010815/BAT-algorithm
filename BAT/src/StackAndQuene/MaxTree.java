package StackAndQuene;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaxTree {
	public static void main(String[] args) {
		int[] A = { 3, 1, 4, 2 };
		int n = 4;
		System.out.println(Arrays.toString(buildMaxTree(A, n)));
	}

	public static int[] buildMaxTree(int[] A, int n) {
		// write code here
		Stack<Integer> leftStack = new Stack<>();
		Stack<Integer> rightStack = new Stack<>();
		Map<Integer, Integer> leftMax = new HashMap<>();
		Map<Integer, Integer> rightMax = new HashMap<>();
		for (int i = 0,j=n-1; i < n; i++,j--) {
			//求数左最大数
			/*if (leftStack.size() == 0)
				leftStack.push(A[i]);*/
			while (leftStack.size() > 0 && A[i] > A[leftStack.peek()]) {
				leftStack.pop();
			}
			if (leftStack.size() > 0) {
				leftMax.put(A[i], leftStack.peek());
			}
			leftStack.push(i);
			//求数右最大数
			//if(rightStack.size()==0) rightStack.push(A[j]);
			while(rightStack.size()>0&&A[j]>A[rightStack.peek()]) {
				rightStack.pop();
			}
			
			if(rightStack.size()>0) {
				rightMax.put(A[j], rightStack.peek());
			}
			rightStack.push(j);
		}
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			if(leftMax.get(A[i])==null&&rightMax.get(A[i])==null) {
				result[i] = -1;
			}else if((leftMax.get(A[i])==null&& rightMax.get(A[i])!=null)) {
				result[i] = rightMax.get(A[i]);
			}else if(leftMax.get(A[i])!=null&&rightMax.get(A[i])==null) {
				result[i] = leftMax.get(A[i]);
			}else if(A[leftMax.get(A[i])]>A[rightMax.get(A[i])]) {
				result[i] = rightMax.get(A[i]);
			}else {
				result[i] = leftMax.get(A[i]);
			}
		}
		return result;
	}
}
