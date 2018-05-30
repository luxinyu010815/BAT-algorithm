package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sortElement(A, n, k)));
	}
	public static int[] sortElement(int[] A, int n, int k) {
        // write code here
		for(int i=0;i+k<n;i++) {
			adjustHeap(A, i,i+k);
		}
		return A;
    }
	
	public static void adjustHeap(int[] a,int start,int last) {
		int indexLeft = start+1;
		int indexRight = start+2;
		if(indexLeft<=last-start && indexRight<=last-start) {
			adjustHeap(a, indexRight, last);
			adjustHeap(a, indexRight, last);
		}else if(indexLeft<=last-start&& indexRight>last-start) {
			adjustHeap(a, indexLeft, last);
		}
		move(a, start, last);
	}
	public static void move(int[] a,int index,int last) {
		int indexLeft = index+1;
		int indexRight = index+2;
		int temp = 0;
		if(indexLeft<=last-index&&indexRight<=last-index) {
			if(a[indexLeft]<a[indexRight]) {
				if(a[index]>a[indexLeft]) {
					temp = a[index];
					a[index] = a[indexLeft];
					a[indexLeft]= temp;
				}
			}else {
				if(a[index]>a[indexRight]) {
					temp = a[index];
					a[index] = a[indexRight];
					a[indexRight]= temp;
				}
			}
		}else if(indexLeft<=last-index&&indexRight>last-index) {
			if(a[index]>a[indexLeft]) {
				temp = a[index];
				a[index] = a[indexLeft];
				a[indexLeft] = temp;
			}
		}
	}
}
