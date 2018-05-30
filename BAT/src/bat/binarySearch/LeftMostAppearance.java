package bat.binarySearch;

/**
 * 对于一个有序数组arr，再给定一个整数num，请在arr中找到num这个数出现的最左边的位置。
 * 给定一个数组arr及它的大小n，同时给定num。请返回所求位置。若该元素在数组中未出现，请返回-1。
 * 测试样例：
 * [1,2,3,3,4],5,3
 * 返回：2
 * @author luxin
 *
 */
public class LeftMostAppearance {
	public static void main(String[] args) {
		int[] arr = {36,62,146,208,210,369,616};
		System.out.println(findPos(arr, arr.length, 616));
	}
    public static int findPos(int[] arr, int n, int num) {
        // write code here
    	if(n<=0) return -1;
    	if(n==1&&arr[0]==num) {
    		return 0;
    	}else if(n==1&&arr[0]!=num){
    		return -1;
    	}
    	int result = 0;
    	int start = 0;
    	int end = n-1;
    	int temp = 0;
    	while(start<=end) {
    		temp = start+(end-start)/2;
    		if(arr[temp]<num) {
    			start = temp+1;
    		}else if(arr[temp]>num){
    			end = temp-1;
    		}else {
    			result = temp;
    			end = temp-1;
    		}
    	}
    	return result;
    }
}
