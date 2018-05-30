package bat.Sort;

import java.util.Scanner;

public class SubSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(shortestSubsequence(A, n));
	}
	public static int shortestSubsequence(int[] A, int n) {
        // write code here
		return n;
    }
}
