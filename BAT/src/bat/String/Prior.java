package bat.String;

public class Prior {
	public static void main(String[] args) {
		String[] strs = {"kid","yqt","i","k"};
		System.out.println(findSmallest(strs, 4));
	}
    public static String findSmallest(String[] strs, int n) {
        // write code here
    	int minIndex =0;
    	String temp = "";
    	for(int i=0;i<n;i++) {
    		minIndex = i;
    		for(int j=i;j<n;j++) {
    			if(sort(strs[minIndex], strs[j])==strs[j]) {
    				minIndex = j;
    			}
    		}
    		temp = strs[i];
    		strs[i] = strs[minIndex];
    		strs[minIndex] = temp;
    	}
    	StringBuilder stringBuilder = new StringBuilder();
    	for(int i=0;i<n;i++) {
    		stringBuilder.append(strs[i]);
    	}
    	return stringBuilder.toString();
    }
    public static String sort(String a,String b) {
    	return (a+b).compareTo(b+a)<0?a:b;
    }
}
