package bat.String;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
    	if(n%2!=0)return false;
    	int num=0;
    	for(int i=0;i<n;i++) {
    		if(n<0)return false;
    		if(A.charAt(i)=='(') {
    			num++;
    		}else if(A.charAt(i)==')'){
    			num--;
    		}
    	}
    	if(num==0) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
