package bat.bitwase;

/**
 * ��һ����������A������ֻ��һ���������������Σ�����������������ż���Σ����ӡ�������Ҫ��ʱ�临�Ӷ�ΪO(N)������ռ临�Ӷ�ΪO(1)��
 * ������������A�����Ĵ�Сn���뷵����Ŀ�������֡�
 * ����������
 * [1,2,3,2,1],5
 * ���أ�3
 * @author luxin
 *
 */
public class OddAppearance {
	public static void main(String[] args) {
		int[] A = {1,2,3,2,1};
		System.out.println(findOdd(A, 5));
	}
    public static int findOdd(int[] A, int n) {
        // write code here
    	int result = 0;
    	for (int i : A) {
			result = result^i;
		}
    	return result;
    }
}
