package topCoderV1dot1;

public class ThreeIncreasing {

	public static void main(String[] args) {
		int a = 2789;
		int b = 2400;
		int c = 1693;
		int result = minEaten(a,b,c);
		System.out.println(result);
		
	}
	public static int minEaten(int a, int b, int c) {
		int result = 0;
		if (b<=1 || c<=2) {
			return -1;
		}

		if (b>=c) {
			result += b-c+1;
			b = c-1;
		}
		if (a>=b) {
			result += a-b+1;
		}
		return result;
	}

}
