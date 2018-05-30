package StackAndQuene;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution stack = new Solution();
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.pop();
		System.out.println(stack.min());
		System.out.println(stack);
	}
	@Override
	public String toString() {
		return "Solution [StackData=" + Arrays.toString(StackData) + ", StackMin=" + Arrays.toString(StackMin)
				+ ", dataIndex=" + dataIndex + ", minIndex=" + minIndex + "]";
	}
	private int[] StackData = new int[10];
	private int[] StackMin = new int[10];
	private double sizePa = 0.75;
	private int dataIndex = 0;
	private int minIndex = 0;
    
    public void push(int node) {
        if(dataIndex>StackData.length*0.75) {
        	int[] temp = new int[StackData.length*2];
        	for(int i=0;i<StackData.length;i++) {
        		temp[i] = StackData[i];
        	}
        	StackData = temp;
        	temp = new int[StackData.length*2];
        	for(int i=0;i<StackMin.length;i++) {
        		temp[i] = StackMin[i];
        	}
        	StackMin = temp;
        }
        
        StackData[dataIndex++] = node;
        if(minIndex==0) {
        	StackMin[minIndex++]=node;
        }else if(node>StackMin[(minIndex-1)]) {
        	StackMin[minIndex]=StackMin[(minIndex-1)];
        	minIndex++;
        }else {
        	StackMin[minIndex++] = node;
        }
    }
    
    public void pop() {
        StackData[--dataIndex] = 0;
        StackMin[--minIndex] = 0;
    }
    
    public int top() {
        return StackData[(dataIndex-1)];
    }
    
    public int min() {
        return StackMin[(minIndex-1)];
    }
}
