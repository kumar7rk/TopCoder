package TopCoder;

import java.util.Arrays;

public class CollectingUsualPostmarks {

	public static void main(String[] args) {

		int[] prices = 
			{13,10,14,20}
//			{16,32,13,2,17,10,8,8,20,17}
		;
		int[] have = 
			{3,0,2,1}
//			{7,0,4,1,6,8}
		;
		int res = numberOfPostmarks(prices,have);
		System.out.println(res);
	}

	public static int numberOfPostmarks(int[] prices, int[] have) {
		int res = 0;
		int sum = 0;
		
		for (int i : have) sum += prices[i];

		Arrays.sort(prices);
		
		int price = 0;
		
		while (res<prices.length) {
			price+= prices[res];
			if (price>sum) return res;
			res++;
		}
		return res;
	}
}
