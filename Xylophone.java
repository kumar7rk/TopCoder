package TopCoder;

public class Xylophone {

	public static void main(String[] args) {
		int[] keys = {33, 25, 17, 20, 43, 27, 32, 33, 21, 13, 48, 6, 15, 30, 33, 6, 13, 31, 7, 41, 36, 23, 38, 15, 49, 
			 23, 25, 4, 13, 22, 42, 49, 8, 23, 35, 49, 29, 11, 35, 11, 27, 6, 21, 8, 48};
		int result = countKeys(keys);
		System.out.println(result);
	}
	public static int countKeys(int[] keys) {
		int counter = keys.length;
		for (int i = 0; i < keys.length; i++) {
			k:
			for (int j = i+1; j < keys.length; j++) {
				if (keys[i] == keys[j]) {
					counter--;
					break;
				}
				for (int k = 7; k < 50; k=k+7) {
					if (keys[i]+k == keys[j] || keys[j]+k == keys[i]) {
						counter--;
						break k;
					}
				}
			}
		}
		return counter;
	}
}
