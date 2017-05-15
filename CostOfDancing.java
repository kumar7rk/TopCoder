package TopCoder;

import java.util.Arrays;

public class CostOfDancing {

	public static void main(String[] args) {
		int K = 2;
		int[] danceCost =
				{1, 5, 3, 4}
;
		int res = minumum(K,danceCost);
		System.out.println(res);
	}

	public static int minumum(int K, int[] danceCost) {
		Arrays.sort(danceCost);
		int sum = 0;
		for (int i = 0; i < K; i++) 
			sum+=danceCost[i];
		return sum;
	}

}
