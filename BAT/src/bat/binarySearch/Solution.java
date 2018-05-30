package bat.binarySearch;

/**
 * 定义局部最小的概念。arr长度为1时，arr[0]是局部最小。
 * arr的长度为N(N>1)时，如果arr[0]<arr[1]，那么arr[0]是局部最小；
 * 如果arr[N-1]<arr[N-2]，那么arr[N-1]是局部最小；
 * 如果0<i<N-1，既有arr[i]<arr[i-1]又有arr[i]<arr[i+1]，那么arr[i]是局部最小。 
 * 给定无序数组arr，已知arr中任意两个相邻的数都不相等，写一个函数，只需返回arr中任意一个局部最小出现的位置即可。
 * @author luxin
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,2,6,7,8,9,10};
		System.out.println(getLessIndex(arr));
	}
    public static int getLessIndex(int[] arr) {
    	if(arr.length<=0) return -1;
    	if(arr.length==1) return 0;
    	int length = arr.length-1;
    	if(arr[0]<arr[1]) return 0;
    	if(arr[length]<arr[length-1]) return length;
    	int start = 0;
    	int end = length;
    	int temp = 0;
    	while(start!=end) {
    		temp = start+(end-start)/2;
    		if(arr[temp]>arr[temp+1]) {
    			start = temp+1;
    		}else if(arr[temp]<arr[temp+1]&&arr[temp]<arr[temp-1]){
    			return temp;
    		}else {
    			end = temp-1;
    		}
    	}
    	return -1;
    }
}
