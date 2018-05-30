package StackAndQuene;

public class TwoStack {
	public static void main(String[] args) {
		/*TwoStack stackQuene = new TwoStack();
		stackQuene.put(1);
		stackQuene.put(2);
		stackQuene.put(3);
		stackQuene.pop();
		stackQuene.put(4);
		stackQuene.pop();*/
		
	}
	
		private int[] stackPut = new int[100];
		private int[] stackPop = new int[100];
		private int putIndex = 0;
		private int popIndex = 0;
		
		public void put(int node) {
			stackPut[putIndex++] = node;
		}
		public int pop() {
			if(popIndex==0) {
				while(putIndex>0) {
					stackPop[popIndex++] = stackPut[--putIndex];
				}
			}
			return stackPop[--popIndex];
		}
    public int[] twoStack(int[] ope, int n) {
    	int length = 0;
    	for(int i=0;i<n;i++) {
    		if(ope[i]==0) {
    			length++;
    		}
    	}
    	int[] result = new int[length];
        // write code here
    	for(int i=0,j=0;i<n;i++) {
    		if(ope[i]!=0) {
    			this.put(ope[i]);
    		}else {
    			result[j] = this.pop();
    			j++;
    		}
    	}
    	return result;
    }
}
