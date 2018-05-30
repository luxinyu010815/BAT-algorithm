package bat.Sort;

import java.util.Scanner;

public class Checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(checkDuplicate(a, n));
	}
    public static boolean checkDuplicate(int[] a, int n) {
        // write code here
    	choiseSort(a, n);
    	for(int i=0;i<n-1;i++) {
    		if(a[i] == a[i+1]) {
    			return true;
    		}
    	}
    	return false;
    }
    public static void choiseSort(int[] a,int n) {
    	int index = 0;
    	int temp = 0;
    	for(int i=0;i<n;i++) {
    		index = i;
    		for(int j=i;j<n;j++) {
    			if(a[index]>a[j]) {
        			index = j;
        		}
    		}
    		temp = a[i];
    		a[i] = a[index];
    		a[index] = temp;
    	}
    }
}
