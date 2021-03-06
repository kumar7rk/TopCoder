package TopCoder;

import icsV1dot1.Time;

public class CountryGroup {

	public static void main(String[] args) {
		Time.startTime();
		int[]a = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		int result = solve(a);
		System.out.println(result);
		Time.endTime();
	}

	public static int solve(int[] a) {
		int counter = 0;
		for (int i = 0; i < a.length;i++) {
			for (int j = i+1; j < i+a[i]; j++) 
				if (j>=a.length || a[j]!=a[i]) return -1;
			i += a[i]-1;
			counter++;
		}
		return counter;
	}
}
