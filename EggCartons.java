package TopCoder;

public class EggCartons{
	public static void main(String[] args){
		
		int n = 100;
		int res = minCartons(n);
		System.out.println(res);
	}
	public static int minCartons(int n){
		
		int cartons = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				cartons = i*6 + j*8;
				if (cartons == n) {
					return i+j;
				}
			}
		}
		return cartons;
	}
}