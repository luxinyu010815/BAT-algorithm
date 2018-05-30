package bat.String;

public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverseSentence("hello my world!", 15));
	}
    public static String reverseSentence(String A, int n) {
        // write code here
    	A = exchange(A);
    	String[] split = A.split(" ");
    	int i=0;
    	StringBuilder result = new StringBuilder();
    	for (String string : split) {
			result.append(exchange(string));
			if(i<split.length-1)result.append(" ");
			i++;
		}
    	return result.toString();
    }
    
    public static String exchange(String a) {
    	int first = 0;
    	int last = a.length()-1;
    	char[] cArr = a.toCharArray();
    	char temp = ' ';
    	while(first<last) {
    		temp = cArr[first];
    		cArr[first++] = cArr[last];
    		cArr[last--] = temp;
    	}
    	return new String(cArr);
    }
}
