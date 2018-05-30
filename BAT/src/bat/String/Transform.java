package bat.String;

import java.util.HashMap;
import java.util.Set;

public class Transform {
	
	
	public static void main(String[] args) {
		System.out.println(chkTransform("aba", 3, "abc", 3));
		System.out.println(chkTransform("aba", 3, "baa", 3));
		System.out.println(chkTransform("aba", 3, "abcd", 4));
	}
    public static boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
    	if(lena!=lenb) return false;
    	char[] aArr = A.toCharArray();
    	char[] bArr = B.toCharArray();
    	HashMap<Character,Integer> aMap = new HashMap<>();
    	HashMap<Character,Integer> bMap = new HashMap<>();
    	for(int i=0;i<lena;i++) {
    		if(aMap.get(aArr[i])!=null) {
    			aMap.put(aArr[i], aMap.get(aArr[i])+1);
    		}else {
    			aMap.put(aArr[i], 1);
    		}
    	}
    	for(int i=0;i<lenb;i++) {
    		if(bMap.get(bArr[i])!=null) {
    			bMap.put(bArr[i], bMap.get(bArr[i])+1);
    		}else {
    			bMap.put(bArr[i], 1);
    		}
    	}
    	
    	Set< Character> aKey = aMap.keySet();
    	for (Character key : aKey) {
			if(aMap.get(key)==bMap.get(key)) {
				bMap.remove(key);
			}else {
				return false;
			}
		}
    	if(bMap.size()!=0) {
    		return false;
    	}else{
    		return true;
    	}
    }
}
