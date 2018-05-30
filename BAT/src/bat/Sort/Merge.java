package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(mergeAB(a, b, n, m)));
	}
	public static int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
		int index = n+m-1;
		int aLast = n-1;
		int bLast = m-1;
		while(aLast>=0&&bLast>=0&&index>=0) {
			if(A[aLast]>B[bLast]) {
				A[index] = A[aLast];
				aLast--;
			}else {
				A[index] = B[bLast];
				bLast--;
			}
			index--;
		}
		if(aLast<=0) {
			while(bLast>=0) {
				A[index] = B[bLast];
				bLast--;
				index--;
			}
		}
		
		if(bLast<=0) {
			while(aLast>=0) {
				A[index] = A[aLast];
				aLast--;
				index--;
			}
		}
		
		return A;
    }
}
