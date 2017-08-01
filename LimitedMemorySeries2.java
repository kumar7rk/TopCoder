package TopCoder;

public class LimitedMemorySeries2 {

	public static void main(String[] args) {
		int n = 6;
		long x0 = 2;
		long a = 23;
		long b = 1;
		int sum = getSum(n,x0,a,b);
		System.out.println(sum);
	}

	public static int getSum(int n, long x0, long a, long b) {
		int[] X = new int[n]; 
		X[0] = (int) x0;
		for (int i = 1; i <= n-1; i++) X[i] =(int) ((X[i-1] ^ a) + b) & (int) ((Math.pow(2, 50)-1));
		return 0;
	}

}
