package TopCoder;
public class SwimmersDelight {
	public static void main(String[] args) {
		int[] x = {1, 5};
		int[] y = {0, 10};
		int res = longestJump(x, y);
		System.out.println(res);
	}
	public static int longestJump(int[] x, int[] y) {
		int only1 = Math.max(x[0], 10-x[0]);
		int only2 = Math.max(x[1], 10-x[1]);
		double dist = Math.sqrt(Math.pow((x[1]-x[0]),2) +  Math.pow((y[1]-y[0]),2));;
		double a12 = Math.max(x[0], Math.max(dist, 10-x[1]));
		double a21 = Math.max(x[1], Math.max(dist, 10-x[0]));;
		double res = Math.min(only1, Math.min(only2, Math.min(a12, a21))); 		
		return (int) Math.round(res);
	}
}