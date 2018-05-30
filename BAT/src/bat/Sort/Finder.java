package bat.Sort;

import java.util.Scanner;

public class Finder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] mat = new int[n][m];
		int x = scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		System.out.println(findX(mat, n, m, x));
	}
	public static boolean findX(int[][] mat, int n, int m, int x) {
        // write code here
		int i=0;
		int j=m-1;
		boolean flag = false;
		while(i>=0&&i<n&&j>=0&&j<m) {
			if(x==mat[i][j]) {
				return true;
			}else if(x>mat[i][j]) {
				i++;
			}else {
				j--;
			}
		}
		return flag;
    }
}
