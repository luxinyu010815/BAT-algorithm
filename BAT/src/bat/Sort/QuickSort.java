package bat.Sort;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class QuickSort {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(quickSort(a,n)));
	}
	public static int[] quickSort(int[] A, int n) {
        // write code here
        getResult(A,0,A.length-1);
        return A;
    }
    public static void getResult(int[] a,int first,int last){
        int temp = a[first];
        int start = first;
        int end = last;
        if(first<end){
        	while(first<last){
                while(a[last]>=temp&&last>first){
                    last--;
                }
                if(first==last){
                	break;
                }
                a[first] = a[last];
                first++;
                while(a[first]<temp&&first<last){
                    first++;
                }
                if(first==last){
                	break;
                }
                a[last] = a[first];
                last--;
            }
        	a[first] = temp;
        	if(start<first-1)getResult(a,start,first-1);
            if(first+1<end)getResult(a,first+1,end);
        }
        
    }
    @Test
    public void test1(){
    	int[] a = {1,2,3,4,5};
    	System.out.println(Arrays.toString(a));
    }
}
