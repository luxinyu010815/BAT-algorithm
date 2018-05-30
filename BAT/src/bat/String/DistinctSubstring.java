package bat.String;

import java.util.HashMap;
import java.util.Map;

public class DistinctSubstring {
	public static void main(String[] args) {
		System.out.println(longestSubstring("aaaaa",5));
	}
    public static int longestSubstring(String A, int n) {
        // write code here
    	Map<Character,Integer> map = new HashMap<>();
    	int pre =0;
    	int maxValue = 0;
    	char currentChar = ' ';
    	int preIndex=0;
    	Integer beforIndex=0;
    	for(int i=0;i<n;i++) {
    		currentChar = A.charAt(i);
    		preIndex = i-pre;
    		beforIndex = map.get(currentChar);
    		if(beforIndex==null) {
    			beforIndex=0;
    			map.put(currentChar, i);
    		}else {
    			beforIndex++;
    			map.put(currentChar, i);
    		}
    		if(preIndex>=beforIndex) {
    			pre++;
			}else if(preIndex<beforIndex){
				pre=i-beforIndex+1;
			}
    		
    		maxValue = Math.max(maxValue, pre);
    	}
    	return maxValue;
    }
}
