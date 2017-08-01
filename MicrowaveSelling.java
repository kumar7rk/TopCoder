package TopCoder;
public class MicrowaveSelling {
	public static void main(String[] args) {
		int minPrice = 1;
		int maxPrice = 9198;
		int res = mostAttractivePrice(minPrice, maxPrice);
		System.out.println(res);
	}
	public static int mostAttractivePrice(int minPrice, int maxPrice){
		int max = 0;
		int bestPrice = 0;
		for (int i = minPrice; i <= maxPrice; i++) {
			int count = endsWithNine(new String(i+""));
			if (max <= count) {
				max = count;
				bestPrice = i;
			}
		}
		return bestPrice;
	}
	public static int endsWithNine(String s){
		if (!s.endsWith("9")) return 0;
		else return 1 + endsWithNine(s.substring(0,s.length()-1));
	}
}
