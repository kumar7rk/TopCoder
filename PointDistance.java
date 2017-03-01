package topCoderV1dot1;

import java.util.Random;

public class PointDistance {

	public static void main(String[] args) {
		int x1 = 3;
		int y1 = 2;
		int x2 = 1;
		int y2 = 2;
		int[] result = findPoint(x1,y1,x2,y2);
		System.out.print(result[0]+" "+ result[1]);

	}

	private static int[] findPoint(int x1, int y1, int x2, int y2) {
		int[] result = new int[2];
		while (true) {
			Random  r = new Random();
			int range = 100-(-100)+1;
			int x3 = r.nextInt(range)-100;
			int y3 = r.nextInt(range)-100;
			double distance1 = Math.sqrt(Math.pow((x1-x3), 2)+Math.pow((y1-y3), 2));
			double distance2 = Math.sqrt(Math.pow((x2-x3), 2)+Math.pow((y2-y3), 2));
			if (distance1>distance2) {
				result[0] = x3;
				result[1] = y3;
				return result;
			}
		}
	}
	//topcoder
	public static int[] findPoint1(int x1, int y1, int x2, int y2) {
		int[]p = {(x2>x1)?x2+1:x2-1,y2};
		return p;
	}
}