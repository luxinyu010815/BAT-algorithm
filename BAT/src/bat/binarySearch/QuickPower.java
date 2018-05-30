package bat.binarySearch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 如果更快的求一个整数k的n次方。
 * 如果两个整数相乘并得到结果的时间复杂度为O(1)，得到整数k的N次方的过程请实现时间复杂度为O(logN)的方法。
 * 给定k和n，请返回k的n次方，为了防止溢出，请返回结果Mod 1000000007的值。
 * 测试样例：
 * 2,3
 * 返回：8
 * @author luxin
 *
 */
public class QuickPower {
	public static void main(String[] args) {
		System.out.println(getPower(2,14876069));
	}
    public static int getPower(int k, int N) {
        // write code here
    	String binaryString = Integer.toBinaryString(N);
    	List<BigInteger> sum = new ArrayList<>();
    	BigInteger temp = BigInteger.valueOf(k);
    	for(int i=binaryString.length()-1;i>=0;i--) {
    		if(binaryString.charAt(i)=='1') {
    			sum.add(temp);
    		}
    		temp = temp.multiply(temp);
    	}
    	
    	BigInteger result = BigInteger.valueOf(1);
    	for (BigInteger i : sum) {
			result = result.multiply(i);
		}
    	
    	return result.mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
