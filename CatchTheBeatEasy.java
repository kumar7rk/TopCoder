package TopCoder;

public class CatchTheBeatEasy {

	public static void main(String[] args) {
		int[] x = {-1, 1, 0};
		int [] y = {1, 3, 4};
		String res = ableToCatchAll(x,y);
		System.out.println(res);
	}
	public static String ableToCatchAll(int[] x, int[] y) {
		int tempY = 0;
		int tempX = 0;
		for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				if (y[i]>y[j]) {
					tempY = y[i];
					y[i] = y[j];
					y[j] = tempY;
					tempX = x[i];
					x[i] = x[j];
					x[j] = tempX;
				}
			}
		}
		int s = 0;
		int t = 0;
		for (int i = 0; i < y.length; i++) {
			if (y[i]-s<Math.abs(x[i]-t)) return "Not able to catch";
			s=y[i];
			t=x[i];
		}
		return "Able to catch"; 
	}
}
