package TopCoder;

import java.util.Arrays;

public class SwapAndArithmetic {

	public static void main(String[] args) {
		int[] x = {7,3,11,5,1,9};
		String res = able(x);
		System.out.println(res);
	}

	public static String able(int[] x) {
		Arrays.sort(x);
		int d = x[1]-x[0];
		for (int i = 1; i < x.length-1; i++) {
			int d1 = x[i+1]-x[i];
			if (d!=d1) return "Impossible";
		}
		return "Possible";
	}

}
