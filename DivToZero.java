package TopCoder;

public class DivToZero {

	public static void main(String[] args) {
		int num = 23442;
		int factor = 75;
		String res = lastTwo(num,factor);
		System.out.println(res);
	}
	public static String lastTwo(int num, int factor) {
		int first = (int) (num/Math.pow(10, 2));
		int newNumber = (int) (first*Math.pow(10, 2)); 
		for (int i = newNumber;; i++) {
			System.out.println(newNumber);
			if(i%factor==0) {
				int n = (int)(i%Math.pow(10, 2));
				if((int)Math.log10(n)<=0){
					return "0"+""+n;
				}
				else
					return n+"";
			}
		}
	}

}
