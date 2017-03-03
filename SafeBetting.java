package TopCoder;

public class SafeBetting {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 999;
		System.out.println(minRounds(a,b,c));

	}

	private static int minRounds(int a, int b, int c) {
		int B = 0;
		int bet_amount = 0;
		while (b<c) {
			bet_amount = b-a;//5
			b += bet_amount;//25
			B++;
		}
		return B;
	}

}
