package TopCoder;

import java.util.Arrays;

public class CircleMarket {

	public static void main(String[] args) {

		int[] openTime = {999999, 2, 4};
		int[] closeTime = {1000000, 22, 44};
		int travelTime = 2;
		int res = makePurchases(openTime,closeTime,travelTime);
		System.out.println(res);
	}

	public static int makePurchases(int[] openTime, int[] closeTime, int travelTime) {
		int purchased = 0;
		int time = 0;
		int n = openTime.length;
		boolean[] b = new boolean[n];
		int[] ct = Arrays.copyOf(closeTime, n);
		Arrays.sort(ct);
		int close = ct[ct.length-1];
		while (time<=close) {
			for (int i = 0; i <n; i++) {
				if ((time>=openTime[i]&&time<=closeTime[i])&&!b[i]) {
					purchased++;
					b[i] = true;
				}
				time+=travelTime;
			}
			if ((purchased==openTime.length)) return purchased;
		}
		return purchased;
	}
}