package topCoderV1dot1;

public class Arrfix {

	public static void main(String[] args) {
		int[]A = {1,1,1};
		int[]B = {2,2,2};
		int[]F = {2};
		int result = mindiff(A,B,F);
		System.out.println(result);
		
	}

	private static int mindiff(int[] a, int[] b, int[] f) {
		int n = a.length;
		boolean[] usedF = new boolean[f.length];
		int diff = 0;
		int fLeft = f.length;

		// for loop for the length of Array A
		for (int i = 0; i < n; i++) {
			// if i index of both array not equal
			if (a[i]!=b[i]) {
//				find the index value where i index of b and f are equal; 
				int fIndex = infexOf(f,usedF,b[i]);
				// if they are not equal then set the boolean f value at that index to be true 
				// and decrement number of f values left;
				if (fIndex>-1) {
					usedF[fIndex] = true;
					fLeft--;
				}
				// otherwise increment difference value
				else diff++;
			}
		}// end of for loop

		// if(after for loop) fLeft is still > 0, then check if i index value if a and b are equal
		// if yes then do the same process stop at any time the value of fLeft is equal to 0
		if (fLeft > 0) {
			for (int i = 0; i < n; i++) {
				if (a[i]==b[i]) {
					int fIndex = infexOf(f, usedF, b[i]);
					if (fIndex>-1) {
						usedF[fIndex] = true;
						fLeft--;
					}
				}
				if (fLeft==0) {
					break;
				}
			}
		}
		// return max of (if fLeft > 0-->fLeft) and diff  
		return Math.max(diff, fLeft);
	}
	private static int infexOf(int[] f, boolean[] usedF, int number) {
		for (int i = 0; i < f.length; i++) {
			if (f[i] == number && !usedF[i]) {
				return i;
			}
		}
		return -1;
	}

}
