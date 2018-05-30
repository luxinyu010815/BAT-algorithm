package bat.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		System.err.println(Arrays.toString(radixSort(A, n)));
	}
	public static int[] radixSort(int[] A, int n) {
        // write code here
		ArrayList<Integer> aList = new ArrayList<>(10);
		int index = 1;
		String num = "";
		for(int i=0;i<n;i++) {
			num = "0";
			//aList.add(String.valueOf(A[i]).charAt(index), index);
		}
		return A;
    }
}
