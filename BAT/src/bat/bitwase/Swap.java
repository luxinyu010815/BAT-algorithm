package bat.bitwase;

import java.util.Arrays;

/**
 * ���дһ���㷨�������κζ��������������������ֵ�� ����һ������num�����а�������ֵ���벻���κζ����������������ֵ����������������鷵�ء� ����������
 * [1,2] ���أ�[2,1]
 * 
 * @author luxin
 *
 */
public class Swap {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 100;
		a[1] = Integer.MIN_VALUE;
		a = getSwap(a);
		System.out.println(Arrays.toString(a));
	}

	public static int[] getSwap(int[] num) {
		// write code here
		num[0] = num[0] ^ num[1];
		num[1] = num[0] ^ num[1];
		num[0] = num[0] ^ num[1];
		return num;
	}
}