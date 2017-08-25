package TopCoder;

import java.util.Arrays;

public class InverseFactoring {

	public static void main(String[] args) {
		int[] factors = {14,26456,2,28,13228,3307,7,23149,8,6614,46298,56,4,92596};
		int res = getTheNumber(factors);
		System.out.println(res);
	}
	public static int getTheNumber(int[] factors) {
		Arrays.sort(factors);
		return factors[0]*factors[factors.length-1];
	}
}