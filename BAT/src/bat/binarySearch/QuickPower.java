package bat.binarySearch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * ����������һ������k��n�η���
 * �������������˲��õ������ʱ�临�Ӷ�ΪO(1)���õ�����k��N�η��Ĺ�����ʵ��ʱ�临�Ӷ�ΪO(logN)�ķ�����
 * ����k��n���뷵��k��n�η���Ϊ�˷�ֹ������뷵�ؽ��Mod 1000000007��ֵ��
 * ����������
 * 2,3
 * ���أ�8
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
