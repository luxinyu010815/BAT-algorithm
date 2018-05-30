package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeColor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sortThreeColor(a, n)));
	}
	public static int[] sortThreeColor(int[] A, int n) {
        // write code here
		int first = 0;
		int last = n-1;
		int temp = 0;
		for(int i=0;i<n&&i<=last;i++) {
			if(A[i] == 0) {
				temp = A[first];
				A[first] = A[i];
				A[i] = temp;
				first++;
			}else if(A[i]==2) {
				temp = A[last];
				A[last] = A[i];
				A[i] = temp;
				last--;
				i--;
			}
		}
		
		return A;
    }
}
