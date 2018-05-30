package com.luxinyu.Search;

public class Search {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int target = 4;
		System.out.println(binarySearch(a, target));
	}
	
	public static int binarySearch(int[] a,int target) {
		int start = 0;
		int end = a.length-1;
		int current = (start+end)/2;
		while(start<=end) {
			if(target==a[current]) {
				return current;
			}else if(target<a[current]) {
				end = current-1;
			}else {
				start = current+1;
			}
			
			current = (start+end)/2;
		}
		
		return -1;
	}
}
