package TopCoder;

import java.util.Arrays;

public class CatchTheBeatEasy {

	public static void main(String[] args) {
		int[] x = {-1, 1, 0};
		int [] y = {1, 3, 4};
		String res = ableToCatchAll(x,y);
		System.out.println(res);
	}
	public static String ableToCatchAll(int[] x, int[] y) {
//		int minY = y[0];
		int locY = 0;
		int current = 0;
		boolean b[] = new boolean[x.length];
		Arrays.fill(b, false);
		int count = 0;
		while(count<x.length){
			int minY = Integer.MAX_VALUE;
			// we have the next smallest value of y
			for (int i = 0; i < y.length; i++) {
				if (minY>y[i]&&!b[i]) {
					b[0] = true; 
					minY = y[i];
					locY = i;
					b[i] = true;
				}
			}
			System.out.println("Smallest y value is "+minY);
			// get the corresponding x value and then use the formula
			int diff = Math.abs(current-x[locY]);
			System.out.println(diff+ " " + y[locY]);
			if (diff<y[locY]-count) return "Not able to catch";
			else {
				current = x[locY];
			}
			count++;
		}
		return "Able to catch"; 
	}
}
