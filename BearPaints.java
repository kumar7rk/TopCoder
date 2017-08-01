package TopCoder;

public class BearPaints {
	public static void main(String[] args) {
		int W = 99678;
		int H = 93467;
		long M = 1999444332L;
		long result = maxArea(W,H,M);
		System.out.println(result);
	}
	public static long maxArea(int w, int h, long m) {
		long max = 0;
		for (int i = w,count = 0; i >0 && count<10000 ; i--){
			max = Math.max(Math.min(h,(m/i))*i, max);
			count++;
		}
		return max;
	}
}