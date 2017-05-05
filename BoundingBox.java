package TopCoder;

import java.util.Arrays;

public class BoundingBox {

	public static void main(String[] args) {
		int[] X = {0,0,1,0,-1,2};
		int[] Y = {0,1,2,-2,0,-1};
		int res = smallestArea(X,Y);
		System.out.println(res);
	}

	public static int smallestArea(int[] X, int[] Y) {
		
		Arrays.sort(X);
		Arrays.sort(Y);
		int x = X[X.length-1] - X[0];
		int y = Y[Y.length-1] - Y[0];
		return	x*y;
	}

}
