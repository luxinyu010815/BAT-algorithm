package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(countingSort(a, n)));
	}
    public static int[] countingSort(int[] A, int n) {
        // write code here
    	int maxValue = Integer.MIN_VALUE;
    	int minValue = Integer.MAX_VALUE;
    	for(int i=0;i<n;i++) {
    		minValue = Math.min(minValue, A[i]);
    		maxValue = Math.max(maxValue, A[i]);
    	}
    	int[] a = new int[maxValue-minValue+1];
    	for(int i=0;i<n;i++) {
    		a[A[i]-minValue]++;
    	}
    	int index = 0;
    	for(int i=0;i<a.length;i++) {
    		/*if(a[i]!=0) {
    			A[index] = i+minValue;
    			index++;
    		}*/
    		while(a[i]>0) {
    			A[index] = i+minValue;
    			index++;
    			a[i]--;
    		}
    	}
    	return A;
    }
}
