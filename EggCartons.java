package TopCoder;

public class EggCartons{
	public static void main(String[] args){
		int n = 60;
		int res = minCartons(n);
		System.out.println(res);
	}
	public static int minCartons(int n){
		if (n<6) return -1;
		int cartons = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= 12; i++) {
			for (int j = 0; j <= 16; j++) {
				cartons = i*8 + j*6;
				if (cartons == n) min = Math.min(min, i+j);
			}
		}
		if (min==Integer.MAX_VALUE) return -1;
		return min;
	}
}