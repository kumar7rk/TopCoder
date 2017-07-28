package TopCoder;

public class WidgetRepairs {

	public static void main(String[] args) {
		int[] arrivals = 
//			{ 100, 100 }
			{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }
		;
		int numPerDay = 3;
		int res = days(arrivals,numPerDay);
		System.out.println(res);
	}

	public static int days(int[] arrivals, int numPerDay) {
		int rem = 0;
		int count = 0;
		for (int i = 0; i < arrivals.length; i++) {
			rem += arrivals[i];
			if (rem!=0) count++;
			rem-=numPerDay;
			rem = Math.max(rem, 0);
		}
		count+=rem/numPerDay;
		if (rem%numPerDay>0) count++;
		return count;
	}
}