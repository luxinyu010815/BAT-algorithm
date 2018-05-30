package bat.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(new MergeSort().mergeSort(a,n)));
	}
    public int[] mergeSort(int[] A, int n) {
        // write code here
    	if(A.length<2) return A;
    	getResult(A,0,n-1);
    	return A;
    }
    
    public void getResult(int[] arr,int left,int right) {
    	if(left>=right) return;
    	int mid = (left+right)/2;
    	getResult(arr,left,mid);
    	getResult(arr,mid+1,right);
    	merge(arr,left,mid,right);
    }
    
    public void merge(int[] arr,int left,int mid,int right) {
    	int[] help = new int[right-left+1];
    	/*if(right-left<2) {
    		int inter = 0;
    		if(arr[left]>arr[right]) {
    			inter = arr[left];
    			arr[left] = arr[right];
    			arr[right] = arr[left];
    		}
    		return;
    	}*/
    	int first = left;
    	int second = mid+1;
    	for(int i=0;i<help.length;i++) {
    		if(first>mid) {
    			help[i] = arr[second++];
    			continue;
    		}
    		if(second>right) {
    			help[i] = arr[first++];
    			continue;
    		}
    		if(arr[first]<=arr[second]) {
    			help[i] = arr[first];
    			first++;
    		}else if(arr[first]>arr[second]){
    			help[i] = arr[second];
    			second++;
    		}
    	}
    	
    	for(int i=0;i<help.length;i++) {
    		arr[left+i] = help[i];
    	}
    }
}
