package TopCoder;

import icsV1dot1.Time;

public class MultiNumber {

	public static void main(String[] args) {
		int number = 4729382;
		Time.startTime();
		String res = check(number);
		Time.endTime();
		System.out.println(res);
	}

	public static String check(int number) {
		int count = 0;
		String s = number+"";
		for (char c : s.toCharArray()) 
			if (c=='0') count++;
		if (count>0&&count%2==0) return "YES";
		int len = (int)Math.log10(number);
		int first = 0;
		int second = 0;
		for (int i = len; i >0; i--) {
			first = (int) (number/Math.pow(10, i));
			second = (int) (number%Math.pow(10, i));
//			System.out.println(first + " " + second);
			double first_product = product(first);
			double second_product = product(second);
//			System.out.println(first_product + " " + second_product);
			if(first_product==second_product) return "YES";
		}
		return "NO";
	}
	private static double product(int num) {
		
		/*int len = (int)Math.log10(num);
		double p = 1;
		for (int i = len; i >0; i--) {
			p *= (int)num%Math.pow(10, i);
		}*/
		String s = num+"";
		double product = 1;
		for (char c : s.toCharArray()) product *= (c-'0');
		return product;
//		return p;
	}

}
