package bat.String;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
    	char[] a = iniString.toCharArray();
    	StringBuilder str = new StringBuilder();
    	for (char c : a) {
			if(c!=' ') {
				str.append(c);
			}else {
				str.append("%20");
			}
		}
    	return str.toString();
    }
}
