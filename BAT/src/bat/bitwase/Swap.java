package bat.bitwase;

import java.util.Arrays;

/**
 * 请编写一个算法，不用任何额外变量交换两个整数的值。 给定一个数组num，其中包含两个值，请不用任何额外变量交换这两个值，并将交换后的数组返回。 测试样例：
 * [1,2] 返回：[2,1]
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