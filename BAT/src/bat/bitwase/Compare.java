package bat.bitwase;

public class Compare {
	public int flip(int n) {
        return n ^ 1;
    }
 
    public int sign(int n) {
        return flip((n >> 31) & 1);
    }
 
    public int getMax(int a, int b) {
        int c = a - b;
        int sa = sign(a);
        int sb = sign(b);
        int sc = sign(c);
        int difSab = sa ^ sb;
        int sameSab = flip(difSab);
        int returnA = difSab * sa + sameSab * sc;
        int returnB = flip(returnA);
        return a * returnA + b * returnB;
    }
}
