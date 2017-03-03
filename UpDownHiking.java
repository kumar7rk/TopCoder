package TopCoder;

public class UpDownHiking {

	public static void main(String[] args) {
		int N = 50;
		int A = 49;
		int B = 42;
		int result = maxHeight(N,A,B);
		System.out.println(result);
	}

	public static int maxHeight(int n, int a, int b) {
		int max = 0;
		for (int i = 0; i < n; i++) {

			max = Math.max(max, Math.min(i*a, (n-i)*b));
		}
		return max;
	}
	

}
