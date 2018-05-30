package bat.binarySearch;

/**
 * ����һ����������arr���ٸ���һ������num������arr���ҵ�num��������ֵ�����ߵ�λ�á�
 * ����һ������arr�����Ĵ�Сn��ͬʱ����num���뷵������λ�á�����Ԫ����������δ���֣��뷵��-1��
 * ����������
 * [1,2,3,3,4],5,3
 * ���أ�2
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
