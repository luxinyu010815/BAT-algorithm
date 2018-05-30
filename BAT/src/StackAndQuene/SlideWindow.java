package StackAndQuene;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlideWindow {
	public static void main(String[] args) {
		int[] arr = {357,564,212,500,96};
		int n = arr.length;
		int w = 3;
		System.out.println(Arrays.toString(slide(arr, n, w)));
	}
    public static int[] slide(int[] arr, int n, int w) {
        // write code here
    	if(n>500||w>n)return arr;
    	int[] result = new int[n-w+1];
    	Deque<Integer> deque = new LinkedList<>();
    	//int cur = w;
    	int topValue = 0;
    	/*for(int i=0;i<w;i++) {
    		
    		if(deque.size()==0) {
    			deque.offerLast(i);
    		}else {
    			topValue = arr[deque.peekLast()];
    			if(topValue<arr[i]) {
    				deque.poll();
    				deque.offerLast(i);
    			}else {
    				deque.offerLast(i);
    			}
    		}
    	}
    	result[0] = arr[deque.peekFirst()];
    	if(deque.peekFirst()==0) {
    		deque.pollFirst();
    	}
    	
    	while(cur<n) {
    		//int a = deque.peekLast();
    		while(deque.size()>0&&arr[cur]>arr[deque.peekLast()]) {
    			deque.pollLast();
    		}
    		deque.offerLast(cur);
    		result[cur-w+1] = arr[deque.peekFirst()];
    		if(deque.peekFirst()<=cur-w+1) {
    			deque.pollFirst();
    		}
    		cur++;
    	}*/
    	int cur = 0;
    	while(cur<n) {
    		while(deque.size()>0&&arr[cur]>arr[deque.peekLast()]) {
    			deque.pollLast();
    		}
    		deque.offerLast(cur);
    		if(cur>=w-1) {
    			result[cur-w+1] = arr[deque.peekFirst()];
    		}
    		if(deque.peekFirst()<=cur-w+1) deque.pollFirst();
    		cur++;
    	}
    	return result;
    }
}
