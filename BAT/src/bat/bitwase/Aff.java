package bat.bitwase;

import java.util.Arrays;

/**
 * ����һ����������arr�������������������������Σ�����������������ż���Σ��ҵ�����������Ҫ��ʱ�临�Ӷ�ΪO(N)������ռ临�Ӷ�ΪO(1)��
 * ����һ����������arr�����Ĵ�Сn���뷵��һ�����飬��������Ԫ��Ϊ���������������ε�Ԫ��,�뽫���ǰ���С�������С� ����������
 * [1,2,4,4,2,1,3,5],8 ���أ�[3,5]
 * 
 * @author luxin
 *
 */
public class Aff {
	public static void main(String[] args) {
		int[] arr = {1,2,4,4,2,1,3,5};
		System.out.println(Arrays.toString(findOdds(arr, 8)));
	}
	public static int[] findOdds(int[] arr, int n) {
		// write code here
		int eo = 0;
		for (int i : arr) {
			eo = eo ^ i;
		}
		int num=1;
		//System.out.println(Integer.valueOf(eo&num));
		System.out.println((eo&num)==0);
		while((eo&num)==0) {
			num = num<<1;
		}
		int eos = 0;
		for (int i : arr) {
			if((i&num)==num) {
				eos  =eos^i;
			}
		}
		int[] result = new int[2];
		result[0] = eos;
		result[1] = eos^eo;
		Arrays.sort(result);
		return result;
	}
}
