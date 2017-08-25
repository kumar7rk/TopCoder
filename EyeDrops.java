package TopCoder;

public class EyeDrops {

	public static void main(String[] args) {
		int sleepTime = 23;
		int k = 1;
		double res = closest(sleepTime,k);
		System.out.println(res);
	}
	public static double closest(int sleepTime, int k) {
		if(sleepTime>24/k) return (24-sleepTime)*60/(k-1);
		return 1440/k;
	}
}