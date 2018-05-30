package bat.Sort;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Gap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(maxGap(A, n));
	}
	public static int maxGap(int[] A, int n) {
        // write code here
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			maxValue = Math.max(maxValue, A[i]);
			minValue = Math.min(minValue, A[i]);
		}
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for(int i=0;i<n;i++) {
			if(treeMap.get(A[i])==null) {
				treeMap.put(A[i], 1);
			}else {
				treeMap.put(A[i], treeMap.get(A[i]+1));
			}
		}
		int maxResult = 0;
		int currengtResult = 0;
		for(int i=minValue;i<=maxValue;i++) {
			if(treeMap.get(i)==null) {
				currengtResult++;
			}else {
				maxResult = Math.max(maxResult, currengtResult);
				currengtResult = 0;
			}
		}
		return maxResult+1;
    }
}
