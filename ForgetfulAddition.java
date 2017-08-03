package TopCoder;

public class ForgetfulAddition {

	public static void main(String[] args) {
		String expression = "67847587";
		int result = minNumber(expression);
		System.out.println(result);
	}
	public static int minNumber(String expression) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < expression.length()-1; i++) {
			String s1 = expression.substring(0,i+1);
			String s2 = expression.substring(i+1);
			Integer i1 = Integer.parseInt(s1);
			Integer i2 = Integer.parseInt(s2);
			int sum = i1+i2;
			if (sum<result) {
				result = sum;
			}
		}
		return result;
	}
}
