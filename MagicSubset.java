package TopCoder;

public class MagicSubset{
	public static void main(String []args){
		int[] values = 
			{-38, 76, 4, 79, -26, -23, 6, -73, 92, -44, 13, -38, -39, -100, 6, 86, -66, -71, 82, -100, -29, 84, 65, -40, -48, 97, -22, 10, -67, 86, -76, -32, -9, 83, -30, 70, 61, -76, -40, -32, -26, -61, -88, 89, -31, 57, -91, 80, 66, 95}			;
		int res = findBest(values);
		System.out.println(res);
	}	
	public static int findBest(int[] values){
		
		int res = 0;
		int res1 = 0;
		int res2 = values[0];
		for (int i = 1; i < values.length; i++) {

			int val = values[i];
			if (val>0) {
				res1 += val;
			}
			if (val<0) {
				res2 += val;
			}
		}
//		res1 -= values[0];
		res2 = -1*res2;
		
		res = res1>res2? res1: res2;
			return res;
	}
}