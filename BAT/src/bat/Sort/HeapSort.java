package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(heapSort(a, n)));
	}
    public static int[] heapSort(int[] A, int n) {
        // write code here
    	int temp = 0;
    	for(int i = n-1;i>=0;i--) {
    		adjustHeap(A, 0, i);
    		temp = A[i];
    		A[i] = A[0];
    		A[0] = temp;
    	}
    	return A;
    }
    
    public static void adjustHeap(int[] a,int current,int last) {
    	/*if(index!=current) {
    		adjustHeap(a, index, last);
    	}*/
    	int leftIndex = current*2+1;
    	int rightIndex = current*2+2;
    	if(rightIndex<=last&&leftIndex<=last) {
    		adjustHeap(a, leftIndex, last);
        	adjustHeap(a, rightIndex, last);
    	}else if(leftIndex<=last&&rightIndex>last) {
    		adjustHeap(a, leftIndex, last);
    	}
    	int index = move(a, current, last);
    }
    
    public static int move(int[] a,int current,int last) {
    	int temp = 0;
    	int exchangeIndex = current;
    	int leftIndex = current*2+1;
    	int rightIndex = current*2+2;
    	if(rightIndex<=last&&leftIndex<=last) {
    		if(a[rightIndex]<a[leftIndex]) {
    			if(a[leftIndex]>a[current]) {
    				temp = a[current];
    				a[current] = a[leftIndex];
    				a[leftIndex] = temp;
    				exchangeIndex = leftIndex;
    			}
    		}else {
    			if(a[rightIndex]>a[current]) {
    				temp = a[current];
    				a[current] = a[rightIndex];
    				a[rightIndex] = temp;
    				exchangeIndex = rightIndex;
    			}
    		}
    	}else if(leftIndex<=last&&rightIndex>last) {
    		if(a[leftIndex]>a[current]) {
    			temp = a[current];
    			a[current] = a[leftIndex];
    			a[leftIndex] = temp;
    			exchangeIndex = leftIndex;
    		}
    	}
    	
    	return exchangeIndex;
    }
}
