package TopCoder;

public class ReversedSum {

	public static void main(String[] args) {
		int x = 456;
		int y = 789;
		int res = getReversedSum(x,y);
		System.out.println(res);
	}

	public static int getReversedSum(int x, int y) {
		int rev = reverse(x);
		int rev1 = reverse(y);
		int sum = rev+rev1;
		int res = reverse(sum);
		return res;
	}
	private static int reverse(int num){
		int r = 0;
		while (num!= 0){
		    r = r*10 + num % 10;
		    num /= 10;
		}
		return r;
	}
}