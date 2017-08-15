package TopCoder;

public class LongMansionDiv2 {

	public static void main(String[] args) {
		int M = 1000000000;
		int[]t = {1000};
		long res = minimalTime(M,t);
		System.out.println(res);
	}
	public static long minimalTime(int M, int[] t) {
		long min = Long.MAX_VALUE;
		int loc = 0;
		for (int i = 0; i < t.length; i++) {
			if (min>t[i]) {
				min = t[i];
				loc = i;
			}
		}
		long res = min*M;
		for (int i = 0; i < t.length; i++) {
			if (i==loc) continue;
			res+=t[i];
		}
		return res;
	}
}
