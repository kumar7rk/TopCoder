package TopCoder;

public class ReversedSum {

	public static void main(String[] args) {
		int x = 456;
		int y = 789;
		int res = getReversedSum(x,y);
		System.out.println(res);
	}

	public static int getReversedSum(int x, int y) {
		int rev = 0;
		int rev1 = 0;
		int rev2 = 0;
		
		while (x!= 0){
		    rev = rev*10 + x % 10;
		    x /= 10;
		}
		while (y != 0){
		    rev1 = rev1*10 + y % 10;
		    y /= 10;
		}
		int sum = rev+rev1;
		while (sum != 0){
		    rev2 = rev2*10 + sum % 10;
		    sum /= 10;
		}
		
		return rev2;
	}

}
