package TopCoder;

public class SafeBetting {

	public static void main(String[] args) {
		int a = 15, b = 20, c = 48;
		SafeBetting s = new SafeBetting();
		System.out.println(s.minRounds(a,b,c));

	}

	public int minRounds(int a, int b, int c) {
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
