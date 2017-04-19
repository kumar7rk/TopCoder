package TopCoder;

public class NinjaTurtles {

	public static void main(String[] args) {
		int P = 1000000;
		int K = 14;
		int res = countOpponents(P, K);
		System.out.println(res);
	}
	
	public static int countOpponents(int P, int K){
		
		for (int N = P; N <= Integer.MAX_VALUE; N++) {
			Double temp1 = Math.floor(N/K);
			temp1 *=3;
			int temp2 = N/3;
			if (temp1+temp2 > P) return -1;
			if (temp1+temp2 == P) return N;
		}
		return -1;
	}

}
