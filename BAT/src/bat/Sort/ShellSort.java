package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(shellSort(a, n)));
		//System.out.println(Arrays.toString(insertSort(a, 1)));
	}
    public static int[] shellSort(int[] A, int n) {
        // write code here
    	int stemp = n/2;
    	while(stemp>=1) {
    		insertSort(A, stemp);
    		stemp/=2;
    	}
    	return A;
    }
    public static int[] insertSort(int[] a,int stemp) {
    	int currentIndex = 0;
    	int nextIndex = 0;
    	int ext = 0;
    	for(int i=stemp;i<a.length;i++) {
    		currentIndex = i;
    		nextIndex = currentIndex-stemp;
    		while(nextIndex>=0) {
    			ext = 0;
    			if(a[currentIndex]<a[nextIndex]) {
    				ext = a[currentIndex];
    				a[currentIndex] = a[nextIndex];
    				a[nextIndex] = ext;
    				currentIndex = nextIndex;
    			}else {
    				nextIndex-=stemp;
    			}
    		}
    	}
    	
    	return a;
    }
}