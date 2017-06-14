package TopCoder;

public class ImageCompression {

	public static void main(String[] args) {
		String[] image = {"0011", "0011", "1100", "1100", "0000", "0000" };
		int k = 2;
		String res = StringisPossible(image,k);
		System.out.println(res);
	}

	public static String StringisPossible(String[] image, int k) {
		int n = image.length;
		int m = image[0].length();
		for (int i = 0; i < n; i +=k) {
			for (int j = 0; j < m; j+=k) {
				int black = 0;
				int white = 0;
				for (int r = i; r < i+k; r++) {
					for (int c = j; c < j+k; c++) {
						if (image[r].charAt(c)=='0') black++;
						else white++;
					}
				}
				if (white != 0&& black!=0) return "Impossible";
			}
		}
		return "Possible";
	}
}
