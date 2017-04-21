package TopCoder;

public class FoxProgression {

	public static void main(String[] args) {
		int[] seq = {1,1};
		int res = theCount(seq);
		System.out.println(res);
	}

	public static int theCount(int[] seq) {

		int count=0;
		boolean A = true;
		boolean G = true;

		if (seq.length==1) return -1;

		int diff = seq[1]-seq[0];
		for (int i = 0; i < seq.length-1; i++) {
			if (diff==0 || seq[i]+diff != seq[i+1]) {
				A= false;
				break;
			}
		}

		int mul = seq[1]/seq[0];
		for (int i = 1; i <seq.length; i++) {
			if (seq[i]!= mul*seq[i-1]) {
				G = false;
				break;
			}
		}
		if (A) count++;
		if (G) count++;
		System.out.println(A + " " + G);
		return count;
	}
}