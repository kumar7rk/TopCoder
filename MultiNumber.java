package TopCoder;

public class MultiNumber {

	public static void main(String[] args) {
		int number = 2001;
		String res = check(number);
		System.out.println(res);
	}
	public static String check(int number) {
		String s = number+"";
		String first = "";
		String second = "";
		for (int i = 1; i < s.length(); i++) {
			first = s.substring(0,i);
			second = s.substring(i,s.length());
			double first_product = product(first);
			double second_product = product(second);
			if(first_product==second_product) return "YES";
		}
		return "NO";
	}
	private static double product(String s) {
		double product = 1;
		for (char c : s.toCharArray()) product *= (c-'0');
		return product;
	}

}
