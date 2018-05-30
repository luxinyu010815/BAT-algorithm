package bat.binarySearch;

/**
 * ��һ����������arr�����в������ظ�Ԫ�أ����ҵ�����arr[i]==i�����������λ�á�
 * �������λ���ϵ���������������������-1��
 * ������������arr�����Ĵ�Сn���뷵������ֵ��
 * ����������
 * [-1,0,2,3],4
 * ���أ�2
 * @author luxin
 *
 */
public class Find {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3};
		System.out.println(findPos(arr, 4));
	}
    public static int findPos(int[] arr, int n) {
        // write code here
    	if(arr[0]>n-1) return -1;
    	if(arr[n-1]<0) return -1;
    	int start = 0;
    	int end = n-1;
    	int temp = -1;
    	int result = -1;
    	while(start<=end) {
    		temp=start+(end-start)/2;
    		if(arr[temp]==temp) {
    			result=temp;
    			end = temp-1;
    		}else if(arr[temp]>temp) {
    			end = temp-1;
    		}else {
    			start = temp+1;
    		}
    	}
    	return result;
    }
}
