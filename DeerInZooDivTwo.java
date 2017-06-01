package TopCoder;

public class DeerInZooDivTwo {

	public static void main(String[] args) {
		int N = 10;
		int K = 0;
		int res[] = getminmax(N,K);
		for (int i : res) {
			System.out.print(i+ " ");
		}
	}

	public static int[] getminmax(int N, int K) {
		int res[] = new int[2];
		res[0] = N>K ? N-K : 0;
		res[1] = N-(K+1/2);
		return res;
	}
}
