package TopCoder;

	public class CandyShop {

	public static void main(String[] args) {
		int[] X = {2,3};
		int[] Y = {1,-1};
		int[] R = {2,2};
		int res = countProbablePlaces(X, Y, R);
		System.out.println(res);
	}

	public static int countProbablePlaces(int[] X, int[] Y, int[] R) {
		
		int res = 0;
		for (int x = -200; x <= 200; x++) {
			for (int y = -200; y <= 200; y++) {
				boolean flag = true;
				for (int i = 0; i < R.length; i++){
					if (Math.abs(X[i]-x) + Math.abs(Y[i]- y) > R[i]){
						flag = false;
						break; 
					}
				}
				if (flag) res++;
			}
		}
		return res;
	}
}

/*
 * 		int res = 0;
		for (int x = -200; x <= 200; x++) {
			for (int y = -200; y <= 200; y++) {
				int i;
				// making sure the point is good for all the x and y values
				for (i = 0; i < R.length; i++){
					
					if (Math.abs(X[i]-x) + Math.abs(Y[i]- y) > R[i]) break; 
				}
				// checking if i ran for all the points, because if it did it would mean it is a common point
				// if it did not then that means it is not
				if (i == R.length) res++;
			}
		}
		return res;
		*/
