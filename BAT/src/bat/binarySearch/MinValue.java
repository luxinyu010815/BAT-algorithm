package bat.binarySearch;

/**
 * ����һ������ѭ������arr������arr�е���Сֵ��
 * ����ѭ��������ָ����������������ⳤ�ȵĲ��ַŵ��ұ�ȥ���ұߵĲ����õ��������
 * ��������[1,2,3,3,4]��������ѭ�����飬[4,1,2,3,3]Ҳ�ǡ�
 * ��������arr�����Ĵ�Сn���뷵����Сֵ��
 * ����������
 * [4,1,2,3,3],5
 * ���أ�1
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
