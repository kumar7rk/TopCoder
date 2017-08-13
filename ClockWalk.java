package TopCoder;

public class ClockWalk {

	public static void main(String[] args) {
		String flips = "hthhthtththhtttthttthhhthtttthh";
		int res = finalPosition(flips);
		System.out.println(res);
	}
	public static int finalPosition(String flips) {
		int hr = 12;
		for (int i = 1; i < flips.length()+1; i++) {
			if (flips.charAt(i-1)=='h') hr+=i;
			if (flips.charAt(i-1)=='t') hr-=i;
			if (hr>12|| hr<1) hr %=12;
		}
		return hr;
	}

}
