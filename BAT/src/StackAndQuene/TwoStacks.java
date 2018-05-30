package StackAndQuene;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoStacks {
	public static void main(String[] args) {
		//int[] a = {1,33333,7,11111111,2,5,4,1};
		//System.out.println(twoStacksSort(a).toString());
		Scanner sc = new Scanner(System.in);
		String line  = sc.next();
		String string = line.substring(1,line.length()-1);
		String[] split = string.split(",");
		int[] a = new int[split.length];
		for(int i=0;i<split.length;i++) {
			a[i] = Integer.parseInt(split[i]);
		}
		System.out.println(twoStacksSort(a).toString());
	}
	public static ArrayList<Integer> twoStacksSort(int[] numbers) {
		// write code here
		int[] help = new int[numbers.length];
		int helpIndex = numbers.length - 1;
		int numbersIndex = 0;
		int temp = 0;
		while (numbersIndex < numbers.length){
			int key = numbers[numbersIndex++];
			if (helpIndex == numbers.length - 1) {
				help[helpIndex--] = key;
			} else if (key >= help[helpIndex + 1]) {
				help[helpIndex--] = key;
			} else if (key < help[helpIndex + 1]) {
				temp = key;
				while(helpIndex<help.length-1&&temp<help[helpIndex+1]&&helpIndex>=0) {
					numbers[--numbersIndex]=help[++helpIndex];
				}
				help[helpIndex--]=temp;
			}
		}
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			result.add(help[i]);
		}
		return result;
	}
}
