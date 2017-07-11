package TopCoder;

public class HingedDoor {

	public static void main(String[] args) {
		int initialAngle = 76;
		int reduction = 2;
		int res = numSwings(initialAngle,reduction);
		System.out.println(res);

	}

	public static int numSwings(int initialAngle, int reduction) {
		int res = 0;
		double val = initialAngle;
		double r = reduction;
		while(val>5.0){
			val = val*(1/r); 
			res++;
		}
		return res;
	}

}
