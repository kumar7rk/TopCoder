package topCoderV1dot1;

public class Dubs {

	static int counter;
	public static void main(String[] args) {
		for (long i = 923003927863L; i <= 998207498364L; i++) {
			int rem = (int) (i%100);
			int i1 = rem/10;
			int i2 = rem%10;
			if (i1==i2) counter++;
		}
		System.out.println(counter);
	}

}
