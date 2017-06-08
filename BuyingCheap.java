package TopCoder;

import java.util.ArrayList;
import java.util.Collections;

public class BuyingCheap {

	public static void main(String[] args) {
		int[] prices = 
			{10, 10, 10, 10, 20, 20, 30, 30, 40, 40}
		;
		int res = thirdBestPrice(prices);
		System.out.println(res);
	}

	public static int thirdBestPrice(int[] prices) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer integer : prices) 
			if (!arrayList.contains(integer)) arrayList.add(integer);
		Collections.sort(arrayList);
		if (arrayList.size()<3) return -1;
		return arrayList.get(2);
	}
}