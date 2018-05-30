package bat.binarySearch;

/**
 * ����ֲ���С�ĸ��arr����Ϊ1ʱ��arr[0]�Ǿֲ���С��
 * arr�ĳ���ΪN(N>1)ʱ�����arr[0]<arr[1]����ôarr[0]�Ǿֲ���С��
 * ���arr[N-1]<arr[N-2]����ôarr[N-1]�Ǿֲ���С��
 * ���0<i<N-1������arr[i]<arr[i-1]����arr[i]<arr[i+1]����ôarr[i]�Ǿֲ���С�� 
 * ������������arr����֪arr�������������ڵ���������ȣ�дһ��������ֻ�践��arr������һ���ֲ���С���ֵ�λ�ü��ɡ�
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
