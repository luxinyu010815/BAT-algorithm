package bat.binarySearch;

/**
 * 对于一个有序循环数组arr，返回arr中的最小值。
 * 有序循环数组是指，有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。
 * 比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
 * 给定数组arr及它的大小n，请返回最小值。
 * 测试样例：
 * [4,1,2,3,3],5
 * 返回：1
 * @author luxin
 *
 */
public class MinValue {
	public static void main(String[] args) {
		int[] arr = {4,9,2,3,3};
		System.out.println(getMin(arr, 5));
	}
    public static int getMin(int[] arr, int n) {
        // write code here
    	if(arr[0]<arr[n-1]) return arr[0];
    	int start = 0;
    	int end = n-1;
    	int temp = -1;
    	while(start<=end) {
    		if(start==end-1) break;
    		temp = start+(end-start)/2;
    		if(arr[start]>arr[temp]) {
    			end = temp;
    		}else if(arr[temp]>arr[end]) {
    			start = temp;
    		}else {
    			int min = Integer.MAX_VALUE;
    			for(int i=start;i<end;i++) {
    				min = Math.min(min, arr[i]);
    			}
    			return min;
    		}
    	}
    	return Math.min(arr[start], arr[end]);
    }
}
