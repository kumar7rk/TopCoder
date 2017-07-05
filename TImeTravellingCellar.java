package TopCoder;

public class TImeTravellingCellar {

	public static void main(String[] args) {
		int[] profit = {1,2,3};
		int[] decay = {3,1,2};

		int res = determineProfit(profit, decay);
		System.out.println(res);

	}

	public static int determineProfit(int[] profit, int[] decay) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < profit.length; i++) {
			for (int j = 0; j < decay.length; j++) {
				if (i==j) continue;
				if (profit[i]-decay[j]>max) {
					max = profit[i]-decay[j];
				}
			}
		}
		return max;
	}

}
