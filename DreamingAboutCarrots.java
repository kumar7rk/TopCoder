package TopCoder;

public class DreamingAboutCarrots {

	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 1;
		int x2 = 5;
		int y2 = 5;
		int res = carrotsBetweenCarrots(x1, x2, y1, y2);
		System.out.println(res);
	}
	public static int carrotsBetweenCarrots(int x1, int y1, int x2, int y2) {
		return gcd(Math.abs(x2-x1),Math.abs(y1-y2))-1;
	}
	private static int gcd(int a, int b) {
		if (b==0) return a; 
		else return gcd(b,a%b);
	}
}