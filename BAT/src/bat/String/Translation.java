package bat.String;

public class Translation {
	public static void main(String[] args) {
		System.out.println(stringTranslation("abcde", 5, 2));
	}
    public static String stringTranslation(String A, int n, int len) {
        // write code here
    	String bre = A.substring(0, len );
    	String aft = A.substring(len);
    	return new StringBuilder().append(aft).append(bre).toString();
    }
}
