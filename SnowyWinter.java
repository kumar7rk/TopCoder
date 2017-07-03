package TopCoder;

public class SnowyWinter {

	public static void main(String[] args) {

		int[] startPoints = {45,100,125,10,15,35,30,9};
		int[] endPoints = {46,200,175,20,25,45,40,10};
		int res = snowyHighwayLength(startPoints,endPoints);
		System.out.println(res);
	}

	public static int snowyHighwayLength(int[] startPoints, int[] endPoints) {
		int[] val = new int[10001];
		int res = 0;
		for (int i = 0; i < startPoints.length; i++) 
			for (int j = startPoints[i]; j <endPoints[i]; j++) 
				val[j] = 1;
		for (int i : val) res+=i;
		return res;
	}
}