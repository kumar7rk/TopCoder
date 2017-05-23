package TopCoder;

import java.util.Arrays;

public class CucumberMarket {

	public static void main(String[] args) {
		int[] price = 
//			{1000,1,10,100}
			{33,4}
		;
		int budget = 33;
		int k = 1;
		String res = check(price,budget,k);
		System.out.println(res);
	}

	public static String check(int[] price, int budget, int k) {
		Arrays.sort(price);
		int sum = 0;
		for (int i = price.length-1; i>=price.length-k; i--) {
//			System.out.println(i);
			sum+=price[i];
//			System.out.println(sum);
			if (sum>budget) return "No";
		}
		return "Yes";
	}

}
