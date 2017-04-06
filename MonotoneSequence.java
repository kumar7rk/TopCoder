package TopCoder;

public class MonotoneSequence {

	public static void main(String[] args) {

		int[] seq = {1};
		int res = longestMonotoneSequence(seq);
		System.out.println(res);
	}
	public static int longestMonotoneSequence(int[] seq){

		int max1 = 1;
		int max2 = 1;
		int countI = 1;
		int countD = 1;
		/*if (seq.length==1) {
			return 1;
		}*/
		for (int i = 0; i < seq.length-1; i++) {
			int current = seq[i];
			int next = seq[i+1];
			if (current<next) {
				countI++;
			}
			else {
				countI=1;
			}
			max1 = max1<countI?countI:max1;
		}
		
		for (int i = 0; i < seq.length-1; i++) {
			int current = seq[i];
			int next = seq[i+1];
			if (current>next) {
				countD++;
			}
			else {
				countD=1;
			}
			max2 = max2<countD?countD:max2;
		}
		System.out.println(max1+ " " + max2);
		return Math.max(max1, max2);
	}

}
