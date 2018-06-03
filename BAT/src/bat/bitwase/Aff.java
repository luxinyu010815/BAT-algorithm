package bat.bitwase;

import java.util.Arrays;

/**
 * 给定一个整型数组arr，其中有两个数出现了奇数次，其他的数都出现了偶数次，找到这两个数。要求时间复杂度为O(N)，额外空间复杂度为O(1)。
 * 给定一个整形数组arr及它的大小n，请返回一个数组，其中两个元素为两个出现了奇数次的元素,请将他们按从小到大排列。 测试样例：
 * [1,2,4,4,2,1,3,5],8 返回：[3,5]
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
