package TopCoder;

public class BearNSWE {

	public static void main(String[] args) {
		int[]a ={34, 28, 44, 37, 50, 13, 41, 14, 41, 23};
		String dir = "WEENSEEWWN";
		double totalDistance = totalDistance(a,dir);
		System.out.println(totalDistance);
	}

	private static double totalDistance(int[] a, String dir) {
		int x = 0;
		int y = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			char c = dir.charAt(i);
			if (c=='N') x+=a[i];
			else if (c=='S')x-=a[i];
			else if (c=='E')y+=a[i];
			else if (c=='W')y-=a[i];
		}
		return ((sum)+Math.sqrt(x*x+y*y));
	}

}
